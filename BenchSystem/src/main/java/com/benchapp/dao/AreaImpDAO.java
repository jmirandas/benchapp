/**
 * 
 */
package com.benchapp.dao;

/**
 * @author eduardo.bran
 *
 */

import com.benchapp.models.Area;

import org.springframework.stereotype.Repository;

@Repository("areaImplDAO")
public class AreaImpDAO  extends GenericImplDao<Area> implements AreaDAO{
<<<<<<< HEAD
=======
	/**
	 * get all areas 
	 */
	@SuppressWarnings("unchecked")
	//@Override
	public Map<String, String> getMapArea() throws HibernateException {
		Map<String,String> mapAreas = new HashMap<String, String>();
		List<Area> areas = (List<Area>) sessionFactory.getCurrentSession().createQuery("FROM Area").list();
		mapAreas.put("0","-- All --");
		for(Area area : areas)
		{
			mapAreas.put(Integer.toString(area.getPositionId()) ,area.getName());
		}
		return mapAreas;
	}
>>>>>>> configuracion incompleta
}