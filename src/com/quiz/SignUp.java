package com.quiz;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class SignUp extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_up);
	}

	 public void onClick(View view) {
	    	Intent i=new Intent(this,MainActivity.class);
	    	startActivity(i);
	    }
	   
}
