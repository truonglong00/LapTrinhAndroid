package com.example.btlw

import android.app.Activity
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.Toast
import com.example.myclass.OnShowListener
import com.example.myclass.model.Student
import kotlinx.android.synthetic.main.actvity_testlistview.*

class TestListViewActivity:Activity(), OnShowListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_testlistview)

        val dataArray = getData()

        val myAdapter = TestAdapter(this, dataArray, this)
        activity_testlistview_lvTest.adapter = myAdapter
    }

    fun getData(): ArrayList<Student> {
        var arrayList = ArrayList<Student>()
        val s1 = Student("Student 1", "21-20-1999", R.drawable.ic_launcher_background, 1)
        arrayList.add(s1)

        arrayList.add(Student("Student 2", "22-22-2000", R.drawable.ic_launcher_foreground, 2))
        arrayList.add(Student("Student 3", "22-22-2000", R.drawable.ic_launcher_background, 3))
        arrayList.add(Student("Student 4", "12-22-2000", R.drawable.ic_launcher_foreground, 4))
        arrayList.add(Student("Student 5", "23-22-2000", R.drawable.ic_launcher_foreground, 5))
        arrayList.add(Student("Student 6", "22-22-2000", R.drawable.ic_launcher_background, 6))
        arrayList.add(Student("Student 7", "12-22-2000", R.drawable.ic_launcher_foreground, 8))
        arrayList.add(Student("Student 8", "27-22-2000", R.drawable.ic_launcher_background, 9))
        arrayList.add(Student("Student 9", "28-2-2000", R.drawable.ic_launcher_foreground, 12))
        arrayList.add(Student("Student 10", "22-22-2000", R.drawable.ic_launcher_background, 22))
        arrayList.add(Student("Student 11", "22-22-2000", R.drawable.ic_launcher_foreground, 32))

        return arrayList
    }

    override fun onClick(name: String) {

    }

    override fun onShow() {

    }
}