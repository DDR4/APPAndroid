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

public class Presentacion extends Activity {
	Button btn1;
	com.example.sistemabancario.MainActivity p=new com.example.sistemabancario.MainActivity(); 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_presentacion);
		btn1 = (Button)findViewById(R.id.button1);
		
		btn1.setOnClickListener(new OnClickListener() {
			@Override
			
		public void onClick(View v) {
				try{
		//Invocando a otro activity
				Intent intent = new Intent(getApplicationContext(),HOME.class);
				startActivity(intent);}catch(Exception e){
					Toast.makeText(getApplicationContext(),String.valueOf(e),Toast.LENGTH_SHORT).show();}		
		} });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.presentacion, menu);
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
