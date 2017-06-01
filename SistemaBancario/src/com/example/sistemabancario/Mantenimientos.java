package com.example.sistemabancario;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Mantenimientos extends Activity {
	Button btn1,btn2,btn3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mantenimientos);
		btn1 = (Button)findViewById(R.id.button1);
		btn2 = (Button)findViewById(R.id.button2);
		
		btn1.setOnClickListener(new OnClickListener() {
			@Override
			
		public void onClick(View v) {
				try{
             //Invocando  otro activity
           Intent intent = new Intent(getApplicationContext(),Usuarios.class);
           startActivity(intent);
         }catch(Exception e){
					Toast.makeText(getApplicationContext(),String.valueOf(e),Toast.LENGTH_SHORT).show();}		
		}
	});
		
		btn2.setOnClickListener(new OnClickListener() {
			@Override
			
		public void onClick(View v) {
				try{
             //Invocando  otro activity
           Intent intent = new Intent(getApplicationContext(),Clientes.class);
           startActivity(intent);
         }catch(Exception e){
					Toast.makeText(getApplicationContext(),String.valueOf(e),Toast.LENGTH_SHORT).show();}		
		}
	});
		
		btn3.setOnClickListener(new OnClickListener() {
			@Override
			
		public void onClick(View v) {
				try{
             //Invocando  otro activity
           Intent intent = new Intent(getApplicationContext(),Cuentas.class);
           startActivity(intent);
         }catch(Exception e){
					Toast.makeText(getApplicationContext(),String.valueOf(e),Toast.LENGTH_SHORT).show();}		
		}
	});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mantenimientos, menu);
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
