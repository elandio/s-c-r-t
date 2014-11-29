package com.sct.hibernate.dao;

import java.util.List;




import com.scrt.hibernate.model.Servidor;


    // Interfaz de acceso a los datos de la tabla Servidor

public interface DAOServidor {

	// Metodo  que retorna la lista de servidores que se encuentran la BD
	public List<Servidor> ListarServidores();
	
	//Metodo que retorna una instancia del servidor atraves de un parametro identificador
	
	public Servidor RetornarServidor(int ID);
	
	
	//Metodo que guarda una instancia de un servidor en la BD
	public void guardarServidor(Servidor servidor);
	
	//Metodo que permite elminar una instancia de un servidor en la BD
	public void eliminarServidor(Servidor servidor);
	
	//Metodo que permite editar una instacia existente de un servidor en la BD
	
	public void editarServidor(Servidor servidor);
	
	/*
	 * Metodo que permite realizar una busqueda de una categoria a partir de una
	 * palabra clave en su atributo modelo
	 * @param cadena Keyword para realizar la busqueda
	 * @return Listado de entidades de tipo Servidor que coinciden con el string de busqueda
	 */
	public List<Servidor> buscarServidor(String modelo);
	
	
	
	
	
}
