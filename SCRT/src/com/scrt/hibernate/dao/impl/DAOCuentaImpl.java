package com.scrt.hibernate.dao.impl;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.scrt.hibernate.model.Cuenta;

import com.sct.hibernate.dao.DAOCuenta;

public class DAOCuentaImpl implements DAOCuenta {
	private static Logger logger = Logger.getLogger(DAOCuentaImpl.class);

	@Override
	public void guardarCuenta(Cuenta cuenta) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		try {
			session.save(cuenta);
			session.getTransaction().commit();

		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {

			session.close();
		}

	}

	@Override
	public void eliminarCuenta(Cuenta cuenta) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		try {
			session.delete(cuenta);
			session.getTransaction().commit();

		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {

			session.close();
		}

	}

	@Override
	public void editarCuenta(Cuenta cuenta) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		try {
			session.merge(cuenta);
			session.getTransaction().commit();

		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {

			session.close();
		}
	}

	@Override
	public Cuenta RetornarCuenta(int cedula) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Cuenta encontrada = null;

		try {
			encontrada = (Cuenta) session.get(Cuenta.class, cedula);
		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {
			session.close();
		}

		return encontrada;

	}
}
