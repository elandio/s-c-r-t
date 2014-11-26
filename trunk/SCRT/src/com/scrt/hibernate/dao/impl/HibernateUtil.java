package com.scrt.hibernate.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
 Clase que realiza la creacion de session con hibernate
 a partir del archivo de configuracion.
 */

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	 
    @SuppressWarnings("deprecation")
	private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
 
    public static void shutdown() {
        getSessionFactory().close();
    }

}
