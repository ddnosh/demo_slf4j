package com.androidwind.demo.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class LoggerTest {

	static Integer oldT = 50;

	private static Logger logger = LoggerFactory.getLogger(LoggerTest.class);

	public static void main(String[] args) {
		logger.info("Current Time: {}", System.currentTimeMillis());
		logger.info("Current Time: " + System.currentTimeMillis());
		logger.trace("this is trace log");
		logger.warn("this is warn log");
		logger.debug("this is debug log");
		logger.info("this is info log");
		logger.error("this is error log");
		setTemperature(51);
	}

	private static void setTemperature(Integer temperature) {
		logger.debug("Temperature set to {}. Old temperature was {}.", temperature, oldT);
		if (temperature.intValue() > 50) {
			logger.info("Temperature has risen above 50 degrees.");
		}
	}
}
