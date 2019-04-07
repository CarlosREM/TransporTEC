package com.transportec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.MainMenu_Title);
        setSupportActionBar(toolbar);
    }

    public void goConsultBuses(View view) {
        Intent nextScreen = new Intent(this, ConsultBus_Main.class);
        startActivity(nextScreen);
    }

    public void goConsultTrenes(View view) {

    }

    public void goConsultTaxis(View view) {

    }

    public void goPlanRuta(View view) {

    }

    public void goAboutScreen(View view) {

    }
}
