package com.nhb.api.utils;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.nhb.api.master.Stats;
import com.nhb.api.master.ability.Ability;
import com.nhb.api.master.ability.AbilityService;
import com.nhb.api.master.abilitytype.AbilityType;
import com.nhb.api.master.abilitytype.AbilityTypeService;
import com.nhb.api.master.positional.Positional;
import com.nhb.api.master.positional.PositionalService;
import com.nhb.api.master.race.Race;
import com.nhb.api.master.race.RaceService;

@Service
public class Utils {
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Autowired
	private RaceService raceService;
	
	@Autowired
	private AbilityService abilityService;
	
	@Autowired
	private AbilityTypeService abilityTypeService;
	
	@Autowired
	private PositionalService positionalService;
	
	@PostConstruct
	private void init() {
		this.resetDB();
		this.insertAbilities();
		this.insertRaces();
		this.insertPositionals();
	}

	private void resetDB() {
		mongoTemplate.getDb().dropDatabase();
	}
	
	private Stats getStats(JSONObject obj){
		Stats stats = new Stats();
		stats.setAgility(Integer.parseInt(obj.get("agility").toString()));
		stats.setStrength(Integer.parseInt(obj.get("strength").toString()));
		stats.setMovement(Integer.parseInt(obj.get("movement").toString()));
		stats.setArmor(Integer.parseInt(obj.get("armor").toString()));
		return stats;
	}
	
	private List<AbilityType> extractAbilityTypes(JSONArray jsonArray){
		List<AbilityType> normalAbilityTypes = new ArrayList<AbilityType>();
		for( Object ability : jsonArray){
			normalAbilityTypes.add(abilityTypeService.findByName(ability.toString()).get(0));
		}
		return normalAbilityTypes;
	}
	
	private List<Ability> extractAbilities(JSONArray jsonArray){
		List<Ability> normalAbilityTypes = new ArrayList<Ability>();
		for( Object ability : jsonArray){
			Ability ab = abilityService.find(null, ability.toString(), null, null).getContent().get(0);
			normalAbilityTypes.add(ab);
		}
		return normalAbilityTypes;
	}
	private void insertPositionals(){
		JSONParser parser = new JSONParser();
		try {
			File file = ResourceUtils.getFile("src/main/resources/data/positionals.json");
			Object obj = parser.parse(new FileReader(file));
			JSONArray jsonArray = (JSONArray) obj;
			for (Object ob : jsonArray) {
				JSONObject job = (JSONObject) ob;
				Positional positional = new Positional();
				positional.setName(job.get("name").toString());
				positional.setCost(Integer.parseInt(job.get("cost").toString()));
				JSONArray normalAbilities = (JSONArray) job.get("normalAbilityTipes");
				positional.setNormalAbilityTipes(extractAbilityTypes(normalAbilities));
				JSONArray doubleAbilities = (JSONArray) job.get("doubleAbilityTipes");
				positional.setNormalAbilityTipes(extractAbilityTypes(doubleAbilities));
				JSONArray baseAbilities = (JSONArray) job.get("baseAbilities");
				positional.setBaseAbilities(extractAbilities(baseAbilities));
				positional.setStats(getStats((JSONObject)job.get("stats")));
				System.out.println("positional: "+positional.toString());
				positionalService.add(positional);
			}
		}
		catch(Exception e){
			
		}
	}
	
	private void insertRaces(){
		JSONParser parser = new JSONParser();
		try {
			File file = ResourceUtils.getFile("src/main/resources/data/races.json");
			Object obj = parser.parse(new FileReader(file));
			JSONArray jsonArray = (JSONArray) obj;
			for (Object ob : jsonArray) {
				JSONObject job = (JSONObject) ob;
				Race race = new Race();
				race.setName(job.get("name").toString());
				race.setRerollCost(Integer.parseInt(job.get("reroll").toString()));
				race.setMedic(Boolean.parseBoolean(job.get("medic").toString()));
				raceService.add(race);
				System.out.println("adding: "+race);
			}
		}
		catch(Exception e){
			
		}
	}

	private void insertAbilities() {
		JSONParser parser = new JSONParser();
		try {
			File file = ResourceUtils.getFile("src/main/resources/data/abilitytipes.json");
			Object obj = parser.parse(new FileReader(file));
			JSONArray jsonArray = (JSONArray) obj;
			for (Object ob : jsonArray) {
				JSONObject job = (JSONObject) ob;
				AbilityType abilityType = new AbilityType(job.get("name").toString());
				abilityTypeService.add(abilityType);
				System.out.println("adding: "+abilityType);
				File abilityFile = ResourceUtils.getFile("src/main/resources/data/"+abilityType.getName()+"abilities.json");
				Object abilitiesParser = parser.parse(new FileReader(abilityFile));
				JSONArray abilitiesArray = (JSONArray) abilitiesParser;
				for (Object ability : abilitiesArray) {
					JSONObject abilityJSON = (JSONObject)ability;
					Ability skill = new Ability();
					skill.setAbilityType(abilityType);
					skill.setName(abilityJSON.get("name").toString());
					System.out.println("object: "+abilityJSON);
					skill.setDescription(abilityJSON.get("description").toString());
					abilityService.add(skill);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
