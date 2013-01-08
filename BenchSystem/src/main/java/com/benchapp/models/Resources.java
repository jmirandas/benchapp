/**
 * 
 */
package com.benchapp.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

/**
 * @author eduardo.bran
 * 
 */
@SuppressWarnings("serial")
@Entity
@NamedNativeQueries({@NamedNativeQuery(name="GetResourcesOnTheBench", query="EXEC GetResourcesOnTheBench :limitDate", resultClass = Resources.class)})
@Table(name = "colaborador")
public class Resources implements Serializable, Model{

	@Id
	@Column(name = "idColaborador")
	private int resourceId;

    @Column(name = "nombre")
	private String name;
	
	@Column(name = "nombrePartner")
	private String location;
	
	@Column(name="porcentaje")
	private int porcentaje;
	
	@Column(name="fechaSalida")
	private Date fechaSalida;
	
	@Column(name="EnglishLevel")
	private String englishLevel;
	
//	@Column(name = "idPuesto")
//	private String idPosition;

//	 @Column(name = "")
//	 private Date availableDate;
//	
//	 @Column(name = "")
//	 private String developmentCenter;

	 //@ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	 //private List<Project> projects = new ArrayList<Project>();
	//
	// @ManyToMany(fetch = FetchType.LAZY)
	// private List<Skill> skills = new ArrayList<Skill>();

	/**
	 * @return the idPosition
	 */
//	public String getIdPosition() {
//		return idPosition;
//	}
//
//	/**
//	 * @param idPosition the idPosition to set
//	 */
//	public void setIdPosition(String idPosition) {
//		this.idPosition = idPosition;
//	}

	/**
	 * @return the resourceId
	 */
	public int getResourceId() {
		return resourceId;
	}

	/**
	 * @param resourceId
	 *            the resourceId to set
	 */
	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
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
	 * @return the ubicacion
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param ubicacion the ubicacion to set
	 */
	public void setLocation(String ubicacion) {
		this.location = ubicacion;
	}

	/**
	 * @return the porcentaje
	 */
	public int getPorcentaje() {
		return porcentaje;
	}

	/**
	 * @param porcentaje the porcentaje to set
	 */
	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	/**
	 * @return the fechaSalida
	 */
	public Date getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * @param fechaSalida the fechaSalida to set
	 */
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
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

	 /**
	 * @return the availableDate
	 */
//	 public Date getAvailableDate() {
//	 return availableDate;
//	 }
//	
//	 /**
//	 * @param availableDate
//	 * the availableDate to set
//	 */
//	 public void setAvailableDate(Date availableDate) {
//	 this.availableDate = availableDate;
//	 }
//	
//	 /**
//	 * @return the developmentCenter
//	 */
//	 public String getDevelopmentCenter() {
//	 return developmentCenter;
//	 }
//	
//	 /**
//	 * @param developmentCenter
//	 * the developmentCenter to set
//	 */
//	 public void setDevelopmentCenter(String developmentCenter) {
//	 this.developmentCenter = developmentCenter;
//	 }
//	
	 /**
	 * @return the projects
	 */
//	 public List<Project> getProjects() {
//	 return projects;
//	 }
//	
//	 /**
//	 * @param projects
//	 * the projects to set
//	 */
//	 public void setProjects(List<Project> projects) {
//	 this.projects = projects;
//	 }
	
	// /**
	// * @return the skills
	// */
	// public List<Skill> getSkills() {
	// return skills;
	// }
	//
	// /**
	// * @param skills
	// * the skills to set
	// */
	// public void setSkills(List<Skill> skills) {
	// this.skills = skills;
	// }

}
