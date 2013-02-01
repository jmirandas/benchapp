/**
 * 
 */
package com.benchapp.dao;

import java.util.List;

import org.hibernate.HibernateException;

import com.benchapp.models.ResourceStoredProcedure;
import com.benchapp.models.Resources;

/**
 * @author eduardo.bran
 * 
 */
public interface ResourceDAO  extends GenericDAO<Resources>{
	public List<ResourceStoredProcedure> GetResourcesOnTheBench(String limitDate, String dc, int area) throws HibernateException;
	public List<ResourceStoredProcedure> GetResourcesOnTheBench() throws HibernateException;
}
