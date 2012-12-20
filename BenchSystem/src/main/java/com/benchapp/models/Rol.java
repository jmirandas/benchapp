/**
 * 
 */
package com.benchapp.models;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author eduardo.bran
 * 
 */
@Table(name = "")
public class Rol {

	@Id
	@Column(name = "")
	private int rolId;

	@Column(name = "")
	private String name;

	@Column(name = "")
	private String businessUnit;

	@ManyToOne(fetch = FetchType.EAGER)
	private Area area;

	/**
	 * @return the rolId
	 */
	public int getRolId() {
		return rolId;
	}

	/**
	 * @param rolId
	 *            the rolId to set
	 */
	public void setRolId(int rolId) {
		this.rolId = rolId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the businessUnit
	 */
	public String getBusinessUnit() {
		return businessUnit;
	}

	/**
	 * @param businessUnit
	 *            the businessUnit to set
	 */
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	/**
	 * @return the area
	 */
	public Area getArea() {
		return area;
	}

	/**
	 * @param area
	 *            the area to set
	 */
	public void setArea(Area area) {
		this.area = area;
	}

}
