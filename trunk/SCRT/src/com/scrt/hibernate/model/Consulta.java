package com.scrt.hibernate.model;

public class Consulta {
	private int id;
	private String fecha;
	private Cuenta usuario;
	private String tipo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Cuenta getUsuario() {
		return usuario;
	}

	public void setUsuario(Cuenta usuario) {
		this.usuario = usuario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
