/**
 * 
 */
package com.benchapp.dao;

import java.util.List;

import org.hibernate.HibernateException;

import com.benchapp.models.Model;

/**
 * @author esteban.guevara
 *
 */
public interface GenericDAO<T extends Model> {

	public List<T> getAll(String ClassName)throws HibernateException;
}
