package com.appiumframework;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class PropertyManager {
		private Properties properties;

		public PropertyManager() {
			try {
			String filePathToObjectRepository = System.getProperty("user.dir") + "/src/main/java/resources/config.properties";
			File fileObject = new File(filePathToObjectRepository);
			FileInputStream fileStream = new FileInputStream(fileObject);
			properties = new Properties();
			properties.load(fileStream);
			} catch(Exception e) {
				
			}
		}

		public String getValue(String key) {
			return properties.getProperty(key);
		}
}


