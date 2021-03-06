package com.transportec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.Objects;

public class ConsultBus_Main extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult_bus_main);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.consult_bus);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toolbar_actions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
                /*
            case R.id.btn_menu:
                Toast.makeText(PlanRuta.this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
                //*/
        }
        return super.onOptionsItemSelected(item);
    }

    public void goBusesTEC(View view) {
        Intent nextScreen = new Intent(this, ConsultBus_TEC.class);
        startActivity(nextScreen);
    }

    public void goOtrosBuses(View view) {
        Intent nextScreen = new Intent(this, ConsultBus_Otros.class);
        startActivity(nextScreen);
    }
}
