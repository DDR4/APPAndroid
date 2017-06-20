package DAO;

import java.sql.CallableStatement;
import java.sql.ResultSet;

public class MovimientoDAO {
	public static Conexion.Conexion  cn=new Conexion.Conexion();
	 public ResultSet Buscar(int cod){
		 ResultSet rs=null;
		 try{
		//Invocando al procedimiento almacenado	 
	     CallableStatement csmt=cn.Connexion().prepareCall("{call sp_Buscar_Movimiento(?)}");	 
		 //pasando parametro al csmt
		csmt.setInt(1, cod);
		//cargando el objeto rs
		rs=csmt.executeQuery();
		 }catch(Exception error){
	     System.out.print(error);		
		 }
		 return rs;
	 }
	
	 public ResultSet Consultar(String dni,String clave){
		 ResultSet rs=null;
		 try{
		//Invocando al procedimiento almacenado	 
	     CallableStatement csmt=cn.Connexion().prepareCall("{call sp_Consultar_Movimientos(?,?)}");	 
		 //pasando parametro al csmt
		csmt.setString(1, dni);
		csmt.setString(2, clave);
		//cargando el objeto rs
		rs=csmt.executeQuery();
		 }catch(Exception error){
	     System.out.print(error);		
		 }
		 return rs;
	 }
	
	
	 
	 public ResultSet Retiro(String dni,String clave ,double monto ,String tipo_cuenta,String moneda ){
		 ResultSet rs=null;
		 try{
		//Invocando al procedimiento almacenado	 
	     CallableStatement csmt=cn.Connexion().prepareCall("{call sp_Movimientos_Retiro(?,?,?,?,?)}");	 
		 //pasando parametro al csmt
		csmt.setString(1, dni);
		csmt.setString(2,clave);
		csmt.setDouble(3, monto);
		csmt.setString(4, tipo_cuenta);
		csmt.setString(5, moneda);
		//cargando el objeto rs
		rs=csmt.executeQuery();
		 }catch(Exception error){
	     System.out.print(error);		
		 }
		 return rs;
	 }
	 
	 public ResultSet Modificar(int cod_cuen,double monto,String fecha,String tipo,int cod){
		 ResultSet rs=null;
		 try{
		//Invocando al procedimiento almacenado	 
	     CallableStatement csmt=cn.Connexion().prepareCall("{call sp_Modificar_Movimiento(?,?,?,?,?)}");	 
		 //pasando parametro al csmt
	 	csmt.setInt(1, cod_cuen);
		csmt.setDouble(2,monto);
		csmt.setString(3, fecha);
		csmt.setString(4, tipo);
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
	     CallableStatement csmt=cn.Connexion().prepareCall("{call sp_Eliminar_Movimiento(?)}");	 
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
