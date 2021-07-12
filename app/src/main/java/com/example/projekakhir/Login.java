package com.example.projekakhir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;              //Menampilkan PopUp
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    EditText username, password;            //menampilkan view edit text berupa username dan password.
    Button btnLogin;                //menampilkan view button dibawah edit text.

    int a=1; //BIAR BISA DI COMMIT
    @Override
    protected void onCreate(Bundle savedInstanceState) {  //penjelasan sama seperti di class MainActivity.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);      //membuat variabel untuk mengambil view data username
        password = (EditText) findViewById(R.id.password);      //--
        btnLogin = (Button)findViewById(R.id.btnLogin);         //--

        btnLogin.setOnClickListener(new View.OnClickListener() {        //memberikan even onclick ke button login.
            @Override
            public void onClick(View v) {       //method onClick

                String usernameKey = username.getText().toString();     //variebel untuk mengambill isi dari edittext
                String passwordKey = password.getText().toString();     //--

                if (usernameKey.equals("admin") && passwordKey.equals("admin")){        //mmbuat perintah dengan memasukkkan username admin dan password admin.
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",     //jika berhasil, akan ditampilkan toast berupa Login Sukses.
                            Toast.LENGTH_SHORT).show();                                             //mengatur durasi toast
                    Intent intent = new Intent(Login.this, MainActivity.class);     //intent untuk menuju mainactivity.
                    Login.this.startActivity(intent);       //intent untuk memulai activity login.
                    finish();       //fungsi untuk menutup login.
                }else {                                                                             //jika username dan passord tidak sesuai, maka akan menampilkan alertdialog atau popup
                    AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);       //dengan bertuliskan username atau password anda salah.
                    builder.setMessage("Username atau Password Anda salah!")
                            .setNegativeButton("Retry", null).create().show();      //setNegativeButton sendiri merupakan fungsi yang berupa tindakan untuk membatalkan tindakan.
                }
            }

        });

    }
}
