package com.sct.hibernate.dao;

import java.util.List;

import com.scrt.hibernate.model.Consulta;


public interface DAOConsulta {
	public List<Consulta> ListarConsultas();

	public void guardarConsulta(Consulta consulta);
}
