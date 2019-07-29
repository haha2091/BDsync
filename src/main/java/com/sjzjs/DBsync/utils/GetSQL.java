package com.sjzjs.DBsync.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.Logger;

public class GetSQL {

	public static String GetSQL(String name,Logger logger) {
		Properties properties = null;
		try {
			FileInputStream in = new FileInputStream("sqls.xml");
			properties = new Properties();
			properties.loadFromXML(in);
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return properties.getProperty(name);
	}
}
