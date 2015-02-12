package com.scrt.hibernate.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.scrt.hibernate.model.Actualizacion;

import com.sct.hibernate.dao.DAOActualizacion;

public class DAOActualizacionImpl implements DAOActualizacion{
	private static Logger logger = Logger.getLogger(DAOActualizacionImpl.class);
	@Override
	public void guardarActualizacion(Actualizacion actualizar) {
		
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();
		
		try {
			session.save(actualizar);
			session.getTransaction().commit();
		
		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {
			
			session.close();
		}		
	}

	@Override
	public List<Actualizacion> buscarActualizacion(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		Criteria criteria = session.createCriteria(Actualizacion.class);
		List<Actualizacion> encontradas = new ArrayList<Actualizacion>();
		
		try {
			criteria.add(Restrictions.like("nombre", "%"+id+"%"));
			encontradas = criteria.list();
		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {
			session.close();
		}
		
		return encontradas;
	}

	
	

	@Override
	public List<Actualizacion> ListarActualizaciones() {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		List<Actualizacion> encontradas = new ArrayList<Actualizacion>();
		
		try {
			encontradas = session.createQuery("from Actualizacion").list();
		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {
			session.close();
		}
		
		return encontradas;
	}

}
