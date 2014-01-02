package com.centerorbit.hive_daq;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/** Called when the user clicks the Select a Colony */
	public void selectColony(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, ColonySelect.class);
		startActivity(intent);
	}

    /** Called when the user clicks the "Create New" */
    public void newColony(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, CreateColony.class);
        startActivity(intent);
    }

}
