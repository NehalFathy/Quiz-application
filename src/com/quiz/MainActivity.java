
package com.quiz;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


   
    public void onClick(View view) {
    	Intent i=new Intent(this,SignUp.class);
    	startActivity(i);
    }
    
    public void onClickme(View view) {
    	Intent b=new Intent(this,LogIn.class);
    	startActivity(b);
    }
}
