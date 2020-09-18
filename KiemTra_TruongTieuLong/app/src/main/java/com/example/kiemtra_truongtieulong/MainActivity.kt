package com.example.kiemtra_truongtieulong

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var arr = mutableListOf<String>("")
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, arr)
        listview.adapter = adapter
        btnThem.setOnClickListener{

            arr.add("Mã sản phẩm: "+txtmasanpham.text.toString())
            arr.add("Mô tả: "+txtmota.text.toString())
            arr.add("Giá: " +txtgia.text.toString())
            adapter.notifyDataSetChanged()
            txtmasanpham.setText("")
            txtmota.setText("")
            txtgia.setText("")
            var km = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        }
    }
}