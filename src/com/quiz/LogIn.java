package com.quiz;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
public class LogIn extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.log_in);
	}

	 public void onClick(View view) {
	    	Intent i=new Intent(this, MainActivity.class);
	    	startActivity(i);
	    }

	 public void onClickme(View view) {
	    	Intent b=new Intent(this,Student.class);
	    	startActivity(b);
	    }
	 public void onClickhere(View view)
	 {
	    	Intent c=new Intent(this,Instructor.class);
	    	startActivity(c);
	    }
}
