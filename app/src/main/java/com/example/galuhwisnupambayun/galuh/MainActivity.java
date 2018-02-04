package com.example.galuhwisnupambayun.studycase_galuh_1202150076;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.galuhwisnupambayun.galuh.R;

public class MainActivity extends AppCompatActivity {

    private EditText namaMenu, jumlahPesan;
    private Button tempatMakan, tempatMakan2;
    private TextView tmptMakan;

    private int totalUang = 65500;

    private int jumlahPorsi, hasil;


    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namaMenu = (EditText) findViewById(R.id.menuMakanan);
        jumlahPesan = (EditText) findViewById(R.id.jumlahPorsi);
        tmptMakan = (TextView) findViewById(R.id.restaurant);

    }

    public void pilihEatbus(View view) {


        String menu = namaMenu.getText().toString();
        String jumlah = jumlahPesan.getText().toString();
        jumlahPorsi = Integer.parseInt(jumlah.trim());

        hasil = jumlahPorsi * 50000;

        Bundle bundle = new Bundle();
        bundle.putString("Menu", menu);

        bundle.putString("Jumlah", jumlah);

        bundle.putString("Total", String.valueOf(hasil));

        bundle.putString("tempatMakan", "Eatbus");


        if (hasil > totalUang) {
            Toast.makeText(this, "Jangan disini makan malamnya, totalUang kamu tidak cukup", Toast.LENGTH_LONG).show();
        }


    }

    public void pilihAbnormal(View view) {

        String menu = namaMenu.getText().toString();
        String jumlah = jumlahPesan.getText().toString();
        jumlahPorsi = Integer.parseInt(jumlah.trim());

        hasil = jumlahPorsi * 30000;

        Bundle bundle = new Bundle();
        bundle.putString("Menu", menu);

        bundle.putString("Jumlah",jumlah);

        bundle.putString("Total",String.valueOf(hasil));

        bundle.putString("tempatMakan","Abnormal");

        Intent a = new Intent(this,Hasil.class);

        a.putExtras(bundle);

        startActivity(a);

        if (hasil < totalUang){
            Toast.makeText(this,"Disini aja Makan Malamnya",Toast.LENGTH_LONG).show();
        }
    }
}