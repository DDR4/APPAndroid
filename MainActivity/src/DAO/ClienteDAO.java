package DAO;
import java.io.*;
import java.sql.*;

public class ClienteDAO {
	public static Conexion.Conexion  cn=new Conexion.Conexion();
	 public ResultSet Buscar(int cod){
		 ResultSet rs=null;
		 try{
		//Invocando al procedimiento almacenado	 
	     CallableStatement csmt=cn.Connexion().prepareCall("{call sp_Buscar_Cliente(?)}");	 
		 //pasando parametro al csmt
		csmt.setInt(1, cod);
		//cargando el objeto rs
		rs=csmt.executeQuery();
		 }catch(Exception error){
	     System.out.print(error);		
		 }
		 return rs;
	 }
	 
	 public ResultSet Ingresar(String nom ,String ape ,String dni ,String clave){
		 ResultSet rs=null;
		 try{
		//Invocando al procedimiento almacenado	 
	     CallableStatement csmt=cn.Connexion().prepareCall("{call sp_Insertar_Cliente(?,?,?,?)}");	 
		 //pasando parametro al csmt
		csmt.setString(1, nom);
		csmt.setString(2, ape);
		csmt.setString(3, dni);
		csmt.setString(4, clave);
		//cargando el objeto rs
		rs=csmt.executeQuery();
		 }catch(Exception error){
	     System.out.print(error);		
		 }
		 return rs;
	 }
	 
	 public ResultSet Modificar(String nom ,String ape ,String dni ,String clave,int cod){
		 ResultSet rs=null;
		 try{
		//Invocando al procedimiento almacenado	 
	     CallableStatement csmt=cn.Connexion().prepareCall("{call sp_Modificar_Cliente(?,?,?,?,?)}");	 
		 //pasando parametro al csmt
		csmt.setString(1, nom);
		csmt.setString(2, ape);
		csmt.setString(3, dni);
		csmt.setString(4, clave);
		csmt.setInt(5, cod);
		//cargando el objeto rs
		rs=csmt.executeQuery();
		 }catch(Exception error){
	     System.out.print(error);		
		 }
		 return rs;
	 }
	 
		 
	 public ResultSet Eliminar(int cod){
		 ResultSet rs=null;
		 try{
		//Invocando al procedimiento almacenado	 
	     CallableStatement csmt=cn.Connexion().prepareCall("{call sp_Eliminar_Cliente(?)}");	 
		 //pasando parametro al csmt
		csmt.setInt(1, cod);
		//cargando el objeto rs
		rs=csmt.executeQuery();
		 }catch(Exception error){
	     System.out.print(error);		
		 }
		 return rs;
	 }
}
