package com.sct.hibernate.dao;

import java.util.List;

import com.scrt.hibernate.model.Fuente;

public interface DAOFuente {

	public List<Fuente> ListarFuentes();

	public void guardarFuente(Fuente fuent);

}
