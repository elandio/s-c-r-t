package com.scrt.hibernate.model;

public class Licencia {

	private String Estado;
	private int id;
	private String fechaCaducidad;
	private String Software;
	private Empresa Empresa;

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha_caducidad() {
		return fechaCaducidad;
	}

	public void setFecha_caducidad(String fecha_caducidad) {
		this.fechaCaducidad = fecha_caducidad;
	}

	public String getSoftware() {
		return Software;
	}

	public void setSoftware(String software) {
		Software = software;
	}

	public Empresa getEmpresa() {
		return Empresa;
	}

	public void setEmpresa(Empresa empresa) {
		Empresa = empresa;
	}

}
