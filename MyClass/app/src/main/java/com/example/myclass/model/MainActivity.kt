package com.example.myclass.model

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myclass.R
import com.example.myclass.ResultActivity
import kotlinx.android.synthetic.main.activity_relativelayout.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relativelayout)
        txtc.setOnClickListener(this)
        txt_d.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("mynumber",2)
            startActivityForResult(intent,10)
        })

    }

    override fun onStop() {
        super.onStop()
      //  Toast.makeText(applicationContext,"stop",Toast.LENGTH_SHORT).show()
    }

    fun abc(a:Int, b:Int){
        Log.d("aaa",(a+b).toString())
    }

    fun onTest(v: View){
       // Toast.makeText(applicationContext,"click on xml",Toast.LENGTH_SHORT).show()
        val intent = Intent(this, com.example.myclass.ExampleActivity::class.java)
        intent.putExtra("mytext",2)
        startActivity(intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val r = data?.getIntExtra("result",-1)
        txtc.setText(r.toString())
    }

    override fun onClick(v: View?) {

    }
}