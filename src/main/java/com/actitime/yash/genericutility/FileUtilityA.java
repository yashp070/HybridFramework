package com.actitime.yash.genericutility;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class FileUtilityA {

	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/actitime.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
}
