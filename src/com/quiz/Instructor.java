package com.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class Instructor extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.instructor);
	}

	public void onClick(View view) {
    	Intent i=new Intent(this,LogIn.class);
    	startActivity(i);
    }

	public void onClickhere(View view) {
    	Intent c=new Intent(this,PQuiz.class);
    	startActivity(c);
    }
	
}
