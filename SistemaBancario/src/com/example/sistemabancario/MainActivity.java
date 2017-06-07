package com.example.sistemabancario;



import java.sql.*;
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


public class MainActivity extends Activity {
	Conexion.Conexion cn=new Conexion.Conexion();
	EditText txt1,txt2;	
	Button btn1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		StrictMode.ThreadPolicy politict = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(politict);
		
		    txt1=(EditText)findViewById(R.id.editText1);
			txt2=(EditText)findViewById(R.id.editText2);
			btn1 = (Button)findViewById(R.id.button1);
			try{
         	 if(cn != null){
				 Toast.makeText(getApplicationContext(),"Conexion OK",Toast.LENGTH_SHORT).show();
			    }
			}catch(Exception e){
				Toast.makeText(getApplicationContext(),String.valueOf(e),Toast.LENGTH_SHORT).show();}		
	
			btn1.setOnClickListener(new OnClickListener() {
					@Override
					
				public void onClick(View v) {
						try{  
		  Beans.ClaseBeanUsuario ins=new Beans.ClaseBeanUsuario();
	     	String dni=  String.valueOf(txt1.getText());
			int clave=  Integer.parseInt(String.valueOf(txt2.getText()));
		 ResultSet rs=ins.Logeo(dni, clave);	     
		int c=0;
		while(rs.next()){
	    String tipo= String.valueOf(rs.getString(3));
          c++;
		}

		if(c > 0){
		Toast.makeText(getApplicationContext(),"Bienvenido",Toast.LENGTH_SHORT).show();
		//Invocando a otro activity
		Intent intent = new Intent(getApplicationContext(),Presentacion.class);
		startActivity(intent);}  
		else{Toast.makeText(getApplicationContext(),"Dni y/o clave incorrectos",Toast.LENGTH_SHORT).show();}
		}catch(Exception e){
							Toast.makeText(getApplicationContext(),String.valueOf(e),Toast.LENGTH_SHORT).show();}		
				}
			
			});
			
	
			
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
