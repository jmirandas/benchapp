package com.benchapp.services;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service(value="logService")
public class Log4j {
	
	private Logger logger;

	/**
	 * @return the logger
	 */
	public Logger getLogger() {
		return logger;
	}

	/**
	 * @param logger the logger to set
	 */
	public void setLogger(String className) {
		this.logger = Logger.getLogger(className);
	}

	/**
	 * @param logger
	 */
	public Log4j(Logger logger) {
		this.logger = logger;
	}
	public Log4j() {
		this.logger = null;
	}
}
