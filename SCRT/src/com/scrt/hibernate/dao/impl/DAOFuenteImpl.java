package com.scrt.hibernate.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.scrt.hibernate.model.Fuente;

import com.sct.hibernate.dao.DAOFuente;

public class DAOFuenteImpl implements DAOFuente {
	private static Logger logger = Logger.getLogger(DAOFuenteImpl.class);

	@SuppressWarnings("unchecked")
	@Override
	public List<Fuente> ListarFuentes() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Fuente> encontradas = new ArrayList<Fuente>();

		try {
			encontradas = session.createQuery("from Fuente").list();
		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {
			session.close();
		}

		return encontradas;
	}

	@Override
	public void guardarFuente(Fuente fuent) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		try {
			session.save(fuent);
			session.getTransaction().commit();

		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {

			session.close();
		}

	}

}
