package edu.orangecoastcollege.cs273.bfazeli.flagquiz;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * SettingsActivity is the activity to display a SettingsActivityFragment
 * on a landscape-oriented tablet.
 */
public class SettingsActivity extends AppCompatActivity {
    // inflates the GUI, displays Toolbar and adds "up" button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
