package com.my.ab;

import android.app.*;
import android.os.*;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		findViewById(R.id.button1).setOnClickListener(new OnClickListener(){
				public void onClick(View arg0) {
					AboutBox.Show(MainActivity.this);
				}
			});

		findViewById(R.id.bt).setOnClickListener(new OnClickListener(){
				public void onClick(View arg0) {
					AboutBox.Sho(MainActivity.this);


				}});
				

		findViewById(R.id.bt1).setOnClickListener(new OnClickListener(){
				public void onClick(View arg0) {
					AboutBox.She(MainActivity.this);

					}
				
				
				
				
				
				});}}
		
	
		
		

			

	
