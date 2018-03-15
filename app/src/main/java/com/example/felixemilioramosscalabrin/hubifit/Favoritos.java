package com.example.felixemilioramosscalabrin.hubifit;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toolbar;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class Favoritos extends AppCompatActivity {

    GridView androidGridView;

    Integer[] imageIDs ={R.drawable.imagen1, R.drawable.imagen2
    //insercion de todas las imagenes.
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        androidGridView = (GridView) findViewById(R.id.gridview);
        androidGridView.setAdapter(new ImageAdapterGridView(this));

        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });



        }






    public void g_profile(View view) {
        Intent intent = new Intent(Favoritos.this,Profile.class);
        startActivity(intent);
    }

    public void g_favorites(View view) {
        Intent intent = new Intent(Favoritos.this,Favoritos.class);
        startActivity(intent);
    }

    public void g_Search(View view) {
        Intent intent = new Intent(Favoritos.this,Search.class);
        startActivity(intent);
    }
}
