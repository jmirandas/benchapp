/**
 * 
 */
package com.benchapp.models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author eduardo.bran
 * 
 */

@Table(name = "ParametrosGeneral")
public class Area {

	@Id
	@Column(name = "idParametrosGeneral")
	private int areaId;

	@Column(name = "nombre")
	private String description;

	@OneToMany()
	private Rol rol;

	/**
	 * @return the areaId
	 */
	public int getAreaId() {
		return areaId;
	}

	/**
	 * @param areaId
	 *            the areaId to set
	 */
	public void setAreaId(int areaId) {
		this.areaId = areaId;
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
