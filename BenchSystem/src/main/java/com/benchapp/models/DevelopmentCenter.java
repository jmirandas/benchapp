/**
 * 
 */
package com.benchapp.models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author eduardo.bran
 * 
 */
@Table(name = "")
public class DevelopmentCenter {

	@Id
	@Column(name = "")
	private int developCenterId;

	@Column(name = "")
	private String description;

	/**
	 * @return the developCenterId
	 */
	public int getDevelopCenterId() {
		return developCenterId;
	}

	/**
	 * @param developCenterId
	 *            the developCenterId to set
	 */
	public void setDevelopCenterId(int developCenterId) {
		this.developCenterId = developCenterId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
