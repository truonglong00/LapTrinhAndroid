package com.example.bai2eventhongtin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun GuiThongTin(view: View)
        {
            val HoTen = findViewById<EditText>(R.id.txtHoTen);
            val Cmnd = findViewById<EditText>(R.id.txtCmnd);
            val msg =HoTen.toString().plus("\n").plus(Cmnd.toString());
            val TextView=findViewById<TextView>(R.id.txtHienThi).apply { text=msg }
        }
    }
}