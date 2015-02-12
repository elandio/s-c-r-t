package com.scrt.test;

import java.util.List;

import static org.junit.Assert.*;

import org.junit.Test;

import com.scrt.hibernate.dao.impl.DAOComputadorImpl;
import com.scrt.hibernate.dao.impl.DAOLicenciaImpl;
import com.scrt.hibernate.model.Computador;
import com.scrt.hibernate.model.Licencia;

public class LicenciaTest {

	@Test
	public void ListarLicencias() {
		DAOLicenciaImpl daoLicencia = new DAOLicenciaImpl();

		List<Licencia> licen = daoLicencia.ListarLicencias();

		System.out
				.println("Existen " + licen.size() + "Computadores  en la BD");
		for (Licencia lic : licen) {
			System.out.println("ID:" + lic.getId() + "Fecha de Caducidad: "
					+ lic.getFecha_caducidad() + " Software "
					+ lic.getSoftware() + " Empresa Propietaria: "
					+ lic.getEmpresa() + "Estado:" + lic.getEstado());
		}
	}

}
