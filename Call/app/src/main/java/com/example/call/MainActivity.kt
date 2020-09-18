package com.example.call

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val phoneNumber="0799180558"
        btncall.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("Gọi "+ phoneNumber)
            startActivity(intent)
        }
    }
}