package com.quiz;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;


public class PQuiz extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pquiz);
	}


	public void onClick(View view) {
    	Intent i=new Intent(this,Q1.class);
    	startActivity(i);
    }
	
}
