package com.scrt.test;

import static org.junit.Assert.*;
import java.util.List;

import org.junit.Test;
import com.scrt.hibernate.dao.impl.DAOServidorImpl;
import com.scrt.hibernate.model.Servidor;

public class ServidorTest {
	// EL comentario respectivo de cada clase esta en el paquete
	// com.scrt.hibernate.model en la clase DAOServidor
	@Test
	public void ListarServidores() {
		DAOServidorImpl daoServidor = new DAOServidorImpl();

		List<Servidor> servs = daoServidor.ListarServidores();

		System.out.println("Existen " + servs.size() + " Servidores en la BD");
		for (Servidor serv : servs) {
			System.out.println("ID:" + serv.getID() + " Modelo: "
					+ serv.getModelo() + " Marca: " + serv.getMarca()
					+ " Empresa Propietaria: " + serv.getEmpresaPropietaria()
					+ "Estado:" + serv.getEstado());
		}
	}

	public void RetornarServidor() {
		DAOServidorImpl daoServidor = new DAOServidorImpl();
		Servidor serv = daoServidor.RetornarServidor(2);

		System.out.println(serv.getID());
	}

	public void eliminarServidor() {
		DAOServidorImpl daoServidor = new DAOServidorImpl();
		Servidor serv = daoServidor.RetornarServidor(3);
		daoServidor.eliminarServidor(serv);
	}

	public void editarServidor() {
		DAOServidorImpl daoServidor = new DAOServidorImpl();
		Servidor serv = daoServidor.RetornarServidor(3);
		serv.setEstado("OFF");
		daoServidor.editarServidor(serv);
	}

	public void buscarServidor() {
		DAOServidorImpl daoServidor = new DAOServidorImpl();
		List<Servidor> servs = daoServidor.buscarServidor("3352");

		System.out.println("Encontrados " + servs.size());
		for (Servidor serv : servs) {
			System.out.println("ID:" + serv.getID() + " Modelo: "
					+ serv.getModelo() + " Marca: " + serv.getMarca()
					+ " Empresa pripietaria:" + serv.getEmpresaPropietaria());
		}
	}

}
