/**
 * 
 */
package com.benchapp.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.benchapp.models.Model;

/**
 * @author esteban.guevara
 * Implement GenericDAO Method
 */
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class GenericImplDao<T extends Model> implements GenericDAO<T> {

	
	@Resource(name = "sessionFactory")
	protected SessionFactory sessionFactory;
	
	/**
	 * @param type
	 */
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll(String ClassName)throws HibernateException {
		return sessionFactory.getCurrentSession().createQuery("FROM " + ClassName).list();
	}

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
