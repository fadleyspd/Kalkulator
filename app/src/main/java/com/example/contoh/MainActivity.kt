package com.example.contoh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    // Deklarasi Variable
    private lateinit var panjang: EditText
    private lateinit var lebar: EditText
    private lateinit var tinggi: EditText
    private lateinit var hasil: TextView
    private lateinit var tombol: Button

    companion object{
        private const val STATE_RESULT = "state_result"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Inisialisasi Variable
        panjang = findViewById(R.id.edt_length)
        lebar = findViewById(R.id.edt_width)
        tinggi = findViewById(R.id.edt_height)
        tombol = findViewById(R.id.btn_result)
        hasil = findViewById(R.id.result)

        tombol.setOnClickListener(this)

        if (savedInstanceState != null) {
            hasil.text = savedInstanceState.getString(STATE_RESULT)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT, hasil.text.toString())

    }
    override fun onClick(v: View?) {
         if (v?.id==R.id.btn_result){
             val panjang = panjang.text.toString().trim()
             val lebar = lebar.text.toString().trim()
             val tinggi = tinggi.text.toString().trim()
             val volume = panjang.toDouble() * lebar.toDouble() * tinggi.toDouble()
             hasil.text = volume.toString()
         }
    }
}