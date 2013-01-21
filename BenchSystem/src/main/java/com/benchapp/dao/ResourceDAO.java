/**
 * 
 */
package com.benchapp.dao;

import java.util.List;

import org.hibernate.HibernateException;

import com.benchapp.models.Resources;

/**
 * @author eduardo.bran
 * 
 */
public interface ResourceDAO  extends GenericDAO<Resources>{
	public List<Resources> GetResourcesOnTheBench(String limitDate, String dc, int area) throws HibernateException;
	public List<Resources> GetResourcesOnTheBench() throws HibernateException;
}
