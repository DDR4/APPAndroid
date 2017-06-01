package Beans;

import java.sql.ResultSet;

public class ClaseBeanUsuario {

	 DAO.UsuarioDAO ins=new
			 DAO.UsuarioDAO ();

	 public ResultSet Logeo(int dni,int clave){
		 return ins.Logeo(dni,clave);
	 }	 
	 
	 public ResultSet Buscar(int cod){
		return ins.Buscar(cod); 
	 }
	 
	 public ResultSet Ingresar(String nom ,String ape ,String dni ,String clave ,String tipo){
       	return ins.Ingresar(nom, ape, dni, clave, tipo);	 
	 }
	 
	 public ResultSet Modificar(String nom ,String ape ,String dni ,String clave,String tipo ,int cod){
		return ins.Modificar(nom, ape, dni, clave, tipo, cod);
	 }
	 
	 public ResultSet Eliminar(int cod){
		 return ins.Eliminar(cod);
	 }
}
