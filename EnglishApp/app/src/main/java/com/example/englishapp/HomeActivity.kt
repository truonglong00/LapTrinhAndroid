package com.example.englishapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btndanhsachtu.setOnClickListener{
            Toast.makeText(this,"Bạn đã click vào danh sách từ",Toast.LENGTH_LONG).show()
        }
        btnluyentap.setOnClickListener{
            Toast.makeText(this,"Bạn đã click vào luyện tập",Toast.LENGTH_LONG).show()
        }
        btnkiemtra.setOnClickListener{
            Toast.makeText(this,"Bạn đã click vào kiểm tra",Toast.LENGTH_LONG).show()
        }
        btntuhangngay.setOnClickListener{
            Toast.makeText(this,"Bạn đã click vào từ hàng ngày",Toast.LENGTH_LONG).show()
        }
        btnbatcauhoingaunhien.setOnClickListener{
            Toast.makeText(this,"Bạn đã click vào câu hỏi ngẫy nhiên",Toast.LENGTH_LONG).show()
        }

    }

}