package com.example.baitap309

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }
    fun getSet (view:View){
        val tuKhoa= findViewById<EditText>(R.id.txttukhoa);
        val ngayCapNhatTuNgay = findViewById<EditText>(R.id.editTextDate1);
        val ngayCapNhatDenNgay = findViewById<EditText>(R.id.editTextDate2);
        val ngayCongVanTuNgay = findViewById<EditText>(R.id.editTextDate3);
        val ngayCongVanDenNgay= findViewById<EditText>(R.id.editTextDate4);
        val nhapDonViKhac = findViewById<EditText>(R.id.txtnhapdonvikhac);

        val msg="Từ khóa : "+tuKhoa.text.toString()+"\n"+"Ngày cập nhật : " +
                "Từ : "+ngayCapNhatTuNgay.text.toString()+" đến : "+ngayCapNhatDenNgay.text.toString()+
                "\nNgày công văn : Từ :"+ngayCongVanTuNgay.text.toString()+
                "đến : "+ngayCongVanDenNgay.text.toString() +
                "\nĐơn vị khác :"+nhapDonViKhac.text.toString();
        val txtView=findViewById<TextView>(R.id.txtHienthi).apply {
         text=msg
        }
    }
}