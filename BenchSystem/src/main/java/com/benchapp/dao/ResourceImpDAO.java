/**
 * 
 */
package com.benchapp.dao;

/**
 * @author eduardo.bran
 *
 */
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.benchapp.models.Resources;

//@Service("resourceImplDAO")
@Repository("resourceImplDAO")
public class ResourceImpDAO extends GenericImplDao<Resources> implements ResourceDAO{	
	
	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
	@Override
	public List<Resources> Search(String dc, int area)
			throws HibernateException {
		return sessionFactory.getCurrentSession().createQuery("FROM Resources r Where r.location = '"+ dc +"' AND r.idPosition = '"+ area +"'").list();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
	@Override
	public List<Resources> GetResourcesOnTheBench()
			throws HibernateException {
		return sessionFactory.getCurrentSession().getNamedQuery("GetResourcesOnTheBench").setDate("limitDate", new Date()).list();
	}
//	session.createSQLQuery(
//			"CALL GetStocks(:stockCode)")
//			.addEntity(Stock.class)
//			.setParameter("stockCode", "7277");
	
}