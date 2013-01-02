/**
 * 
 */
package com.benchapp.dao;

/**
 * @author eduardo.bran
 *
 */
import java.util.List;
import com.benchapp.models.Resources;
import javax.annotation.Resource;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("resourceDAO")
@Transactional
public class ResourceImpDAO {
	
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	

	public List<Resources> list() throws HibernateException {
		Session session = sessionFactory.getCurrentSession();
		List<Resources> resource = session.createQuery("FROM Resources").list();
		return resource;
	}
}
//select Resources.nombre, Resources.ubicacion, Parametro.nombre from Colaborador, Parametro, ColaboradorxIdioma where ColaboradorxIdioma.idColaborador = Resources.resourceId AND Parametro.idParametro = ColaboradorxIdioma.idNivelIdioma