package com.example.magic8ball;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	private MagicBall mMagicBall = new MagicBall();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final TextView answerLabel = (TextView) findViewById(R.id.textView1);
		Button getAnswerButton = (Button) findViewById(R.id.button1);
		
		getAnswerButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				String answer = mMagicBall.getAnAnswer();
				
				answerLabel.setText(answer);
				
				animateMagic8Ball();
			}
		});
	}

	private void animateMagic8Ball() {
		ImageView magicBallImage = (ImageView) findViewById(R.id.imageView1);
		magicBallImage.setImageResource(R.drawable.ball_animation);
		AnimationDrawable ballAnimation = (AnimationDrawable) magicBallImage.getDrawable();
		if (ballAnimation.isRunning()) {
		ballAnimation.stop();
		}
		ballAnimation.start();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
