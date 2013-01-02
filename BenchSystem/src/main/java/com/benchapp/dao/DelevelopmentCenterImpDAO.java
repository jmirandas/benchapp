/**
 * 
 */
package com.benchapp.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.benchapp.models.DevelopmentCenter;

/**
 * @author eduardo.bran
 *
 */
@Service("developmentCenterDAO")
@Transactional
public class DelevelopmentCenterImpDAO {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	

	public List<DevelopmentCenter> list() throws HibernateException {
		Session session = sessionFactory.getCurrentSession();
		List<DevelopmentCenter> developmentC = session.createQuery("SELECT dv.nombre FROM DevelopmentCenter dv WHERE dv.compania = 'AVANTICA'").list();
		return developmentC;
	}
}
//SELECT dv.nombre, dv.compania FROM DevelopmentCenter dv WHERE dv.compania = 'AVANTICA'