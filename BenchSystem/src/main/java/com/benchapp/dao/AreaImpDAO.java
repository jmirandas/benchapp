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

import com.benchapp.models.Area;

@Repository("areaImplDAO")
public class AreaImpDAO  extends GenericImplDao<Area> implements AreaDAO{
	/**
	 * get all areas 
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Area> getMapArea() throws HibernateException {
		List<Area> areas = (List<Area>) sessionFactory.getCurrentSession().createQuery("FROM Area").list();
		return areas;
	}
}