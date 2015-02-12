package com.scrt.test;

import java.util.List;

import org.junit.Test;

import com.scrt.hibernate.dao.impl.DAOFuenteImpl;

import com.scrt.hibernate.model.Fuente;

public class FuenteTest {

	@Test
	public void ListarFuentes() {
		DAOFuenteImpl daoFuente = new DAOFuenteImpl();

		List<Fuente> fuent = daoFuente.ListarFuentes();

		System.out.println("Existen " + fuent.size() + "Fuentes en la BD");
		for (Fuente fue : fuent) {
			System.out.println("URL de la BD:" + fue.getUrl()
					+ "Nombre de la BD: " + fue.getBd() + " Usuario: "
					+ fue.getUsuario() + " Contraseña: " + fue.getContraseña()
					+ "Empresa:" + fue.getEmpresa());
		}
	}

}
