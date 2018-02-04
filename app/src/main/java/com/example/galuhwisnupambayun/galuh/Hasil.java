package com.example.galuhwisnupambayun.studycase_galuh_1202150076;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.galuhwisnupambayun.galuh.R;

public class Hasil extends AppCompatActivity {

    TextView namaMenu,jumlahPorsi,totalHarga,tempatMakan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        if (getIntent().getExtras()!=null){

            Bundle bundle = getIntent().getExtras();
            namaMenu.setText(bundle.getString("Menu Makanan"));
            jumlahPorsi.setText(bundle.getString("Jumlah Porsi"));
            totalHarga.setText(bundle.getString("Total Harga"));
            tempatMakan.setText(bundle.getString("Tempat Makan"));
        }

        else
        {
            namaMenu.setText(getIntent().getStringExtra("Menu Makanan"));
            jumlahPorsi.setText(getIntent().getStringExtra("Jumlah Porsi"));
            totalHarga.setText(getIntent().getStringExtra("Total Harga"));
            tempatMakan.setText(getIntent().getStringExtra("Tempat Makan"));
        }

    }
}
