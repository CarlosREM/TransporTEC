package com.transportec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;

public class MainMenu extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.MainMenu_Title);
        setSupportActionBar(toolbar);

    }

    public void goConsultBuses(View view) {
        Intent nextScreen = new Intent(this, ConsultBus_Main.class);
        startActivity(nextScreen);
    }

    public void goConsultTrenes(View view) {
        Intent nextScreen = new Intent(this, drawerTest.class);
        startActivity(nextScreen);
    }

    public void goConsultTaxis(View view) {
        Intent nextScreen = new Intent(this, ConsultTaxis.class);
        startActivity(nextScreen);
    }

    public void goPlanRuta(View view) {
        Intent nextScreen = new Intent(this, PlanRuta.class);
        startActivity(nextScreen);
    }

    public void goAboutScreen(View view) {
        Intent nextScreen = new Intent(this, AboutScreen.class);
        startActivity(nextScreen);
        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
    }
}
