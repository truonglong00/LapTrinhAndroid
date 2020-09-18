package com.example.btlw

import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.myclass.OnShowListener
import com.example.myclass.model.Student

class TestAdapter(context:Context, data:ArrayList<Student>, listener:OnShowListener):BaseAdapter() {
     var mInflator: LayoutInflater
     var mData = ArrayList<Student>()

     var mListener: OnShowListener?=null

    init {
        mInflator = LayoutInflater.from(context)
        mData = data
        mListener = listener

    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var v:View
        var holder:MyViewHoler
        if(convertView == null){
            v = mInflator.inflate(R.layout.item_listview_test,null)
            holder = MyViewHoler(v)
            v.tag=holder
        }else{
            v = convertView
            holder = convertView.tag as MyViewHoler
        }
//        var txtName = v?.findViewById(R.id.item_listview_test_tvname) as  TextView
//        var txtBirthdat = v?.findViewById(R.id.item_listview_test_tvbirthday) as  TextView
//        var igvImage = v?.findViewById(R.id.item_listview_test_image) as ImageView
//        var btnClick = v?.findViewById(R.id.btn_click) as Button
//        var btnShow = v?.findViewById(R.id.btn_show) as Button
        holder.tvName.text = mData.get(position).getName()
        holder.tvBirthday.text=mData.get(position).getBirthday()
        holder.igvImage.setImageResource(mData.get(position).getImage())

        holder.btnClick.setOnClickListener {
            Toast.makeText(it.context,mData.get(position).getName(),Toast.LENGTH_SHORT).show()
        }

        holder.btnShow.setOnClickListener {
            mListener?.onClick(mData.get(position).getName())
        }

        return v!!
    }

    override fun getItem(position: Int): Any {
        return 0
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return mData.size
    }

    class MyViewHoler(v:View){
         var tvName: TextView = v.findViewById(R.id.item_listview_test_tvname)
         var tvBirthday: TextView = v.findViewById(R.id.item_listview_test_tvbirthday)
          var igvImage: ImageView = v.findViewById(R.id.item_listview_test_image)
        var btnClick = v.findViewById(R.id.btn_click) as Button
        var btnShow = v.findViewById(R.id.btn_show) as Button
    }
}