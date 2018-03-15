package com.example.felixemilioramosscalabrin.hubifit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    public void g_profile(View view) {
        Intent intent = new Intent(Search.this,Profile.class);
        startActivity(intent);
    }

    public void g_favorites(View view) {
        Intent intent = new Intent(Search.this,Favoritos.class);
        startActivity(intent);
    }

    public void g_Search(View view) {
        Intent intent = new Intent(Search.this,Search.class);
        startActivity(intent);
    }
}
