package com.scrt.hibernate.model;


/*
 Clase correspondiente al modelo de la tabla servidor de la BD SCRT
 
  */
public class Servidor {

	int EmpresaPropietaria = 0 ;
	String Modelo;
	String Marca;
	String Estado;
	int ID;

	
	// Retorna el valor de Empresa propietaria del servidor
	public int getEmpresaPropietaria() {
		return EmpresaPropietaria;
	}
	// Se ingresa la Empresa propietaria del servidor
	public void setEmpresaPropietaria(int empresaPropietaria) {
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
	//Retorna la marca del servidor
	public String getMarca() {
		return Marca;
	}
	//Se ingresa el parametro de marca del servidor
	public void setMarca(String marca) {
		Marca = marca;
	}
	//Retorna el estado en que se encuetra el servidor
	public String getEstado() {
		return Estado;
	}
	//Se ingresa el parametro de Estado del Servidor
	public void setEstado(String estado) {
		Estado = estado;
	}
	//Retorna el Identificador del servidor
	public int getID() {
		return ID;
	}
	//Ingresa parametro de Identificador del servidor
	public void setID(int iD) {
		ID = iD;
	}
	
	
	
	
	
	
}
