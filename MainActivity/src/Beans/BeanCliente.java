package Beans;

import java.sql.ResultSet;

public class BeanCliente {
	DAO.ClienteDAO ins=new
			 DAO.ClienteDAO ();

	 
	 public ResultSet Buscar(int cod){
		return ins.Buscar(cod); 
	 }
	 
	 public ResultSet Ingresar(String nom ,String ape ,String dni ,String clave){
      	return ins.Ingresar(nom, ape, dni, clave);	 
	 }
	 
	 public ResultSet Modificar(String nom ,String ape ,String dni ,String clave,int cod){
		return ins.Modificar(nom, ape, dni, clave, cod);
	 }
	 
	 public ResultSet Eliminar(int cod){
		 return ins.Eliminar(cod);
	 }
}
