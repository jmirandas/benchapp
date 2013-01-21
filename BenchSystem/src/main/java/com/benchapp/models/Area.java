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
@Table(name = "Puesto")
public class Area implements Model{

	@Id
	@Column(name = "idPuesto")
	private int positionId;

	@Column(name = "nombre")
	private String name;
	
	@Column(name = "estado")
	private String status;

	/**
	 * @return the positionId
	 */
	public int getPositionId() {
		return positionId;
	}

	/**
	 * @param positionId the positionId to set
	 */
	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
