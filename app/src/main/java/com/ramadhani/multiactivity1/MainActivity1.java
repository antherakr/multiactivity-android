package com.ramadhani.multiactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity1 extends AppCompatActivity {
     int skorA = 0;
     int skorB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        updateScore();
    }

    public void satupointA(View view) {
        skorA++;
        updateScore();
    }
    public void satuPointB(View view) {
        skorB++;
        updateScore();
    }
    public void duapointA(View view) {
        skorA += 2;
        updateScore();
    }
    public void duapointB(View view) {
        skorB += 2;
        updateScore();
    }
    public void tigapointA(View view) {
        skorA += 3;
        updateScore();
    }
    public void tigapointB(View view) {
        skorB += 3;
        updateScore();
    }
    public void resetScore(View view){
        skorA = 0;
        skorB = 0;
        updateScore();
    }

    private void updateScore() {
        TextView scoreViewA = findViewById(R.id.score_team_a);
        TextView scoreViewB = findViewById(R.id.score_team_b);
        scoreViewA.setText(String.valueOf(skorA));
        scoreViewB.setText(String.valueOf(skorB));
    }

    public void pindah0(View view){
        Intent intent = new Intent(MainActivity1.this,MainActivity.class);
        startActivity(intent);
    }
    public void pindah2(View view){
        Intent intent = new Intent(MainActivity1.this,MainActivity2.class);
        startActivity(intent);
    }
    public void pindah3(View view){
        Intent intent = new Intent(MainActivity1.this,MainActivity3.class);
        startActivity(intent);
    }
    public void pindah4(View view){
        Intent intent = new Intent(MainActivity1.this,MainActivity4.class);
        startActivity(intent);
    }
}