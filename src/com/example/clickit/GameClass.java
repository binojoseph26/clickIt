package com.example.clickit;


import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class GameClass extends Activity {

	Button b11, b12, b13, b14, b15, b16;
	Button b21, b22, b23, b24, b25, b26;
	Button b31, b32, b33, b34, b35, b36;
	Button b41, b42, b43, b44, b45, b46;
	Button b51, b52, b53, b54, b55, b56;
	Button b61, b62, b63, b64, b65, b66;

	Button Start;

	Animation a,ab;

	int flag=0;
	SoundPool sp;
	int explosion=0;
	Boolean isRunning=true;
	ProgressBar progress;
	Long startTime=System.currentTimeMillis();
	public static final String Tag=GameClass.class.getSimpleName(); 
	float per;
	int color=1;
	int[] b_color=new int[40];
	Button[] b=new Button[40];
	TextView tv1,tv2;
	public static String filename="OurSharedString";
	SharedPreferences someData;
	TextView Score,HighScore;
	String strInput;
	Vibrator v;
	Toast t;
	
	int[] idArray = { R.id.b11, R.id.b12, R.id.b13, R.id.b14, R.id.b15,
			R.id.b16, R.id.b21, R.id.b22, R.id.b23, R.id.b24, R.id.b25,
			R.id.b26, R.id.b31, R.id.b32, R.id.b33, R.id.b34, R.id.b35,
			R.id.b36, R.id.b41, R.id.b42, R.id.b43, R.id.b44, R.id.b45,
			R.id.b46, R.id.b51, R.id.b52, R.id.b53, R.id.b54, R.id.b55,
			R.id.b56, R.id.b61, R.id.b62, R.id.b63, R.id.b64, R.id.b65,
			R.id.b66 };
	int z,res;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		 requestWindowFeature(Window.FEATURE_NO_TITLE);
	 getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		 WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_main);
		sp=new SoundPool(5,AudioManager.STREAM_MUSIC,0);
		explosion=sp.load(this, R.raw.explosion, 1);
		v=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
		
		final Animation a = AnimationUtils.loadAnimation(this, R.anim.trans);
		final Animation ab = AnimationUtils.loadAnimation(this, R.anim.animation);

		a.reset();
		
		initvar();

		
		Start.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			
				finish();
				startActivity(getIntent());
				
			}
		});

		
		b[0].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[0].startAnimation(ab);
				
				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}
				
				if(b_color[0]==color)
				{
				//	Log.d(Tag, "Colored");
					new_color(0);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));			}
			}
		});

		b[1].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[1].startAnimation(ab);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[1]==color)
				{
					
					new_color(1);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
			}
		});

		b[2].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[2].startAnimation(ab);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[2]==color)
				{
					
					new_color(2);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}
				
			}
		});

		b[3].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[3].startAnimation(ab);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}


				if(b_color[3]==color)
				{
					
					new_color(3);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}
				
			}
		});
		
		b[4].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[4].startAnimation(ab);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[4]==color)
				{
					
					new_color(4);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}
				
			}
		});

		b[5].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[5].startAnimation(ab);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

			
				if(b_color[5]==color)
				{
					
					new_color(5);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[6].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[6].startAnimation(ab);
				b[0].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[6]==color)
				{
					new_color(6);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[7].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				b[7].startAnimation(ab);
				b[1].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[7]==color)
				{
					
					new_color(7);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[8].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[8].startAnimation(ab);
				b[2].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[8]==color)
				{
					
					new_color(8);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[9].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[9].startAnimation(ab);
				b[3].startAnimation(a);
				

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[9]==color)
				{
					
					new_color(9);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[10].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[10].startAnimation(ab);
				b[4].startAnimation(a);
				
				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[10]==color)
				{
					
					new_color(10);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});
		b[11].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[11].startAnimation(ab);
				b[5].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[11]==color)
				{
					
					new_color(11);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[12].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				b[12].startAnimation(ab);
				b[6].startAnimation(a);
				b[0].startAnimation(a);
				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}


				if(b_color[12]==color)
				{
					
					new_color(12);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[13].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[13].startAnimation(ab);
				b[7].startAnimation(a);
				b[1].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[13]==color)
				{
					
					new_color(13);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[14].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[14].startAnimation(ab);
				b[8].startAnimation(a);
				b[2].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[14]==color)
				{
					
					new_color(14);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[15].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[15].startAnimation(ab);
				b[9].startAnimation(a);
				b[3].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[15]==color)
				{
					
					new_color(15);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[16].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[16].startAnimation(ab);
				b[10].startAnimation(a);
				b[4].startAnimation(a);
				
				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[16]==color)
				{
					
					new_color(16);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[17].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[17].startAnimation(ab);
				b[11].startAnimation(a);
				b[5].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[17]==color)
				{
					
					new_color(17);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[18].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				b[18].startAnimation(ab);
				b[12].startAnimation(a);
				b[6].startAnimation(a);
				b[0].startAnimation(a);

				if(b_color[18]==color)
				{
					
					new_color(18);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[19].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[19].startAnimation(ab);
				b[13].startAnimation(a);
				b[7].startAnimation(a);
				b[1].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[19]==color)
				{
					
					new_color(19);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[20].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[20].startAnimation(ab);
				b[14].startAnimation(a);
				b[8].startAnimation(a);
				b[2].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[20]==color)
				{
					
					new_color(20);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}
				
			}
		});

		b[21].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[21].startAnimation(ab);
				b[15].startAnimation(a);
				b[9].startAnimation(a);
				b[3].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[21]==color)
				{
					
					new_color(21);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[22].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[22].startAnimation(ab);
				b[16].startAnimation(a);
				b[10].startAnimation(a);
				b[4].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[22]==color)
				{
					
					new_color(22);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[23].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[23].startAnimation(ab);
				b[17].startAnimation(a);
				b[11].startAnimation(a);
				b[5].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[23]==color)
				{
					
					new_color(23);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[24].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[24].startAnimation(ab);
				b[18].startAnimation(a);
				b[12].startAnimation(a);
				b[6].startAnimation(a);
				b[0].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[24]==color)
				{
					
					new_color(24);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[25].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[25].startAnimation(ab);
				b[19].startAnimation(a);
				b[13].startAnimation(a);
				b[7].startAnimation(a);
				b[1].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[25]==color)
				{
					
					new_color(25);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[26].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[26].startAnimation(ab);
				b[20].startAnimation(a);
				b[14].startAnimation(a);
				b[8].startAnimation(a);
				b[2].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[26]==color)
				{
					
					new_color(26);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[27].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[27].startAnimation(ab);
				b[21].startAnimation(a);
				b[15].startAnimation(a);
				b[9].startAnimation(a);
				b[3].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[27]==color)
				{
					
					new_color(27);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[28].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[28].startAnimation(ab);
				b[22].startAnimation(a);
				b[16].startAnimation(a);
				b[10].startAnimation(a);
				b[4].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[28]==color)
				{
					
					new_color(28);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[29].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[29].startAnimation(ab);
				b[23].startAnimation(a);
				b[17].startAnimation(a);
				b[10].startAnimation(a);
				b[5].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

					if(b_color[29]==color)
				{	
					
					new_color(29);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[30].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[30].startAnimation(ab);
				b[24].startAnimation(a);
				b[18].startAnimation(a);
				b[12].startAnimation(a);
				b[6].startAnimation(a);
				b[0].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[30]==color)
				{
					
					new_color(30);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[31].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[31].startAnimation(ab);
				b[25].startAnimation(a);
				b[19].startAnimation(a);
				b[13].startAnimation(a);
				b[7].startAnimation(a);
				b[1].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[31]==color)
				{
					
					new_color(31);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[32].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[32].startAnimation(ab);
				b[26].startAnimation(a);
				b[20].startAnimation(a);
				b[14].startAnimation(a);
				b[8].startAnimation(a);
				b[2].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[32]==color)
				{
					
					new_color(32);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[33].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[33].startAnimation(ab);
				b[27].startAnimation(a);
				b[21].startAnimation(a);
				b[15].startAnimation(a);
				b[9].startAnimation(a);
				b[3].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[33]==color)
				{
					
					new_color(33);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[34].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[34].startAnimation(ab);
				b[28].startAnimation(a);
				b[22].startAnimation(a);
				b[16].startAnimation(a);
				b[10].startAnimation(a);
				b[4].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[34]==color)
				{
					
					new_color(34);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

		b[35].setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				b[35].startAnimation(ab);
				b[29].startAnimation(a);
				b[23].startAnimation(a);
				b[17].startAnimation(a);
				b[11].startAnimation(a);
				b[5].startAnimation(a);

				switch(color)
				{
				case 1:
					tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
					break;
				case 2:
					tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
					break;
				case 3:
					tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
					break;
				case 4:
					tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
					break;
				case 5:
					tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
					break;
				}

				if(b_color[35]==color)
				{
					
					new_color(35);
					res=5+Integer.parseInt(Score.getText().toString());
					Score.setText(Integer.toString(res));
				}
				else
				{
					
				}

			}
		});

	
	//********************************************************************************
		
		new Thread()
		{
			public void run() {
		
				int limit=20;
			
				// TODO Auto-generated method stub
			while(isRunning)
				{
				per=(System.currentTimeMillis()-startTime);
				per=per/300;
				try {
					progress.setProgress((int)per);
					Thread.sleep(100);
					
//					 Log.d(Tag,"Per::"+per);
					
				if((int)per==limit)
				{
					color++;
					if(color>=6)
						color=1;
					limit=limit+20;
				}
				
				runOnUiThread(new Runnable(){
					public void run(){
				
						check(color);
					//	Log.d(Tag, "Post-Color::"+color);
						switch(color)
						{
						case 1:
							tv1.setTextColor(Color.rgb(00, 0xd0, 0xff));
							break;
						case 2:
							tv1.setTextColor(Color.rgb(0xcc, 0xff, 0x0f));
							break;
						case 3:
							tv1.setTextColor(Color.rgb(0xff, 0x0f, 0xff));
							break;
						case 4:
							tv1.setTextColor(Color.rgb(0x00, 0xff, 0x08));
							break;
						case 5:
							tv1.setTextColor(Color.rgb(0xff, 0x99, 0));
							break;
						}
						
						if(per>=100 && flag==0)
						{
							t=Toast.makeText(GameClass.this,"Time Out", Toast.LENGTH_SHORT);
							t.show();
							v.vibrate(500);
						}
						if(per>=100)
						{
							checkScore();
							flag=1;
						}
					}
				});
				
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}		
		}.start();
		
		someData=getSharedPreferences(filename,0);
			
	}
	public void setScore()
	{
		someData=getSharedPreferences(filename,0);
		String strScore=someData.getString("lvl1Score", "0");
		HighScore.setText(strScore);
	}

	public void checkScore()
	{
		String strScore=Score.getText().toString();
		String strHighScore=HighScore.getText().toString();
		
		if(Integer.parseInt(strScore)>Integer.parseInt(strHighScore))
		{
			SharedPreferences.Editor editor=someData.edit();
			editor.putString("lvl1Score",strScore);
			editor.commit();		
		}

		
	}
	
	public void check(int color)
	{
		int i;
		for(i=0;i<36;i++)
		{
			if(b_color[i]==color)
				break;
		}
		
		if(i==36)
		{
			Log.d(Tag, "Pre-Color::"+color);
			color++;
			Log.d(Tag, "Color::"+color);
			if(color>=6)
				color=1;
		}
	}
	private void initvar() {
		// TODO Auto-generated method stub
		
		tv1=(TextView)findViewById(R.id.tv1);
		
		Score=(TextView)findViewById(R.id.tvScore);
		HighScore=(TextView)findViewById(R.id.tvHighScore);
		tv1.setText("click it");
		tv1.setTextColor(Color.rgb(0, 0xd0, 0xff));
		Start=(Button)findViewById(R.id.bStart);
		
		for(int i=0;i<36;i++)
		{
			b[i]=(Button)findViewById(idArray[i]);
			//b[i].setOnClickListener(this);			
			
			int temp=(int) System.currentTimeMillis();
			temp=(int) (temp*Math.random());
			temp=temp%5+1;
			
			switch(temp)
			{
			case 1:
				b[i].setBackgroundResource(R.drawable.shape1);
				b_color[i]=1;
				break;
			case 2:
				b[i].setBackgroundResource(R.drawable.shape2);
				b_color[i]=2;
				break;
			case 3:
				b[i].setBackgroundResource(R.drawable.shape3);
				b_color[i]=3;
				break;
			case 4:
				b[i].setBackgroundResource(R.drawable.shape4);
				b_color[i]=4;
				break;
			case 5:
				b[i].setBackgroundResource(R.drawable.shape5);
				b_color[i]=5;
				break;
			}
		}	
		
		progress=(ProgressBar) findViewById(R.id.progressBar1);
		setScore();
	}
		
	private void new_color(int index) {
		// TODO Auto-generated method stub
		int temp,flag=0;
		sp.play(explosion, 1, 1, 0, 0, 1);
		
		while(flag==0)
		{
			temp=index-6;
			if(temp<1)
			{
				
				flag=1;
			    temp=(int) System.currentTimeMillis();
				temp=(int) (temp*Math.random());
				temp=temp%5+1;
				Log.d(Tag,"temp:"+temp);
				switch(temp)
				{
				case 1:
					b[index].setBackgroundResource(R.drawable.shape1);
					b_color[index]=1;
					break;
				case 2:
					b[index].setBackgroundResource(R.drawable.shape2);
					b_color[index]=2;
					break;
				case 3:
					b[index].setBackgroundResource(R.drawable.shape3);
					b_color[index]=3;
					break;
				case 4:
					b[index].setBackgroundResource(R.drawable.shape4);
					b_color[index]=4;
					break;
				case 5:
					b[index].setBackgroundResource(R.drawable.shape5);
					b_color[index]=5;
					break;
				}
			
			}
			
			switch(b_color[temp])
			{
			case 1:
				b[index].setBackgroundResource(R.drawable.shape1);
				b_color[index]=1;
				break;
			case 2:
				b[index].setBackgroundResource(R.drawable.shape2);
				b_color[index]=2;
				break;
			case 3:
				b[index].setBackgroundResource(R.drawable.shape3);
				b_color[index]=3;
				break;
			case 4:
				b[index].setBackgroundResource(R.drawable.shape4);
				b_color[index]=4;
				break;
			case 5:
				b[index].setBackgroundResource(R.drawable.shape5);
				b_color[index]=5;
				break;
			}
			index=temp;
		}
	}

}
