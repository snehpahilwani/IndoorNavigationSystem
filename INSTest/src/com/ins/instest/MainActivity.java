package com.ins.instest;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.ImageButton;
import android.widget.TextView;



public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_page);
		
		TextView op = (TextView)findViewById(R.id.option);
        Typeface font_op = Typeface.createFromAsset(this.getAssets(), "font/destructobeambb_reg.ttf");
        op.setTypeface(font_op);
		
		Button txt1 = (Button) findViewById(R.id.vbtn);  
		Typeface font1 = Typeface.createFromAsset(getAssets(), "font/destructobeambb_reg.ttf");  
		txt1.setTypeface(font1);
		Button viewbtn = (Button)findViewById(R.id.vbtn);
		viewbtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,ZoomActivity.class);
				MainActivity.this.startActivity(intent);	
				//MainActivity.this.finish();
				
			}
		});
		
		Button txt2 = (Button) findViewById(R.id.wmi);  
		Typeface font2 = Typeface.createFromAsset(getAssets(), "font/destructobeambb_reg.ttf");  
		txt2.setTypeface(font2);
		Button wbtn = (Button)findViewById(R.id.wmi);
		wbtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,MapActivity.class);
				MainActivity.this.startActivity(intent);	
				//MainActivity.this.finish();
			}
		});
		
		Button txt3 = (Button) findViewById(R.id.nav);  
		Typeface font3 = Typeface.createFromAsset(getAssets(), "font/destructobeambb_reg.ttf");  
		txt3.setTypeface(font3);
		Button nbtn = (Button)findViewById(R.id.nav);
		nbtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,MapActivity.class);
				MainActivity.this.startActivity(intent);	
				//MainActivity.this.finish();
			}
		});
	
	}
}



