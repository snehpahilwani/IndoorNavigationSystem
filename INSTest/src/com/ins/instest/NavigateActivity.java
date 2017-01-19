package com.ins.instest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class NavigateActivity extends Activity {
	
	private AutoCompleteTextView autocomp;
	private ArrayAdapter<String> adap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_navigate);
		
		TextView d = (TextView)findViewById(R.id.dest);
        Typeface font_d = Typeface.createFromAsset(this.getAssets(), "font/destructobeambb_reg.ttf");
        d.setTypeface(font_d);
        
        String[] colors = getResources().getStringArray(R.array.destlist);
        adap = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,colors);        
        
        autocomp = (AutoCompleteTextView) findViewById(R.id.auto_complete);
        autocomp.setDropDownBackgroundResource(R.drawable.dropback1);
        autocomp.setAdapter(adap);
        autocomp.setThreshold(1);
        
        TextView txt = (TextView)findViewById(R.id.auto_complete);
        Typeface font = Typeface.createFromAsset(this.getAssets(), "font/destructobeambb_reg.ttf");
        txt.setTypeface(font);
        txt.setTextColor(Color.GREEN);
        
        Button btntxt = (Button)findViewById(R.id.path_btn);
        btntxt.setTypeface(font);
        Button btn = (Button)findViewById(R.id.path_btn);
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(NavigateActivity.this,PathActivity.class);
				NavigateActivity.this.startActivity(intent);				
				
			}
		} );
        
	}

}
