package com.sct.hibernate.dao;

import java.util.List;

import com.scrt.hibernate.model.Actualizacion;

public interface DAOActualizacion {

	public void guardarActualizacion(Actualizacion actualizar);

	public List<Actualizacion> buscarActualizacion(int id);

	public List<Actualizacion> ListarActualizaciones();

}
