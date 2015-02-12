package com.scrt.hibernate.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.scrt.hibernate.model.Consulta;
import com.sct.hibernate.dao.DAOConsulta;

public class DAOConsultaImpl implements DAOConsulta{
	private static Logger logger = Logger.getLogger(DAOConsultaImpl.class);
	
	@SuppressWarnings("unchecked")
	
	@Override
	public List<Consulta> ListarConsultas() {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		List<Consulta> encontradas = new ArrayList<Consulta>();
		
		try {
			encontradas = session.createQuery("from Consulta").list();
		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {
			session.close();
		}
		
		return encontradas;
	}

	@Override
	public void guardarConsulta(Consulta consulta) {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();
		
		try {
			session.save(consulta);
			session.getTransaction().commit();
			
		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {
			
			session.close();
		}		
		
	}

}
