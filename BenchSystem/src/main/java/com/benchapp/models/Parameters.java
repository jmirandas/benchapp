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
@Table(name = "Colaborador")
public class Parameters {
	
	@Id
	@Column(name = "idParametro")
	private int idParametro;
	
	@Column(name = "nombre")
	private String nombre;
	
	/**
	 * @return the idParametro
	 */
	public int getIdParametro() {
		return idParametro;
	}

	/**
	 * @param idParametro the idParametro to set
	 */
	public void setIdParametro(int idParametro) {
		this.idParametro = idParametro;
	}

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

}
