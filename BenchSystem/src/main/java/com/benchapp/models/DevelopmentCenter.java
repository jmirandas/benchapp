/**
 * 
 */
package com.benchapp.models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

/**
 * @author eduardo.bran
 * 
 */
@Entity
@Table(name = "CentroDesarrollo")
public class DevelopmentCenter {

	@Id
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "compania")
	private String compania;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the compania
	 */
	public String getCompania() {
		return compania;
	}

	/**
	 * @param compania the compania to set
	 */
	public void setCompania(String compania) {
		this.compania = compania;
	}


}
