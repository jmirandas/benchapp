/**
 * 
 */
package com.benchapp.dao;

import java.util.List;

import org.hibernate.HibernateException;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.benchapp.models.DevelopmentCenter;

/**
 * @author eduardo.bran
 *
 */
//@Service("developmentCenterImplDAO")
@Repository("developmentCenterImplDAO")
public class DevelopmentCenterImpDAO extends GenericImplDao<DevelopmentCenter> implements DevelopmentCenterDAO{
	
	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
<<<<<<< HEAD
	@Override
	public List<DevelopmentCenter> AvanticaDevelopmentCenter()
=======
	//@Override
	public Map<String,String> AvanticaDevelopmentCenter()
>>>>>>> configuracion incompleta
			throws HibernateException {
		return sessionFactory.getCurrentSession().createQuery("FROM DevelopmentCenter dv WHERE dv.compania = 'AVANTICA'").list();
	}
}
