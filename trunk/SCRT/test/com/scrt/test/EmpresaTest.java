package com.scrt.test;

import java.util.List;

import org.junit.Test;

import com.scrt.hibernate.dao.impl.DAOEmpresaImpl;
import com.scrt.hibernate.model.Empresa;

public class EmpresaTest {

	@Test
	public void ListarEmpresas() {
		DAOEmpresaImpl daoEmpresa = new DAOEmpresaImpl();

		List<Empresa> empre = daoEmpresa.ListarEmpresas();

		System.out.println("Existen " + empre.size() + "Empresas  en la BD");
		for (Empresa emp : empre) {
			System.out.println("ID:" + emp.getId() + "Nombre: "
					+ emp.getNombre() + " Dirección:" + emp.getDireccion()
					+ " telefono: " + emp.getTelefono());
		}
	}

	
	public void guardarEmpresa() {
		DAOEmpresaImpl daoEmpresa = new DAOEmpresaImpl();

		Empresa empre = new Empresa();
		empre.setId(265825);
		empre.setNombre("Bancolombia");
		empre.setDireccion("cll 50 # 96 -8");
		empre.setTelefono(4489536);

		daoEmpresa.guardarEmpresa(empre);
	}

	
}
