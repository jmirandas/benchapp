/**
 * 
 */
package com.benchapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author eduardo.bran
 * 
 */
@Entity
@Table(name = "CentroDesarrollo")
public class DevelopmentCenter implements Model{

	@Id
	@Column(name = "nombre")
	private String name;
	
	@Column(name = "compania")
	private String company;

	/**
	 * @return the nombre
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the nombre to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the compania
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the compania to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}


}
