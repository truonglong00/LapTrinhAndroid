package myclass

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.example.myclass.R
import kotlinx.android.synthetic.main.activity_example.*

class ExampleActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)

        val value = intent.getIntExtra("mytext",-1)
        Toast.makeText(this, value.toString(),Toast.LENGTH_SHORT).show()
        txt_value.setText(value.toString())
    }
}