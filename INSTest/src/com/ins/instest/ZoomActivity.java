package com.ins.instest;

import android.os.Bundle;
import android.app.Activity;


public class ZoomActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_zoom);
		TouchImageView img = (TouchImageView) findViewById(R.id.zoom_map);
		img.setMaxZoom(4);
	}

}
