package com.trello.qsp.genericutility;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String readTheDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/trellodata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
}
