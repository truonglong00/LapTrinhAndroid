package com.example.englishapp

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.englishapp.Modules_LuyenTuMoi.LuyenTuMoi_Events
import com.example.englishapp.Modules_LuyenTuMoi.NghiaTuMoi
import com.example.englishapp.Modules_LuyenTuMoi.TuMoiAdapter
import kotlinx.android.synthetic.main.activity_luyentumoi.*

class LuyenTuMoiActivity : Activity(),LuyenTuMoi_Events {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luyentumoi)

        var LuyenTuMoiAdapter = TuMoiAdapter(getData(),this)
        recycleview_DapAn.layoutManager= LinearLayoutManager(this)
        recycleview_DapAn.setHasFixedSize(true)
        recycleview_DapAn.adapter= LuyenTuMoiAdapter

    }


    fun getData():ArrayList<NghiaTuMoi>{
        var arrayList = ArrayList<NghiaTuMoi>()

        arrayList.add(NghiaTuMoi("Ngày Mới"))
        arrayList.add(NghiaTuMoi("Xin Chào"))
        arrayList.add(NghiaTuMoi("Vui Vẻ"))
        arrayList.add(NghiaTuMoi("Yêu Thương"))


        return arrayList
    }

    override fun onclickDapAn(Nghia: NghiaTuMoi) {

    }
}

