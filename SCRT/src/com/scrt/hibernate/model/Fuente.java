package com.scrt.hibernate.model;

public class Fuente {

	private String url;
	private String bd;
	private String usuario;
	private String contraseña;
	private Empresa Empresa;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBd() {
		return bd;
	}

	public void setBd(String bd) {
		this.bd = bd;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Empresa getEmpresa() {
		return Empresa;
	}

	public void setEmpresa(Empresa empresa) {
		Empresa = empresa;
	}

	
	
	
}
