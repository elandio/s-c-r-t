package com.scrt.test;


import static org.junit.Assert.*;
import java.util.List;

import org.junit.Test;
import com.scrt.hibernate.dao.impl.DAOServidorImpl;
import com.scrt.hibernate.model.Servidor;

public class ServidorTest {
	public void ListarServidores() {
		DAOServidorImpl daoServidor = new DAOServidorImpl();
		
		List<Servidor> servs = daoServidor.ListarServidores();
		
		System.out.println("Existen " + servs.size() + " categorias en la BD");
		for(Servidor serv : servs) {
			System.out.println("ID:"+serv.getID()+
					" Modelo: "+serv.getModelo() +
					" Marca: "+serv.getMarca()+ 
					" Empresa Propietaria: "+serv.getEmpresaPropietaria()+"Estado:"+serv.getEstado());
		}
	}
}
