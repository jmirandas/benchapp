/**
 * 
 */
package com.benchapp.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	public Map<String,String> AvanticaDevelopmentCenter()
			throws HibernateException {
		Map<String,String> mapCenters = new HashMap<String, String>();
		List<DevelopmentCenter> centers = (List<DevelopmentCenter>) sessionFactory.getCurrentSession().createQuery("FROM DevelopmentCenter dv WHERE dv.compania = 'AVANTICA'").list();
		mapCenters.put("All","-- All --");
		sessionFactory.getCurrentSession();
		for(DevelopmentCenter developmentCenter : centers)
		{
			mapCenters.put(developmentCenter.getNombre(),developmentCenter.getNombre());
		}
		return mapCenters;
	}
}
