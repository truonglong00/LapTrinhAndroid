package com.example.kiemtra_truongtieulong

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class MyApdapter(var mCtx: Context, var resource:Int, val items:List<Model>):ArrayAdapter<Model>(mCtx,resource, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resource,null)
        val MaSanPham:TextView = view.findViewById(R.id.txtmasanpham)
        val Mota:TextView = view.findViewById(R.id.txtmota)
        val Gia:TextView = view.findViewById(R.id.txtgia)
        var mItem:Model = items[position]
        MaSanPham.text= mItem.MaSanPham
        Mota.text = mItem.MoTa
        return view
    }
}