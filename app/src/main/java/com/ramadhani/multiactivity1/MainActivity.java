package com.ramadhani.multiactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindah1 (View view){
        Intent intent = new Intent(MainActivity.this, MainActivity1.class);
        startActivity(intent);
    }
    public void pindah2 (View view){
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
    public void pindah3 (View view){
        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(intent);
    }
    public void pindah4 (View view){
        Intent intent = new Intent(MainActivity.this,MainActivity4.class);
        startActivity(intent);
    }
}