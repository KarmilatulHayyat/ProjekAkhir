package com.example.projekakhir;

import android.app.Activity;            //
import android.os.Bundle;               //
import android.view.View;               //
import android.widget.Button;           //untuk semua import widget, berfungsi untuk memamnggil dan menampilkan widget yg dibutuhkan.
import android.widget.CheckBox;         //
import android.widget.EditText;         //
import android.widget.RadioButton;      //
import android.widget.RadioGroup;       //
import android.widget.TextView;         //

public class ActivityTambahdata extends Activity {      //Sub Class yang bernama ActivityTambahData  dengan keyword extends ,yang digunakan untuk
    // mewariskan sifat-sifat yang ada di dalam Activity
    int a=1;
    int gajiST, gajiPerHari, gajiawal;      //inisiali variabel yang dibutuhkan.
    RadioButton jm1, jm2, jm3, jm4;         //Radio buttton merupakan elemen layout yang digunakan untuk menginput data yang berupa pilihan yg hanya satu aja yg bisa dipilih.
    RadioGroup harikerja;                    //Radio group merupakan elemen layout yang digunakan untuk menginput data yang bisa dipilih bnyk.
    Button hitung; //elemen layout button
    CheckBox jeke; //elemen layout check box yang hanya bisa dipilih 1 komponen berupa jenis kelamin.

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);                 //penjelasan sama seperti di class MainActivity.
        setContentView(R.layout.activity_tambahdata);
    }

    public void hitung(View v) {                                            //method untuk menghitung gaji
        EditText nama = (EditText) findViewById(R.id.nama);                 //mebuat variabel dengan mengambil view berdasarkan id nama
        TextView outputNama = (TextView) findViewById(R.id.outputNama);     //--
        String name = nama.getText().toString();                            //variabel untuk mengambil text dari line 18.
        outputNama.setText("Total Gaji " + name);                           //menampilkan total gaji berdasarkan nama.
        jeke = (CheckBox) findViewById(R.id.laki);                           //membuat variabel untuk mengambil view check box
        jeke = (CheckBox) findViewById(R.id.perem);                          //--
        if (jeke.isChecked()) {                                             //jika dicek, gaji awal 75000, dan gaji setelah tambah.
            gajiawal = 75000;                                               //--
            gajiST = 1500000;                                               //
        }

        harikerja = (RadioGroup) findViewById(R.id.rgGolongan);     //variabel untuk mengambil view radio group.
        int jm = harikerja.getCheckedRadioButtonId();               //membuat variebel untuk mengambil id radio buuton
        gajiawal = 75000;
        if (jm == R.id.rbGolongan1) {                          //membuat pengkondisian dimana jika jam kerja sehari akan digaji 75000,
                                                        //dan jika ditambkan untuk beberapa hari akan bertambah total gaji sesuai dengan id radiogroup yang dipilih.
            gajiPerHari = gajiawal - 75000;
        } else if (jm == R.id.rbGolongan2) {
            gajiPerHari = gajiawal * 1;
        } else if (jm == R.id.rbGolongan3) {
            gajiPerHari = gajiawal * 2;
        } else if (jm == R.id.rbGolongan4) {
            gajiPerHari = gajiawal * 3;
        } else if (jm == R.id.rbGolongan5) {
            gajiPerHari = gajiawal * 4;
        }else if (jm == R.id.rbGolongan6) {
            gajiPerHari = gajiawal * 5;
        }else if (jm == R.id.rbGolongan7) {
            gajiPerHari = gajiawal * 6;
        }else if (jm == R.id.rbGolongan8) {
            gajiPerHari = gajiawal * 7;
        }else if (jm == R.id.rbGolongan9) {
            gajiPerHari = gajiawal * 8;
        }else if (jm == R.id.rbGolongan10) {
            gajiPerHari = gajiawal * 9;
        }else if (jm == R.id.rbGolongan11) {
            gajiPerHari = gajiawal * 10;
        }else if (jm == R.id.rbGolongan12) {
            gajiPerHari = gajiawal * 11;
        }else if (jm == R.id.rbGolongan13) {
            gajiPerHari = gajiawal * 12;
        }else if (jm == R.id.rbGolongan14) {
            gajiPerHari = gajiawal * 13;
        }else if (jm == R.id.rbGolongan15) {
            gajiPerHari = gajiawal * 14;
        }else if (jm == R.id.rbGolongan16) {
            gajiPerHari = gajiawal * 15;
        }else if (jm == R.id.rbGolongan17) {
            gajiPerHari = gajiawal * 16;
        }else if (jm == R.id.rbGolongan18) {
            gajiPerHari = gajiawal * 17;
        }else if (jm == R.id.rbGolongan19) {
            gajiPerHari = gajiawal * 18;
        }else if (jm == R.id.rbGolongan20) {
            gajiPerHari = gajiawal * 19;
        }else if (jm == R.id.rbGolongan21) {
            gajiPerHari = gajiawal * 20;
        }else if (jm == R.id.rbGolongan22) {
            gajiPerHari = gajiawal * 21;
        }else if (jm == R.id.rbGolongan23) {
            gajiPerHari = gajiawal * 22;
        }
        else if (jm == R.id.rbGolongan24) {
            gajiPerHari = gajiawal * 23;
        }
        else if (jm == R.id.rbGolongan25) {
            gajiPerHari = gajiawal * 24;
        }
        else if (jm == R.id.rbGolongan26) {
            gajiPerHari = gajiawal * 25;
        }

        int totalGaji = gajiawal + gajiPerHari;                         //membuat variabel total gaji
        int totalGajiplusbonus = gajiST + gajiPerHari;                  //membuat variabel totalgaji+bonus
        TextView total = (TextView) findViewById(R.id.outputGaji);      //menampilkan total gaji di textview
        total.setText(String.valueOf(totalGaji));
    }
}
