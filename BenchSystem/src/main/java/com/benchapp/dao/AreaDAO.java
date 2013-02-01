/**
 * 
 */
package com.benchapp.dao;

import java.util.List;

import org.hibernate.HibernateException;

import com.benchapp.models.Area;

/**
 * @author eduardo.bran
 *
 */
public interface AreaDAO extends GenericDAO<Area>{
	public List<Area> getMapArea() throws HibernateException;
}
