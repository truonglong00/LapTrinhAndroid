package com.example.bai1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)}
        override fun onStop() {
            super.onStop()
            Toast.makeText(applicationContext, "Stop", Toast.LENGTH_SHORT).show()
        }

        fun btnLogin(v: View) {
            if (edten.text.toString().equals("admin") && pw.text.toString().equals("123456")) {
                val intent = Intent(this,ProfileActivity::class.java)
                startActivity(intent)
            } else
                Toast.makeText(applicationContext, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show()
        }

        override fun onClick(p0: View?) {

        }

    }
