package com.ins.instest;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
//import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstActivity extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first_page);
		TextView tv = (TextView)findViewById(R.id.heading);
        Typeface font = Typeface.createFromAsset(this.getAssets(), "font/destructobeambb_reg.ttf");
        tv.setTypeface(font);
		ImageView img = (ImageView)findViewById(R.id.button_final);
		img.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(FirstActivity.this, MainActivity.class);
				FirstActivity.this.startActivity(intent);
				FirstActivity.this.finish();
			}
		});
	}
}
