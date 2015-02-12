package com.sct.hibernate.dao;

import com.scrt.hibernate.model.Cuenta;

public interface DAOCuenta {

	public void guardarCuenta(Cuenta cuenta);

	public void eliminarCuenta(Cuenta cuenta);

	public void editarCuenta(Cuenta cuenta);

	public Cuenta RetornarCuenta(int cedula);
}
