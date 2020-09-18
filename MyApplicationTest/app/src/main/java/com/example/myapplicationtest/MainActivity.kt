package com.example.myapplicationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.baitap1.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.baitap1)
        button1.setOnClickListener(){
            val so1=textnhap1.text.toString().toDouble()
            val so2=textnhap2.text.toString().toDouble()
            var kq:Double =so1+so2
            ketqua.setText(kq.toString())
        }

        button2.setOnClickListener(){
            val so1=textnhap1.text.toString().toDouble()
            val so2=textnhap2.text.toString().toDouble()
            var kq:Double =so1-so2
            ketqua.setText(kq.toString())
        }
        button3.setOnClickListener(){
            val so1=textnhap1.text.toString().toDouble()
            val so2=textnhap2.text.toString().toDouble()
            var kq:Double =so1*so2
            ketqua.setText(kq.toString())
        }

        button4.setOnClickListener(){
            val so1=textnhap1.text.toString().toDouble()
            val so2=textnhap2.text.toString().toDouble()
            var kq:Double =so1/so2
            ketqua.setText(kq.toString())
                Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()
        }

    }



  fun tinh(v: View)
{

    val so1=textnhap1.text.toString().toDouble()
    val so2=textnhap2.text.toString().toDouble()
    var kq:Double=0.0
    if(v.id==R.id.button1)
        kq =so1+so2
    else if(v.id==R.id.button2)
        kq =so1-so2
    else if(v.id==R.id.button3)
        kq =so1*so2
    else
        kq =so1/so2
    ketqua.setText(kq.toString())

}
}