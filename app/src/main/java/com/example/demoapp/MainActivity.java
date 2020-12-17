package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void TakeMePlugin1(View view) throws ClassNotFoundException {
        if(view.getId()==R.id.button1){
            Intent intent = new Intent(MainActivity.this,Class.forName("com.example.plugin1.plugin1"));
            if(intent!=null) {
                startActivity(intent);
            }
        }
    }
    public void TakeMePlugin2(View view) throws ClassNotFoundException {
        if(view.getId()==R.id.button2){
            Intent intent = new Intent(MainActivity.this,Class.forName("com.example.plugin2.plugin2"));
            if(intent!=null){
                startActivity(intent);
            }
        }
    }
    public void TakeMePlugin3(View view) throws ClassNotFoundException {
        if(view.getId()==R.id.button3){
            Intent intent = new Intent(MainActivity.this,Class.forName("com.example.plugin3.plugin3"));
            if(intent!=null){
                startActivity(intent);
            }
        }
    }
    public void TakeMePlugin4(View view) throws ClassNotFoundException {
        if(view.getId()==R.id.button4){
            Intent intent = new Intent(MainActivity.this,Class.forName("com.example.plugin4.plugin4"));
            if(intent!=null){
                startActivity(intent);
            }
        }
    }
}