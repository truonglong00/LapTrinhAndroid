package com.example.myclass.model

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.myclass.R
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val value = intent.getIntExtra("mynumber", -1)

        btn_back.setOnClickListener(View.OnClickListener {
            val result = value * edt_input.text.toString().toInt()

            val intent = Intent()
            intent.putExtra("result",result)
            setResult(3,intent)
            finish()
        })
    }
}