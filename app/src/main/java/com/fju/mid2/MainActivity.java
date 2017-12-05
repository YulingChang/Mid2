package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static int REQUEST_FUN = 102;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_FUN){
            Toast.makeText(this,"特殊功能",Toast.LENGTH_LONG).show();

        }

    }
    public void func1(View view){
        Intent intent1 = new Intent(this,Func1Activity.class);
        startActivityForResult(intent1,REQUEST_FUN);
    }
    public void func2(View view){
        Intent intent2 = new Intent(this,Func2Activity.class);
        startActivityForResult(intent2,REQUEST_FUN);
    }
    public void func3(View view){
        Intent intent3 = new Intent(this,Func3Activity.class);
        startActivityForResult(intent3,REQUEST_FUN);
    }
    public void func4(View view){
        Intent intent4 = new Intent(this,Func4Activity.class);
        startActivityForResult(intent4,REQUEST_FUN);
    }
    public void func5(View view){
        Intent intent5 = new Intent(this,Func5Activity.class);
        startActivityForResult(intent5,REQUEST_FUN);
    }



    public void func6(View view){
        Intent intent6 = new Intent(this,Func6Activity.class);
        startActivityForResult(intent6,REQUEST_FUN);
    }
    public void func7(View view){
        Intent intent7 = new Intent(this,Func7Activity.class);
        startActivityForResult(intent7,REQUEST_FUN);
    }
    public void func8(View view){
        Intent intent8 = new Intent(this,Func8Activity.class);
        startActivityForResult(intent8,REQUEST_FUN);
    }

}

