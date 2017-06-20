package Beans;

import java.sql.ResultSet;


public class BeanMovimiento {
	DAO.MovimientoDAO ins=new
			 DAO.MovimientoDAO ();

	 
	 public ResultSet Buscar(int cod){
		return ins.Buscar(cod);
	 }
	 
	 public ResultSet Consultar(String dni,String clave){
		return ins.Consultar(dni, clave);
	 }
	 
	 public ResultSet Retiro(String dni,String clave ,double monto ,String tipo_cuenta,String moneda ){
    	return ins.Retiro(dni, clave, monto, tipo_cuenta, moneda);
	 }
	 
	 public ResultSet Modificar(int cod_cuen,double monto,String fecha,String tipo,int cod){
		return ins.Modificar(cod_cuen, monto, fecha, tipo, cod);
	 }
	 
	 public ResultSet Eliminar(int cod){
		 return ins.Eliminar(cod);
	 }
}
