package com.scrt.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.scrt.hibernate.dao.impl.DAOActualizacionImpl;
import com.scrt.hibernate.model.Actualizacion;
import com.scrt.hibernate.model.Cuenta;

public class ActualizacionTest {
	@Test
	public void ListarActualizaciones() {
		DAOActualizacionImpl daoActualizacion = new DAOActualizacionImpl();

		List<Actualizacion> actual = daoActualizacion.ListarActualizaciones();

		System.out.println("Existen " + actual.size()
				+ " actualizaciones en la BD");
		for (Actualizacion act : actual) {
			System.out.println("ID:" + act.getId() + " Fecha: "
					+ act.getFecha() + " usuario: " + act.getUsuario()
					+ " Tipo de recurso " + act.getTipo()  );

		}
	}

	

	public void buscarActualizcion() {
		DAOActualizacionImpl daoActualizacion = new DAOActualizacionImpl();

		List<Actualizacion> actual = daoActualizacion
				.buscarActualizacion(15285);

		System.out.println("Encontrados " + actual.size());
		for (Actualizacion act : actual) {
			System.out.println("ID:" + act.getId() + " Fecha: "
					+ act.getFecha() + " usuario: " + act.getUsuario()
					+ " Tipo de recurso " + act.getTipo());
		}
	}

}
