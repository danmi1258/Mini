package com.mini.mn.ui;

import android.content.Intent;
import android.os.Bundle;

import com.mini.mn.R;

public class WeclomeActivity extends BaseAcivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.welcome_activity_layout);
	}
	
	@Override
	protected void onResume() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Intent intent = new Intent(this,MainActivity.class);
		startActivity(intent);
		finish();
		super.onResume();
	}
	
}
