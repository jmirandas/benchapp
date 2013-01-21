/**
 * 
 */
package com.benchapp.models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author eduardo.bran
 * 
 */
@Table(name = "Cliente")
public class Client {

	@Id
	@Column(name = "idCliente")
	private int clientId;

	@Column(name = "nombre")
	private String name;

	/**
	 * @return the clientId
	 */
	public int getClientId() {
		return clientId;
	}

	/**
	 * @param clientId
	 *            the clientId to set
	 */
	public void setClientId(int clientId) {
		this.clientId = clientId;
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
