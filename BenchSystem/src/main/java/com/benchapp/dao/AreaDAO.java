/**
 * 
 */
package com.benchapp.dao;

import java.util.Map;

import org.hibernate.HibernateException;

import com.benchapp.models.Area;

/**
 * @author eduardo.bran
 *
 */
public interface AreaDAO extends GenericDAO<Area>{
	public Map<String,String> getMapArea() throws HibernateException;
}
