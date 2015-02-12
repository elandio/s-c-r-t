package com.scrt.hibernate.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.scrt.hibernate.model.Computador;
import com.sct.hibernate.dao.DAOComputador;

public class DAOComputadorImpl implements DAOComputador{

	private static Logger logger = Logger.getLogger(DAOComputadorImpl.class);
	
	@SuppressWarnings("unchecked")
	
	@Override
	public List<Computador> ListarComputadores() {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		List<Computador> encontradas = new ArrayList<Computador>();
		
		try {
			encontradas = session.createQuery("from Computador").list();
		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {
			session.close();
		}
		
		return encontradas;
	}

	@Override
	public void guardarComputador(Computador compu) {
	
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();
		
		try {
			session.save(compu);
			session.getTransaction().commit();
		
		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {
			
			session.close();
		}		
		
	}

}
