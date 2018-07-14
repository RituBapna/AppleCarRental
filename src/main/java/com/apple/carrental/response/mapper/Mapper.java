package com.apple.carrental.response.mapper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import com.apple.carrental.bean.Car;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Mapper {

	public static Map<String, Car> getJsonArrayToMap() throws FileNotFoundException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();

		// Path to the json file
		String workingDir = System.getProperty("user.dir");
		String filePath = "/src/test/resources";

		/* 
		 * Read json file and append data to StringBuilder object
		 * converting json response to string
		 *  
		 * */
		 
		StringBuilder content = new StringBuilder();
		Path path = FileSystems.getDefault().getPath(workingDir + filePath, "response.json");
		try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			br.lines().forEach(content::append);
		}
		String data = content.toString();
		
		/*
		 * Converting josn string to Map object
		 * @return carMap
		 */

		Map<String, Car> carMap = objectMapper.readValue(data, new TypeReference<Map<String, Car>>() {
		});
		return carMap;
	}

}
