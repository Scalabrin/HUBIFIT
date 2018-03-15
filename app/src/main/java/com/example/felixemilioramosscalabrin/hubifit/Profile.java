package com.example.felixemilioramosscalabrin.hubifit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        if (AccessToken.getCurrentAccessToken() == null){
            goLoginScreen();

        }



    TextView name2 = (TextView) findViewById(R.id.namee2);
    name2.setText(getIntent().getExtras().getString("name"));
    }

    private void goLoginScreen() {

        Intent intent = new Intent (this, Login.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP| intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }


    public void g_favorites(View view) {
        Intent intent = new Intent(Profile.this,Favoritos.class);
        startActivity(intent);
    }

    public void logut(View view) {
        LoginManager.getInstance().logOut();

        Intent intent = new Intent (this, Login.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP| intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);




    }

    public void g_profile(View view) {
        Intent intent = new Intent(Profile.this,Profile.class);
        startActivity(intent);
    }

    public void g_Search(View view) {
        Intent intent = new Intent(Profile.this,Favoritos.class);
        startActivity(intent);
    }
}

