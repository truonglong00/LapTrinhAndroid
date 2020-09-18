package com.example.englishapp.Modules_LuyenTuMoi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.englishapp.R
import kotlinx.android.synthetic.main.activity_luyentumoi_items.view.*
import java.util.*

class TuMoiAdapter(nghiatumoi:ArrayList<NghiaTuMoi>,event:LuyenTuMoi_Events) :RecyclerView.Adapter<TuMoiAdapter.TuMoiHolder>() {

    var list=ArrayList<NghiaTuMoi>()
    var onclick : LuyenTuMoi_Events?=null

    init {
        list= nghiatumoi
        onclick=event
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TuMoiHolder {
        var v:View = LayoutInflater.from(parent.context).inflate(R.layout.activity_luyentumoi_items,parent,false)
        return TuMoiHolder(v)

    }

    override fun onBindViewHolder(holder: TuMoiHolder, position: Int) {
        holder.tumoi.setText(list[position].Nghia)
        holder.itemView.setOnClickListener{
            onclick?.onclickDapAn(list[position])
        }
    }



    override fun getItemCount(): Int {
        return  list.size
    }

    class TuMoiHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var tumoi: TextView = itemView.findViewById(R.id.txt_NghiaTuMoi)

    }



}