package com.tuxis.dev.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchePopularMovies(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launche my Popular Movies app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void launcheStockHawk(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launche my Stock Hawk app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void launcheBuilditBigger(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launche my Build it Bigger app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void launcheMakeYourAppMaterial(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launche my Make Your App Material app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void launcheGoUbiquitous(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launche my Go Ubiquitous app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void launcheCapstone(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launche my Capstone app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
