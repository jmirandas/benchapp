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

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author eduardo.bran
 *	Model that represent the data of the store procedure "GetResourcesOnTheBench"
 */
@SuppressWarnings("serial")
@Entity
@NamedNativeQueries({@NamedNativeQuery(name="GetResourcesOnTheBench", query="EXEC GetResourcesOnTheBench :limitDate, :developmentC, :area", resultClass = ResourceStoredProcedure.class)})
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
	
	@Column(name="skills")
	private String skills;
	
	@Column(name="Estado")
	private String status;
	/**
	 * @return the status
	 */
	@JsonProperty("3")
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the idColabolarador
	 */
	@JsonProperty("5")
	public int getIdColabolarador() {
		return idColabolarador;
	}
	/**
	 * @param idColabolarador the idColabolarador to set
	 */
	public void setIdColabolarador(int idColabolarador) {
		this.idColabolarador = idColabolarador;
	}
	/**
	 * @return the skills
	 */
	@JsonProperty("4")
	public String getSkills() {
		return skills;
	}
	/**
	 * @param skills the skills to set
	 */
	public void setSkills(String skills) {
		this.skills = skills;
	}
	/**
	 * @return the name
	 */
	@JsonProperty("0")
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
	@JsonProperty("1")
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
	@JsonProperty("2")
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
	@JsonProperty("6")
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
	@JsonProperty("7")
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
