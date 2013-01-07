/**
 * 
 */
package com.benchapp.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author eduardo.bran
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "Colaborador")
public class Resources implements Serializable, Model {

	@Id
	@Column(name = "idColaborador")
	private int resourceId;

	@Column(name = "nombre")
	private String name;

	@Column(name = "nombrePartner")
	private String location;

	@Column(name = "idPuesto")
	private String idPosition;

	// @Column(name = "")
	// private Date availableDate;
	//
	// @Column(name = "")
	// private String developmentCenter;

	// @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	// private List<Project> projects = new ArrayList<Project>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "ColaboradorXHabilidad", joinColumns = { @JoinColumn(name = "idColaborador") }, inverseJoinColumns = { @JoinColumn(name = "idHabilidad") })
	private List<Skill> skills = new ArrayList<Skill>();

	/**
	 * @return the idPosition
	 */
	public String getIdPosition() {
		return idPosition;
	}

	/**
	 * @param idPosition
	 *            the idPosition to set
	 */
	public void setIdPosition(String idPosition) {
		this.idPosition = idPosition;
	}

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
	 * @param ubicacion
	 *            the ubicacion to set
	 */
	public void setLocation(String ubicacion) {
		this.location = ubicacion;
	}

	/**
	 * @return the availableDate
	 */
	// public Date getAvailableDate() {
	// return availableDate;
	// }
	//
	// /**
	// * @param availableDate
	// * the availableDate to set
	// */
	// public void setAvailableDate(Date availableDate) {
	// this.availableDate = availableDate;
	// }
	//
	// /**
	// * @return the developmentCenter
	// */
	// public String getDevelopmentCenter() {
	// return developmentCenter;
	// }
	//
	// /**
	// * @param developmentCenter
	// * the developmentCenter to set
	// */
	// public void setDevelopmentCenter(String developmentCenter) {
	// this.developmentCenter = developmentCenter;
	// }
	//
	/**
	 * @return the projects
	 */
	// public List<Project> getProjects() {
	// return projects;
	// }
	//
	// /**
	// * @param projects
	// * the projects to set
	// */
	// public void setProjects(List<Project> projects) {
	// this.projects = projects;
	// }

	/**
	 * @return the skills
	 */
	public List<Skill> getSkills() {
		return skills;
	}

	/**
	 * @param skills
	 *            the skills to set
	 */
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

}
