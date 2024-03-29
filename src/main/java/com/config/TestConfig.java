package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

import com.util.CommonMethord;
import org.apache.log4j.Logger;

public class TestConfig {
	private Properties propertie;
	private FileInputStream inputfile;

	private static Logger log = Logger.getLogger("DriverManage");
	// 读取配置文件
	public TestConfig(String filepath) {
		try {
			filepath = GetTestProperties.class.getClassLoader().getResource("")
					.toURI().getPath()
					+ filepath;

			try {
				filepath = CommonMethord.convertFilepath(filepath);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		propertie = new Properties();
		try {
			inputfile = new FileInputStream(filepath);
			propertie.load(inputfile);
			inputfile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 得到对应key的值
	public String getValue(String key) {
		if (propertie.containsKey(key)) {
			String value = propertie.getProperty(key);
			log.info(value);
			return value;
		} else
			return "";
	}
}
