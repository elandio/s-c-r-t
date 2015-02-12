package com.scrt.test;

import java.util.List;

import org.junit.Test;

import com.scrt.hibernate.dao.impl.DAOConsultaImpl;

import com.scrt.hibernate.model.Consulta;

import com.sct.hibernate.dao.DAOConsulta;

import static org.junit.Assert.*;

public class ConsultaTest {
	@Test
	public void ListarConsultas() {
		DAOConsultaImpl daoConsulta = new DAOConsultaImpl();

		List<Consulta> consul = daoConsulta.ListarConsultas();

		System.out.println("Existen " + consul.size() + " consultas en la BD");
		for (Consulta con : consul) {
			System.out.println("ID de la consulta:" + con.getId() + " Fecha: "
					+ con.getFecha() + " usuario: " + con.getUsuario()
					+ " Tipo de recurso " + con.getTipo());

		}
	}

}
