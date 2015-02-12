package com.scrt.hibernate.model;

public class Computador {

	private Empresa EmpresaPropietaria;
	private String Modelo;
	private String Marca;
	private String Estado;
	private int ID;

	public Empresa getEmpresaPropietaria() {
		return EmpresaPropietaria;
	}

	public void setEmpresaPropietaria(Empresa empresaPropietaria) {
		EmpresaPropietaria = empresaPropietaria;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

}
