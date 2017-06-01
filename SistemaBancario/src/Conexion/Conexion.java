package Conexion;
import java.sql.*;
import java.io.*;
public class Conexion {
	public Connection  Connexion(){
		//public static void main(String [] args){	
		Connection cn = null;
		  try {
			  Class.forName("net.sourceforge.jtds.jdbc.Driver");
				cn=DriverManager.getConnection("jdbc:jtds:sqlserver://172.22.8.241:1433;databaseName=Sistema_Bancario","Enrique","123456");
					// System.out.println("Ingreso a BD");
		  }catch(Exception error){
			  System.out.println(error);
		  }
		  
		  return cn;
	  }
}
