package com.nhb.api.utils;

import java.io.File;
import java.io.FileReader;

import javax.annotation.PostConstruct;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.nhb.api.master.ability.Ability;
import com.nhb.api.master.ability.AbilityService;
import com.nhb.api.master.abilitytype.AbilityType;
import com.nhb.api.master.abilitytype.AbilityTypeService;
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

	@PostConstruct
	private void init() {
		this.resetDB();
		this.insertRaces();
	}

	private void resetDB() {
		mongoTemplate.getDb().dropDatabase();
	}

	private void insertRaces() {
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
