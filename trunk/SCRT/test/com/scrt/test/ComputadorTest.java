package com.scrt.test;

import java.util.List;

import static org.junit.Assert.*;

import org.junit.Test;

import com.scrt.hibernate.dao.impl.DAOComputadorImpl;
import com.scrt.hibernate.model.Computador;

public class ComputadorTest {

	@Test
	public void ListarComputadores() {
		DAOComputadorImpl daoComputador = new DAOComputadorImpl();

		List<Computador> compu = daoComputador.ListarComputadores();

		System.out
				.println("Existen " + compu.size() + "Computadores  en la BD");
		for (Computador com : compu) {
			System.out.println("ID:" + com.getID() + " Modelo: "
					+ com.getModelo() + " Marca: " + com.getMarca()
					+ " Empresa Propietaria: " + com.getEmpresaPropietaria()
					+ "Estado:" + com.getEstado());
		}
	}



}
