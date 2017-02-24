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

@Service
public class Utils {
	@Autowired
	private MongoTemplate mongoTemplate;

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
			File file = ResourceUtils.getFile("src/main/resources/data/races.json");
			Object obj = parser.parse(new FileReader(file));
			JSONArray jsonArray = (JSONArray) obj;
			for (Object ob : jsonArray) {
				JSONObject job = (JSONObject) ob;
				System.out.println(job.get("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
