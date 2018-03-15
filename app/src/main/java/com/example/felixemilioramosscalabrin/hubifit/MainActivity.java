package com.example.felixemilioramosscalabrin.hubifit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText usrname = (EditText)findViewById(R.id.namee);

        Button goProfile = (Button)findViewById(R.id.button1);
        goProfile.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {



                String nombre = usrname.getText().toString();

                Intent intent = new Intent(MainActivity.this,Profile.class);
                intent.putExtra("name",nombre.toString());
                startActivity(intent);
            }
        });


    }



}
