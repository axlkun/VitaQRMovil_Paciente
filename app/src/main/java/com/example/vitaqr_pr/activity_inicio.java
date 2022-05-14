package com.example.vitaqr_pr;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class activity_inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void iniciarActivityMenu(View view){
        Intent segAct=new Intent(this,MainActivity.class);
        startActivity(segAct);
    }
}