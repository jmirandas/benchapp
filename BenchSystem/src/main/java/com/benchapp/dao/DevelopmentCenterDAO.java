/**
 * 
 */
package com.benchapp.dao;

import java.util.List;

import org.hibernate.HibernateException;

import com.benchapp.models.DevelopmentCenter;

/**
 * @author eduardo.bran
 *
 */
public interface DevelopmentCenterDAO extends GenericDAO<DevelopmentCenter>{
	public List<DevelopmentCenter> AvanticaDevelopmentCenter() throws HibernateException;
}
