package com.example.projekakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Lihatdata extends AppCompatActivity {
    @Override //subclass untuk mengubah variabel. Mengubah di sini bisa berarti menggantikan perintah,
                // membuat perintah baru, mengembangkan perintah, dan memodifikasi perintah.


    protected void onCreate(Bundle savedInstanceState) {        //penjelasan sama seperti di class MainActivity.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihatdata);
    }
}

