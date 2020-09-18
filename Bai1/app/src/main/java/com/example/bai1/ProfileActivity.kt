package com.example.bai1


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ProfileActivity: Activity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val value: Int = intent.getIntExtra("key", -1)
        Toast.makeText(applicationContext, "Đăng nhập Thành công", Toast.LENGTH_SHORT).show()

        fun btnLogout(v: View) {
            setContentView(R.layout.activity_main)
        }

    }

    override fun onClick(p0: View?) {

    }

}