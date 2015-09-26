package com.quiz;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Student extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.student);
	}

	 public void onClick(View view) {
	    	Intent i=new Intent(this,LogIn.class);
	    	startActivity(i);
	    }
	 
	 public void onClickme(View view) {
	    	Intent b=new Intent(this,Quiz.class);
	    	startActivity(b);
	    }
}
