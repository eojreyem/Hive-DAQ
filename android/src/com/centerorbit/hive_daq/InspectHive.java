package com.centerorbit.hive_daq;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class InspectHive extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inspect_hive);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inspect_hive, menu);
		return true;
	}
	
	/** Called when the user clicks the Select a Hive */
	public void back(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, HiveSelect.class);
		startActivity(intent);
	}

}
