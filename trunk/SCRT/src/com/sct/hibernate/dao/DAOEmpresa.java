package com.sct.hibernate.dao;

import java.util.List;

import com.scrt.hibernate.model.Empresa;

public interface DAOEmpresa {

	public List<Empresa> ListarEmpresas();

	public void guardarEmpresa(Empresa Emp);

}
