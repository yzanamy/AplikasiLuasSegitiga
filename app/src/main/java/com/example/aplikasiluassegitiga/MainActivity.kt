package com.example.aplikasiluassegitiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtalas = findViewById<EditText>(R.id.txt_alas)
        val txttinggi = findViewById<EditText>(R.id.txt_tinggi)

        val btnHitung = findViewById<Button>(R.id.btn_hitung)
        val txtHasil = findViewById<TextView>(R.id.txt_hasil)

        btnHitung.setOnClickListener{
            val alas = txtalas.text.toString().trim()
            val tinggi = txttinggi.text.toString().trim()

            var isEmptyfield = false
            when {
                alas.isEmpty() -> {
                    isEmptyfield = true
                    txtalas.error = "Alas Tidak Boleh Kosong"
                }
                tinggi.isEmpty() -> {
                    isEmptyfield = true
                    txttinggi.error = "Tinggi Tidak Boleh Kosong"
                }
            }
            if (!isEmptyfield) {
                val hasil = 0.5 * alas.toDouble() * tinggi.toDouble()
                txtHasil.text = hasil.toString()
            }
        }
    }
}