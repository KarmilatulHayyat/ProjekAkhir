package com.example.projekakhir;     //merupakan sebuah alamat direktori dan pengelompokan codingan file-file java.

import androidx.appcompat.app.AppCompatActivity;    //default bawaan saat membuat project baru.

import android.content.Intent;      //untuk membaca Data dengan  tipe berbentuk String, angka (integer, float, double), ArrayList, boolean, array, character,
                                    // dan sebagainya, jadi Fungsi untuk memasukan atau memanggil data - data tersebut
import android.os.Bundle;           //digunakan untuk menyimpan state ,dari Aplikasi yang sedang di jalankan.
                                    //Jadi Jika kita sedang mengembangkan Aplikasi yang Kompleks,kita akan membutuhkan banyak package,
                                    // yang sesuai dengan ,Aplikasi yang sedang kita kembangkan.
import android.view.View;           //untuk menamppilkan data dari Aplikasi.

public class MainActivity extends AppCompatActivity {       //Sub Class yang bernama MainActivity  dengan keyword extends ,yang digunakan untuk
                                                            // mewariskan sifat-sifat yang ada di dalam Super Class AppCompatActivity
    int a=1; //BIAR BISA NGECOMMIT
    @Override                   //subclass untuk mengubah variabel. Mengubah di sini bisa berarti menggantikan perintah,
                                    // membuat perintah baru, mengembangkan perintah, dan memodifikasi perintah.
    protected void onCreate(Bundle savedInstanceState) {    //method onCreate digunakan untuk membuat Activity pertama kali ,dengan cara overriding atau memposisikan method yang udah ada.
                                                            //Saat Aplikasi dijalankan pertama kali, Berisi tipe data Bundle ,dan juga parameter savedInstanceState.
        super.onCreate(savedInstanceState); //Keyword super  pada Bahasa Permrograman Java ,   berfungsi sebagai variable referensi class , yang digunakan untuk rujukan dari Super Class atau Parent class
        setContentView(R.layout.activity_main); //setContentView merupakan  method yang dipanggil
    }

    public void tambah(View view) { //method untuk menuju halaman tambah data
        Intent intent = new Intent(MainActivity.this, ActivityTambahdata.class); //intent unutk menuju halaman tambah data.
                                                                //intent sendiri merupakan object untuk memanggil atau menyambungkan activity yang satu dengan yang lainnya.
        startActivity(intent); //digunakan untuk memulai activity.
    }

    public void lihat(View view) {  //method untuk menuju halaman Lihat Data.
        Intent intent = new Intent(MainActivity.this, Lihatdata.class);     //fungsi untuk pindah ke page LihatData
        startActivity(intent);      //memulai activity.
    }
}
