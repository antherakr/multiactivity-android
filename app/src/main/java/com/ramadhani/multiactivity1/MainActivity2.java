package com.ramadhani.multiactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
    private EditText suhuAwalEditText;
    private TextView suhuKonversiTextView;
    private RadioButton rbcelcius, rbfahrenheit, rbkelvin, rbcelcius2, rbfahrenheit2, rbkelvin2;
    private Button konversiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        suhuAwalEditText = findViewById(R.id.suhu_awal);
        suhuKonversiTextView = findViewById(R.id.suhu_konversi);
        rbcelcius = findViewById(R.id.rbcelcius);
        rbfahrenheit = findViewById(R.id.rbfahrenheit);
        rbkelvin = findViewById(R.id.rbkelvin);
        rbcelcius2 = findViewById(R.id.rbcelcius2);
        rbfahrenheit2 = findViewById(R.id.rbfahrenheit2);
        rbkelvin2 = findViewById(R.id.rbkelvin);
        konversiButton = findViewById(R.id.btkonversi);

        konversiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double suhuAwal = Double.parseDouble(suhuAwalEditText.getText().toString());
                double suhuKonversi = 0;

                if (rbcelcius.isChecked()) {
                    if (rbcelcius2.isChecked()) {
                        suhuKonversi = suhuAwal;
                    } else if (rbfahrenheit2.isChecked()) {
                        suhuKonversi = (suhuAwal * 1.8) + 32;
                    } else if (rbkelvin2.isChecked()) {
                        suhuKonversi = suhuAwal + 273.15;
                    }
                } else if (rbfahrenheit.isChecked()) {
                    if (rbcelcius2.isChecked()) {
                        suhuKonversi = (suhuAwal - 32) * 5 / 9.0;
                    } else if (rbfahrenheit2.isChecked()) {
                        suhuKonversi = suhuAwal;
                    } else if (rbkelvin2.isChecked()) {
                        suhuKonversi = (suhuAwal - 32) * 5 / 9.0 + 273.15;
                    }
                } else if (rbkelvin.isChecked()) {
                    if (rbcelcius2.isChecked()) {
                        suhuKonversi = suhuAwal - 273.15;
                    } else if (rbfahrenheit2.isChecked()) {
                        suhuKonversi = (suhuAwal - 273.15) * 1.8 + 32;
                    } else if (rbkelvin2.isChecked()) {
                        suhuKonversi = suhuAwal;
                    }
                }

                suhuKonversiTextView.setText(String.valueOf(suhuKonversi));
            }
        });
    }
    public void pindah0(View view){
        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
    }
    public void pindah2(View view){
        Intent intent = new Intent(MainActivity2.this,MainActivity1.class);
        startActivity(intent);
    }
    public void pindah3(View view){
        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(intent);
    }
    public void pindah4(View view){
        Intent intent = new Intent(MainActivity2.this,MainActivity4.class);
        startActivity(intent);
    }
}









