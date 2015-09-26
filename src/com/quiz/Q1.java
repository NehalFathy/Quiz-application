package com.quiz;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class Q1 extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.q1);
	}

	public void onClick(View view) {
    	Intent i=new Intent(this,PQuiz.class);
    	startActivity(i);
    }
	
}
