package com.fju.mid2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class Func1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
    }
    public void roll(View view){
        Random random = new Random();
        int r = random.nextInt(5)+1;
        Button b0 = (Button) findViewById(R.id.b0);
        new AlertDialog.Builder(this)
                .setTitle("number")
                .setMessage("數值: " + r)
                .setPositiveButton("OK",null)
                .show();


    }
}
