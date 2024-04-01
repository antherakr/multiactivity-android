package com.ramadhani.multiactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    private EditText nilaiA, nilaiB, hasil;
    private RadioButton tambah, kurang, bagi, kali;
    private Button hitungButton;
    String operasi;
    float angka1, angka2, hasilnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        nilaiA = findViewById(R.id.etNilaiA);
        nilaiB = findViewById(R.id.etNilaiB);
        hasil = findViewById(R.id.ethasil);

        tambah = findViewById(R.id.rbtambah);
        kurang = findViewById(R.id.rbkurang);
        kali = findViewById(R.id.rbkali);
        bagi = findViewById(R.id.rbbagi);

        hitungButton = findViewById(R.id.bthitung);
        operasi = "";

        tambah.setOnClickListener(v -> {
            bersih();
            tambah.setChecked(true);
            operasi = "+";
        });
        kurang.setOnClickListener(v -> {
            bersih();
            kurang.setChecked(true);
            operasi = "-";
        });
        kali.setOnClickListener(v -> {
            bersih();
            kali.setChecked(true);
            operasi = "*";
        });
        bagi.setOnClickListener(v -> {
            bersih();
            bagi.setChecked(true);
            operasi = "/";
        });
        hitungButton.setOnClickListener(v -> {
            if(operasi == "+"){
                angka1 = Float.parseFloat(nilaiA.getText().toString());
                angka2 = Float.parseFloat(nilaiB.getText().toString());
                hasilnya = angka1+angka2;
                hasil .setText(String.valueOf(hasilnya));
            } else if(operasi == "-") {
                angka1 = Float.parseFloat(nilaiA.getText().toString());
                angka2 = Float.parseFloat(nilaiB.getText().toString());
                hasilnya = angka1 - angka2;
                hasil.setText(String.valueOf(hasilnya));
            } else if(operasi == "*") {
                angka1 = Float.parseFloat(nilaiA.getText().toString());
                angka2 = Float.parseFloat(nilaiB.getText().toString());
                hasilnya = angka1 * angka2;
                hasil.setText(String.valueOf(hasilnya));
            } else if(operasi == "/") {
                angka1 = Float.parseFloat(nilaiA.getText().toString());
                angka2 = Float.parseFloat(nilaiB.getText().toString());
                hasilnya = angka1 / angka2;
                hasil.setText(String.valueOf(hasilnya));
            } else {
                Toast.makeText(this, "Tidak bisa menghitung karena kosong", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void bersih() {
        tambah.setChecked(false);
        kurang.setChecked(false);
        kali.setChecked(false);
        bagi.setChecked(false);
    }

    public void pindah0(View view){
        Intent intent = new Intent(MainActivity3.this,MainActivity.class);
        startActivity(intent);
    }
    public void pindah2(View view){
        Intent intent = new Intent(MainActivity3.this,MainActivity1.class);
        startActivity(intent);
    }
    public void pindah3(View view){
        Intent intent = new Intent(MainActivity3.this,MainActivity2.class);
        startActivity(intent);
    }
    public void pindah4(View view){
        Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
        startActivity(intent);
    }
}