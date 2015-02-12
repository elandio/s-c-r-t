package com.scrt.hibernate.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.scrt.hibernate.model.Empresa;

import com.sct.hibernate.dao.DAOEmpresa;

public class DAOEmpresaImpl implements DAOEmpresa {
	private static Logger logger = Logger.getLogger(DAOEmpresaImpl.class);

	@SuppressWarnings("unchecked")
	@Override
	public List<Empresa> ListarEmpresas() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Empresa> encontradas = new ArrayList<Empresa>();

		try {
			encontradas = session.createQuery("from Empresa").list();
		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {
			session.close();
		}

		return encontradas;
	}

	@Override
	public void guardarEmpresa(Empresa Emp) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		try {
			session.save(Emp);
			session.getTransaction().commit();

		} catch (HibernateException ex) {
			logger.debug("Exception encontrada" + ex.getLocalizedMessage());
		} finally {

			session.close();
		}

	}

}
