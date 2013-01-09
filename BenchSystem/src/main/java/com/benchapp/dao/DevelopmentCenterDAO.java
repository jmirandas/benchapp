/**
 * 
 */
package com.benchapp.dao;

import java.util.Map;

import org.hibernate.HibernateException;

import com.benchapp.models.DevelopmentCenter;

/**
 * @author eduardo.bran
 * 
 */
public interface DevelopmentCenterDAO extends GenericDAO<DevelopmentCenter> {
	public Map<String, String> AvanticaDevelopmentCenter()
			throws HibernateException;
}
