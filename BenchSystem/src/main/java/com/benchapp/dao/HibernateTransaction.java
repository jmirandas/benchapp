/**
 * 
 */
package com.benchapp.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTransactionManager;

/**
 * @author esteban.guevara
 * 
 */
public class HibernateTransaction {
	
	private SessionFactory  sessionFactory;
	
	public  HibernateTransactionManager getHibernateTransactionManager() {
		HibernateTransactionManager hibernateTransactionManager = null;
		if (sessionFactory != null) {
			hibernateTransactionManager = new HibernateTransactionManager(
					sessionFactory);
		}
		hibernateTransactionManager.getResourceFactory();
		return hibernateTransactionManager;
	} 

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
