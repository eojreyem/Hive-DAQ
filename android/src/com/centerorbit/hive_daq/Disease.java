package com.centerorbit.hive_daq;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by joe on 11/20/13.
 */
public class Disease extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);
    }

    public void Take_note(View view) {
        Toast.makeText(this.getApplicationContext(), "Take a Note", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, VisitNote.class);
        startActivity(intent);
    }
}