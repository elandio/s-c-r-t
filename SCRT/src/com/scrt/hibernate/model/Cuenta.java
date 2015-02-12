package com.scrt.hibernate.model;

public class Cuenta {
	private String Nombres;
	private String Apellidos;
	private int Cedula;
	private int Telefono;
	private int Celular;
	private String Direccion;
	private String Correo;
	private String Usuario;
	private String Contraseña;
	private Empresa Empresa;
	private String Rol;

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getCedula() {
		return Cedula;
	}

	public void setCedula(int cedula) {
		Cedula = cedula;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

	public int getCelular() {
		return Celular;
	}

	public void setCelular(int celular) {
		Celular = celular;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public Empresa getEmpresa() {
		return Empresa;
	}

	public void setEmpresa(Empresa empresa) {
		Empresa = empresa;
	}

	public String getRol() {
		return Rol;
	}

	public void setRol(String rol) {
		Rol = rol;
	}

}
