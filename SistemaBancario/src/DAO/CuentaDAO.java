package DAO;

import java.sql.CallableStatement;
import java.sql.ResultSet;

public class CuentaDAO {
	public static Conexion.Conexion  cn=new Conexion.Conexion();
	 public ResultSet Buscar(int cod){
		 ResultSet rs=null;
		 try{
		//Invocando al procedimiento almacenado	 
	     CallableStatement csmt=cn.Connexion().prepareCall("{call sp_Buscar_Cuenta(?)}");	 
		 //pasando parametro al csmt
		csmt.setInt(1, cod);
		//cargando el objeto rs
		rs=csmt.executeQuery();
		 }catch(Exception error){
	     System.out.print(error);		
		 }
		 return rs;
	 }
	 
	
	 
	 public ResultSet Ingresar(int cod_cli,String num ,String tipo ,String moneda ,double monto){
		 ResultSet rs=null;
		 try{
		//Invocando al procedimiento almacenado	 
	     CallableStatement csmt=cn.Connexion().prepareCall("{call sp_Insertar_Cuenta(?,?,?,?,?)}");	 
		 //pasando parametro al csmt
		csmt.setInt(1, cod_cli);
		csmt.setString(2,num);
		csmt.setString(3, tipo);
		csmt.setString(4, moneda);
		csmt.setDouble(5, monto);
		//cargando el objeto rs
		rs=csmt.executeQuery();
		 }catch(Exception error){
	     System.out.print(error);		
		 }
		 return rs;
	 }
	 
	 public ResultSet Modificar(int cod_cli,String num ,String tipo ,String moneda ,double monto,int cod){
		 ResultSet rs=null;
		 try{
		//Invocando al procedimiento almacenado	 
	     CallableStatement csmt=cn.Connexion().prepareCall("{call sp_Modificar_Cuenta(?,?,?,?,?,?)}");	 
		 //pasando parametro al csmt
	 	csmt.setInt(1, cod_cli);
		csmt.setString(2,num);
		csmt.setString(3, tipo);
		csmt.setString(4, moneda);
		csmt.setDouble(5, monto);
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
	     CallableStatement csmt=cn.Connexion().prepareCall("{call sp_Eliminar_Cuenta(?)}");	 
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
