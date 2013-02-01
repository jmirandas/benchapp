/**
 * 
 */
package com.benchapp.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.benchapp.models.DevelopmentCenter;

/**
 * @author eduardo.bran
 *
 */
@Repository("developmentCenterImplDAO")
public class DevelopmentCenterImpDAO extends GenericImplDao<DevelopmentCenter> implements DevelopmentCenterDAO{
	/**
	 * get the diferents development centers of Avantica
	 */
	@SuppressWarnings("unchecked")
	 @Transactional(isolation = Isolation.READ_UNCOMMITTED, propagation = Propagation.SUPPORTS,readOnly = true)
	 @Override
	 public List<DevelopmentCenter> AvanticaDevelopmentCenter()
	   throws HibernateException {
	  List<DevelopmentCenter> centers = (List<DevelopmentCenter>) sessionFactory.getCurrentSession().createQuery("FROM DevelopmentCenter dv WHERE dv.company = 'AVANTICA'").list();
	  return centers;
	 }
}
