/**
 * 
 */
package com.benchapp.dao;

import java.util.Map;

/**
 * @author esteban.guevara
 *
 */
public class TestSession {

	private Map<String,Object> name;
	

	/**
	 * @return the name
	 */
	public Map<String, Object> getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(Map<String, Object> name) {
		this.name = name;
	}

	public String getString()
	{
		return name.get("string").toString();
	}
	
	public int getInteger()
	{
		return 4;
	}
}
