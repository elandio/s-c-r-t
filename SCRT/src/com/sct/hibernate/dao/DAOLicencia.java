package com.sct.hibernate.dao;

import java.util.List;

import com.scrt.hibernate.model.Licencia;

public interface DAOLicencia {

	public List<Licencia> ListarLicencias();

	public void guardarLicencia(Licencia licen);

}
