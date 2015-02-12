package com.scrt.hibernate.dao.impl;

import java.util.List;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.scrt.hibernate.model.Servidor;
import com.sct.hibernate.dao.DAOServidor;


public class DAOServidorImpl implements DAOServidor {
// Los comentarios respectivos de cada metodo estan en el DAOServidor del paquete com.scrt.hibernate.dao
	
	private static Logger logger = Logger.getLogger(DAOServidorImpl.class);
	
	@SuppressWarnings("unchecked")
	
	@Override
	public List<Servidor> ListarServidores() {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		List<Servidor> encontradas = new ArrayList<Servidor>();
		
		try {
			encontradas = session.createQuery("from Servidor").list();
		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {
			session.close();
		}
		
		return encontradas;
	}

	@Override
	public Servidor RetornarServidor(int ID) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Servidor encontrada = null;
		
		try {
			encontrada = (Servidor) session.get(Servidor.class,ID);
		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {
			session.close();
		}
		
		return encontrada;
	}

	@Override
	public void guardarServidor(Servidor servidor) {
		
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();
		
		try {
			session.save(servidor);
			session.getTransaction().commit();
		
		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {
			
			session.close();
		}		
	}

	@Override
	public void eliminarServidor(Servidor servidor) {
	
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();
		
		try {
			session.delete(servidor);
			session.getTransaction().commit();
		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {
			session.close();
		}
	}

	@Override
	public void editarServidor(Servidor servidor) {
		
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();
		
		try {
			session.merge(servidor);
			session.getTransaction().commit();
		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {
			session.close();
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Servidor> buscarServidor(String modelo) {
		
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		Criteria criteria = session.createCriteria(Servidor.class);
		List<Servidor> encontradas = new ArrayList<Servidor>();
		
		try {
			criteria.add(Restrictions.like("nombre", "%"+modelo+"%"));
			encontradas = criteria.list();
		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {
			session.close();
		}
		
		return encontradas;
	}

	
	
	
	
	
	
}
