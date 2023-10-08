package com.example.contoh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {

    companion object{
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_JUR = "extra_jurusan"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val tvDataReceived: TextView = findViewById(R.id.tv_data_received)

        // deklarasi
        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        val jur = intent.getStringExtra(EXTRA_JUR)
        val text = "Nama saya : $name dan saya berumur $age tahun, dan kuliah di jurusan $jur"
        tvDataReceived.text = text
    }
}