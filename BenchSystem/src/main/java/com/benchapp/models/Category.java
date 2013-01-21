/**
 * 
 */
package com.benchapp.models;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author eduardo.bran
 * 
 */

@Table(name = "")
public class Category {
	@Id
	@Column(name = "")
	private int categoryId;

	@Column(name = "")
	private String name;

	@OneToMany(fetch = FetchType.EAGER)
	private Skill skill;

	/**
	 * @return the idCategory
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * @param idCategory
	 *            the idCategory to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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
