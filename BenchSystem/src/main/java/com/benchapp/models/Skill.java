/**
 * 
 */
package com.benchapp.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Entity;

/**
 * @author eduardo.bran
 * 
 */

@SuppressWarnings("serial")
@Entity
@Table(name = "Habilidad")
public class Skill implements Serializable,Model{

	@Id
	@Column(name = "idHabilidad")
	private int Idskill;

	@Column(name = "nombre")
	private String name;

//	@OneToMany(fetch = FetchType.EAGER)
//	private List<ResourceBySkill> resource = new ArrayList<ResourceBySkill>();
	
//	@JoinTable(name ="ColaboradorXHabilidad", joinColumns = { @JoinColumn(name = "idColaborador")},
//			inverseJoinColumns = {@JoinColumn(name = "idHabilidad")})
//	List<Resources> resource = new LinkedList<Resources>();

	/**
	 * @return the skillId
	 */
	public int getSkillId() {
		return Idskill;
	}
	/**
	 * @param skillId
	 *            the skillId to set
	 */
	public void setSkillId(int skillId) {
		this.Idskill = skillId;
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
}
