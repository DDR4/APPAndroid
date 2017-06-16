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

public class Retiro extends Activity {
	EditText txt1,txt2,txt3,txt4,txt5,txt6;	
	Button btn1,btn2,btn3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_retiro);
		
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
		
		btn2.setOnClickListener(new OnClickListener() {
			@Override
			
		public void onClick(View v) {
				try{  
  Beans.BeanMovimiento ins=new Beans.BeanMovimiento();
  String dni = String.valueOf(txt2.getText());
    String clave = String.valueOf(txt3.getText());
    double monto= Double.parseDouble(String.valueOf(txt4.getText()));
    String tipo_cuenta=  String.valueOf(txt5.getText());
    String moneda=  String.valueOf(txt6.getText());
 ResultSet rs=ins.Retiro(dni, clave, monto, tipo_cuenta, moneda);
 Toast.makeText(getApplicationContext(),"Registro Ingresado",Toast.LENGTH_SHORT).show();
	
				}catch(Exception e){
					Toast.makeText(getApplicationContext(),String.valueOf(e),Toast.LENGTH_SHORT).show();}	
			}
		});
		

		btn3.setOnClickListener(new OnClickListener() {
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
		getMenuInflater().inflate(R.menu.retiro, menu);
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
