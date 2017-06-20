package com.example.sistemabancario;

import java.sql.ResultSet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cuentas2 extends Activity {
	EditText txt1,txt2,txt3,txt4,txt5,txt6;	
	Button btn1,btn2,btn3,btn4,btn5,btn6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cuentas2);
		
		StrictMode.ThreadPolicy politict = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(politict);
		
		 txt1=(EditText)findViewById(R.id.editText1);
			txt2=(EditText)findViewById(R.id.editText2);
		  txt3=(EditText)findViewById(R.id.editText3);
			txt4=(EditText)findViewById(R.id.editText4);
			  txt5=(EditText)findViewById(R.id.editText5);
			  txt6=(EditText)findViewById(R.id.editText6);
			btn1 = (Button)findViewById(R.id.button1);
			btn2 = (Button)findViewById(R.id.button2);
			btn3 = (Button)findViewById(R.id.button3);
			btn4 = (Button)findViewById(R.id.button4);
			btn5 = (Button)findViewById(R.id.button5);
			btn6 = (Button)findViewById(R.id.button6);

			btn2.setOnClickListener(new OnClickListener() {
				@Override
				
			public void onClick(View v) {
					try{  
	  Beans.BeanCuenta ins=new Beans.BeanCuenta();
	  int cod_cli = Integer.parseInt(String.valueOf(txt2.getText()));
	    String tipo = String.valueOf(txt4.getText());
	    String moneda= String.valueOf(txt5.getText());
	    String num=  String.valueOf(txt3.getText());
	    double monto= Double.parseDouble(String.valueOf(txt6.getText()));
	 ResultSet rs=ins.Ingresar(cod_cli, num, tipo, moneda, monto);
	 Toast.makeText(getApplicationContext(),"Registro Ingresado",Toast.LENGTH_SHORT).show();
		
					}catch(Exception e){
						Toast.makeText(getApplicationContext(),String.valueOf(e),Toast.LENGTH_SHORT).show();}	
				}
			});
			
			btn3.setOnClickListener(new OnClickListener() {
				@Override
				
			public void onClick(View v) {
					try{  
		Beans.BeanCuenta ins=new Beans.BeanCuenta();
	    int cod = Integer.parseInt(String.valueOf(txt1.getText()));
	 ResultSet rs=ins.Eliminar(cod);     
	 Toast.makeText(getApplicationContext(),"Registro Eliminado",Toast.LENGTH_SHORT).show();
					}catch(Exception e){
						Toast.makeText(getApplicationContext(),String.valueOf(e),Toast.LENGTH_SHORT).show();}	
				}
			});
				
			btn4.setOnClickListener(new OnClickListener() {
				@Override
				
			public void onClick(View v) {
					try{  
		Beans.BeanCuenta ins=new Beans.BeanCuenta();
		  int cod_cli = Integer.parseInt(String.valueOf(txt2.getText()));
		    String tipo = String.valueOf(txt4.getText());
		    String moneda= String.valueOf(txt5.getText());
		    String num=  String.valueOf(txt3.getText());
		    double monto= Double.parseDouble(String.valueOf(txt6.getText()));
	    int cod =  Integer.parseInt(String.valueOf(txt1.getText()));
	    ResultSet rs=ins.Modificar(cod_cli, num, tipo, moneda, monto, cod);
	 Toast.makeText(getApplicationContext(),"Registro Modificado",Toast.LENGTH_SHORT).show();
					}catch(Exception e){
						Toast.makeText(getApplicationContext(),String.valueOf(e),Toast.LENGTH_SHORT).show();}	
				}
			});
				
			btn6.setOnClickListener(new OnClickListener() {
				@Override
				
			public void onClick(View v) {
					try{  
		Beans.BeanCuenta ins=new Beans.BeanCuenta();
	    int cod = Integer.parseInt(String.valueOf(txt1.getText()));
	    int c=0;
	 ResultSet rs=ins.Buscar(cod);	     
		while(rs.next()){
			txt2.setText(String.valueOf(rs.getString(2)));
			txt4.setText(String.valueOf(rs.getString(4)));
			txt5.setText(String.valueOf(rs.getString(5)));
			txt3.setText(String.valueOf(rs.getString(3)));
		    txt6.setText(String.valueOf(rs.getString(6)));
			 c++;
		}
					
		if(c > 0){
		Toast.makeText(getApplicationContext(),"Registro Encontrado",Toast.LENGTH_SHORT).show();}
		else{Toast.makeText(getApplicationContext(),"Registro NO Existente",Toast.LENGTH_SHORT).show();}
					}catch(Exception e){
						Toast.makeText(getApplicationContext(),String.valueOf(e),Toast.LENGTH_SHORT).show();}	
				}
				
			});
			
			
			btn5.setOnClickListener(new OnClickListener() {
				@Override
				
			public void onClick(View v) {
					try{  
            
              txt2.setText("");
              txt3.setText("");
              txt4.setText("");
              txt5.setText("");
              txt6.setText("");
					}catch(Exception e){
						Toast.makeText(getApplicationContext(),String.valueOf(e),Toast.LENGTH_SHORT).show();}	
				}
			});
			
			btn1.setOnClickListener(new OnClickListener() {
				@Override
				
			public void onClick(View v) {
					try{
			             //Invocando  otro activity
			           Intent intent = new Intent(getApplicationContext(),Mantenimientos.class);
			           startActivity(intent);
			         }catch(Exception e){
								Toast.makeText(getApplicationContext(),String.valueOf(e),Toast.LENGTH_SHORT).show();}			
				}
			});	
			
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cuentas2, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
