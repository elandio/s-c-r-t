package com.scrt.hibernate.model;

/*
 Clase correspondiente al modelo de la tabla servidor de la BD SCRT

 */
public class Servidor {

	private Empresa EmpresaPropietaria;
	private String Modelo;
	private String Marca;
	private String Estado;
	private int ID;

	// Retorna el valor de Empresa propietaria del servidor
	public Empresa getEmpresaPropietaria() {
		return EmpresaPropietaria;
	}

	// Se ingresa la Empresa propietaria del servidor
	public void setEmpresaPropietaria(Empresa empresaPropietaria) {
		EmpresaPropietaria = empresaPropietaria;
	}

	// Retorna el modelo del servidor
	public String getModelo() {
		return Modelo;
	}

	// Se ingresa el parametro de modelo del servidor
	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	// Retorna la marca del servidor
	public String getMarca() {
		return Marca;
	}

	// Se ingresa el parametro de marca del servidor
	public void setMarca(String marca) {
		Marca = marca;
	}

	// Retorna el estado en que se encuetra el servidor
	public String getEstado() {
		return Estado;
	}

	// Se ingresa el parametro de Estado del Servidor
	public void setEstado(String estado) {
		Estado = estado;
	}

	// Retorna el Identificador del servidor
	public int getID() {
		return ID;
	}

	// Ingresa parametro de Identificador del servidor
	public void setID(int iD) {
		ID = iD;
	}

}
