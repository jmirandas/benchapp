/**
 * 
 */
package com.benchapp.dao;

/**
 * @author eduardo.bran
 *
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.benchapp.models.Resources;

@Repository("resourceImplDAO")
public class ResourceImpDAO extends GenericImplDao<Resources> implements ResourceDAO {
	/**
	 * Method that get the list with Specific Filters
	 */
	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	
	public List<Resources> GetResourcesOnTheBench(String limitDate, String dc,
			int area) throws HibernateException {
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
		Date fecha = null;
		try {
			fecha = formatoDelTexto.parse(limitDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return sessionFactory.getCurrentSession()
				.getNamedQuery("GetResourcesOnTheBench")
				.setDate("limitDate", fecha).setString("developmentC", dc)
				.setInteger("area", area).list();
	}
	/**
	 * get the list of all resource on the bench nowadays
	 */
	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	
	public List<Resources> GetResourcesOnTheBench() throws HibernateException {
		return sessionFactory.getCurrentSession()
				.getNamedQuery("GetResourcesOnTheBench")
				.setDate("limitDate", new Date()).setString("developmentC", "")
				.setInteger("area", 0).list();
	}
}