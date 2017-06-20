package Beans;

import java.sql.ResultSet;

public class BeanCuenta {
	DAO.CuentaDAO ins=new
			 DAO.CuentaDAO ();

	 
	 public ResultSet Buscar(int cod){
		return ins.Buscar(cod); 
	 }
	 
	 public ResultSet Ingresar(int cod_cli,String num ,String tipo ,String moneda ,double monto){
     	return ins.Ingresar(cod_cli, num, tipo, moneda, monto);
	 }
	 
	 public ResultSet Modificar(int cod_cli,String num ,String tipo ,String moneda ,double monto,int cod){
		return ins.Modificar(cod_cli, num, tipo, moneda, monto, cod);
	 }
	 
	 public ResultSet Eliminar(int cod){
		 return ins.Eliminar(cod);
	 }
}
