package com.ins.instest;

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;*/

//import com.example.touchcoordinate.R;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.Toast;
//import android.widget.Button;

public class MapActivity extends Activity implements SensorEventListener{

	SensorManager sm;
	WifiManager wm;
	Bitmap workingBitmap, mutableBitmap;
	long oldTime = 0,currTime =0;
	//Paint paint;
	
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		
		sm = (SensorManager)getSystemService(SENSOR_SERVICE);
		Sensor s  = sm.getDefaultSensor(Sensor.TYPE_ORIENTATION);
		sm.registerListener(this, s, SensorManager.SENSOR_DELAY_NORMAL);
	}

	@Override
	public void onAccuracyChanged(Sensor arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		// TODO Auto-generated method stub
		currTime = System.currentTimeMillis();
		long dt = currTime - oldTime;
		if(dt>999)
		{
			BitmapFactory.Options myOptions = new BitmapFactory.Options();
			Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.map_final,myOptions);
	
		    workingBitmap = Bitmap.createBitmap(bitmap);
		    mutableBitmap = workingBitmap.copy(Bitmap.Config.ARGB_8888, true);
		    Paint paint = new Paint();
		    paint.setAntiAlias(true);
		    paint.setColor(Color.BLUE);
		    Canvas canvas = new Canvas(mutableBitmap);
			int declination = (int) event.values[0];
			wm = (WifiManager)this.getSystemService(Context.WIFI_SERVICE);
			//InputStreamReader is;
			int c = wm.getConnectionInfo().getRssi();
			//int c = getRSSIAverage();
			if(declination>=27 && declination<=60)
			{
				if(c>=74 && c<=77)
				{
					
					 canvas.drawCircle(340,480, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near OS Lab", Toast.LENGTH_SHORT);
					 toast.show();
				}
				else if(c<=73)
				{
					// Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(350,450, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near OS Lab", Toast.LENGTH_SHORT);
					 toast.show();
				}
				else if(c>=78 && c<=80)
				{
					//Canvas canvas = new Canvas(mutableBitmap);
					canvas.drawCircle(360,430, 10, paint);
					Toast toast = Toast.makeText(getApplicationContext(), "Near Programming Lab-1", Toast.LENGTH_SHORT);
					toast.show();
				}
				else if(c>=81)
				{
					//Canvas canvas = new Canvas(mutableBitmap);
					canvas.drawCircle(385,400, 10, paint);
					Toast toast = Toast.makeText(getApplicationContext(), "Near Programming Lab-1", Toast.LENGTH_SHORT);
					toast.show();
				}
				/*try {
					is = new InputStreamReader(getAssets().open("am_60ne.csv"));
					BufferedReader br = new BufferedReader(is);
					if(c>=74 && c<=77)
					{
					    Canvas canvas = new Canvas(mutableBitmap);
					    canvas.drawCircle(450,650, 10, paint);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			}
			else if(declination>=85 && declination<=120)
			{
				if(c<=79)
				{
					// Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(280,515, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near Admission Cell", Toast.LENGTH_SHORT);
					 toast.show();
				}
				else if(c>=80 && c<=82)
				{
					 //Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(255,510, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near Admission Cell", Toast.LENGTH_SHORT);
					 toast.show();
				}
				else if(c>=83 && c<=85)
				{
					 //Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(215,515, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near Admission Cell", Toast.LENGTH_SHORT);
					 toast.show();
				}
				else if(c>=86 && c<=90)
				{
					// Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(180,525, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near Staff Cubicle-1", Toast.LENGTH_SHORT);
					 toast.show();
				}
				else if(c>=91)
				{
					// Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(140,510, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near Staff Cubicle-2", Toast.LENGTH_SHORT);
					 toast.show();
				}
			}
			else if(declination>=2 && declination<=26)
			{
				if(c<=76)
				{
					// Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(280,515, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near Admission Cell", Toast.LENGTH_SHORT);
					 toast.show();
				}
				else if(c>=77 && c<=79)
				{
					// Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(255,510, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near Admission Cell", Toast.LENGTH_SHORT);
					 toast.show();
				}
				else if(c>=72 && c<=75)
				{
					// Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(215,515, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near Admission Cell", Toast.LENGTH_SHORT);
					 toast.show();
				}
				else if(c>=80 && c<=84)
				{
					// Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(180,525, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near Staff Cubicle-1", Toast.LENGTH_SHORT);
					 toast.show();
				}
				else if(c>=85)
				{
					// Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(140,510, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near Staff Cubicle-2", Toast.LENGTH_SHORT);
					 toast.show();
				}
			}
			else if(declination>=125 && declination<=150)
			{
				if(c<=72)
				{
					// Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(340,480, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near OS Lab", Toast.LENGTH_SHORT);
					 toast.show();
				}
				else if(c>=73 && c<=78)
				{
					// Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(350,450, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near OS Lab", Toast.LENGTH_SHORT);
					 toast.show();
				}
				else if(c>=79 && c<=82)
				{
					//Canvas canvas = new Canvas(mutableBitmap);
					canvas.drawCircle(360,430, 10, paint);
					Toast toast = Toast.makeText(getApplicationContext(), "Near Programming Lab-1", Toast.LENGTH_SHORT);
					toast.show();
				}
				else if(c>=83)
				{
					//Canvas canvas = new Canvas(mutableBitmap);
					canvas.drawCircle(385,400, 10, paint);
					Toast toast = Toast.makeText(getApplicationContext(), "Near Programming Lab-1", Toast.LENGTH_SHORT);
					toast.show();
				}
			}
			else if(declination>=183 && declination<=220)
			{
				if(c<=76)
				{
					// Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(280,515, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near Admission Cell", Toast.LENGTH_SHORT);
					 toast.show();
				}
				else if(c>=77 && c<=79)
				{
					// Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(255,510, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near Admission Cell", Toast.LENGTH_SHORT);
					 toast.show();
				}
				else if(c>=80 && c<=83)
				{
					// Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(215,515, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near Admission Cell", Toast.LENGTH_SHORT);
					 toast.show();
				}
				else if(c>=84 && c<=87)
				{
					// Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(180,525, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near Staff Cubicle-1", Toast.LENGTH_SHORT);
					 toast.show();
				}
				else if(c>=88)
				{
					// Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(140,510, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near Staff Cubicle-2", Toast.LENGTH_SHORT);
					 toast.show();
				}	
			}
			else if(declination>=290 && declination<=325)
			{
				if(c<=77)
				{
					// Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(340,480, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near OS Lab", Toast.LENGTH_SHORT);
					 toast.show();
				}
				else if(c>=78 && c<=84)
				{
					// Canvas canvas = new Canvas(mutableBitmap);
					 canvas.drawCircle(350,450, 10, paint);
					 Toast toast = Toast.makeText(getApplicationContext(), "Near OS Lab", Toast.LENGTH_SHORT);
					 toast.show();
				}
				else if(c>=85 && c<=88)
				{
					//Canvas canvas = new Canvas(mutableBitmap);
					canvas.drawCircle(360,430, 10, paint);
					Toast toast = Toast.makeText(getApplicationContext(), "Near Programming Lab-1", Toast.LENGTH_SHORT);
					toast.show();
				}
				else if(c>=89)
				{
					//Canvas canvas = new Canvas(mutableBitmap);
					canvas.drawCircle(385,400, 10, paint);
					Toast toast = Toast.makeText(getApplicationContext(), "Near Programming Lab-1", Toast.LENGTH_SHORT);
					toast.show();
				}
			}
			
			oldTime = currTime;
	}
}

}
