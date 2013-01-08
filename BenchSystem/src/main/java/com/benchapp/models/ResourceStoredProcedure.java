/**
 * 
 */
package com.benchapp.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

/**
 * @author eduardo.bran
 *
 */
@SuppressWarnings("serial")
@Entity
@NamedNativeQueries({@NamedNativeQuery(name="GetResourcesOnTheBench", query="EXEC GetResourcesOnTheBench :limitDate", resultClass = ResourceStoredProcedure.class)})
@Table(name = "colaborador")
public class ResourceStoredProcedure implements Serializable, Model{
	
	@Id
	@Column(name="idColaborador")
	private int idColabolarador;
	
	@Column(name = "nombre")
	private String name;
	
	@Column(name = "nombrePartner")
	private String location;
	
	@Column(name="porcentaje")
	private int percent;
	
	@Column(name="fechaSalida")
	private Date finishDate;
	
	@Column(name="EnglishLevel")
	private String englishLevel;
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
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the percent
	 */
	public int getPercent() {
		return percent;
	}
	/**
	 * @param percent the percent to set
	 */
	public void setPercent(int percent) {
		this.percent = percent;
	}
	/**
	 * @return the finishDate
	 */
	public Date getFinishDate() {
		return finishDate;
	}
	/**
	 * @param finishDate the finishDate to set
	 */
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	/**
	 * @return the englishLevel
	 */
	public String getEnglishLevel() {
		return englishLevel;
	}
	/**
	 * @param englishLevel the englishLevel to set
	 */
	public void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}
	
	
}
