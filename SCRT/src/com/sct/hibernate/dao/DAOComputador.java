package com.sct.hibernate.dao;

import java.util.List;

import com.scrt.hibernate.model.Computador;

public interface DAOComputador {

	public List<Computador> ListarComputadores();

	public void guardarComputador(Computador compu);

}
