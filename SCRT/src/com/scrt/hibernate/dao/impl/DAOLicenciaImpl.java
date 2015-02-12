package com.scrt.hibernate.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.scrt.hibernate.model.Licencia;
import com.sct.hibernate.dao.DAOLicencia;

public class DAOLicenciaImpl implements DAOLicencia {
	private static Logger logger = Logger.getLogger(DAOLicenciaImpl.class);

	@SuppressWarnings("unchecked")
	@Override
	public List<Licencia> ListarLicencias() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Licencia> encontradas = new ArrayList<Licencia>();

		try {
			encontradas = session.createQuery("from Licencia").list();
		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {
			session.close();
		}

		return encontradas;
	}

	@Override
	public void guardarLicencia(Licencia licen) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		try {
			session.save(licen);
			session.getTransaction().commit();

		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {

			session.close();
		}

	}

}
