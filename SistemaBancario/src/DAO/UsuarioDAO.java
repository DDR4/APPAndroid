package DAO;
import java.io.*;
import java.sql.*;


public class UsuarioDAO {
	public static Conexion.Conexion  cn=new Conexion.Conexion();
	 public ResultSet Logeo(int dni,int clave){
		 ResultSet rs=null;
		 try{
		//Invocando al procedimiento almacenado	 
	     CallableStatement csmt=cn.Connexion().prepareCall("{call sp_Logeo(?,?)}");	 
		 //pasando parametro al csmt
		csmt.setInt(1, dni);
		csmt.setInt(2, clave);
		//cargando el objeto rs
		rs=csmt.executeQuery();
		 }catch(Exception error){
	     System.out.print(error);		
		 }
		 return rs;
	 }
	 
	 public ResultSet Buscar(int cod){
		 ResultSet rs=null;
		 try{
		//Invocando al procedimiento almacenado	 
	     CallableStatement csmt=cn.Connexion().prepareCall("{call sp_Buscar_Usuario(?)}");	 
		 //pasando parametro al csmt
		csmt.setInt(1, cod);
		//cargando el objeto rs
		rs=csmt.executeQuery();
		 }catch(Exception error){
	     System.out.print(error);		
		 }
		 return rs;
	 }
	 
	 public ResultSet Ingresar(String nom ,String ape ,String dni ,String clave ,String tipo){
		 ResultSet rs=null;
		 try{
		//Invocando al procedimiento almacenado	 
	     CallableStatement csmt=cn.Connexion().prepareCall("{call sp_Insertar_Usuario(?,?,?,?,?)}");	 
		 //pasando parametro al csmt
		csmt.setString(1, nom);
		csmt.setString(2, ape);
		csmt.setString(3, dni);
		csmt.setString(4, clave);
		csmt.setString(5, tipo);
		//cargando el objeto rs
		rs=csmt.executeQuery();
		 }catch(Exception error){
	     System.out.print(error);		
		 }
		 return rs;
	 }
	 
	 public ResultSet Modificar(String nom ,String ape ,String dni ,String clave,String tipo,int cod){
		 ResultSet rs=null;
		 try{
		//Invocando al procedimiento almacenado	 
	     CallableStatement csmt=cn.Connexion().prepareCall("{call sp_Modificar_Usuario(?,?,?,?,?,?)}");	 
		 //pasando parametro al csmt
		csmt.setString(1, nom);
		csmt.setString(2, ape);
		csmt.setString(3, dni);
		csmt.setString(4, clave);
		csmt.setString(5, tipo);
		csmt.setInt(6, cod);
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
	     CallableStatement csmt=cn.Connexion().prepareCall("{call sp_Eliminar_Usuario(?)}");	 
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
