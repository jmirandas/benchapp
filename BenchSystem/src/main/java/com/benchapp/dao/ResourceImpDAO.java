/**
 * 
 */
package com.benchapp.dao;

/**
 * @author eduardo.bran
 *
 */
import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.benchapp.models.Resources;

//@Service("resourceImplDAO")
@Repository("resourceImplDAO")
public class ResourceImpDAO extends GenericImplDao<Resources> implements ResourceDAO{	
	
	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED,readOnly = true)
	@Override
	public List<Resources> Search(String dc, int area)
			throws HibernateException {
		return sessionFactory.getCurrentSession().createQuery("FROM Resources r Where r.location = '"+ dc +"' AND r.idPosition = '"+ area +"'").list();
	}
}