package com.scrt.test;

import com.scrt.hibernate.dao.impl.DAOCuentaImpl;
import com.scrt.hibernate.model.Cuenta;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void eliminarCuenta() {
		DAOCuentaImpl daoCuenta = new DAOCuentaImpl();
		Cuenta cuent = daoCuenta.RetornarCuenta(11526054);
		daoCuenta.eliminarCuenta(cuent);
	}

	public void RetornarCuenta() {
		DAOCuentaImpl daoCuenta = new DAOCuentaImpl();
		Cuenta cuent = daoCuenta.RetornarCuenta(11526054);
		System.out.println("Nombre" + cuent.getNombres() + "Apellido"
				+ cuent.getApellidos() + "Cedula" + cuent.getCedula()
				+ "Celular" + cuent.getCelular() + "Contraseña"
				+ cuent.getContraseña() + "Usuario" + cuent.getUsuario()
				+ "Correo" + cuent.getCorreo() + "Telefono"
				+ cuent.getTelefono() + "Rol" + cuent.getRol() + "Empresa"
				+ cuent.getEmpresa() + "Dirección" + cuent.getDireccion());
	}

}
