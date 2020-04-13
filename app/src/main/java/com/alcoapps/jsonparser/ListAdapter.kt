package com.alcoapps.jsonparser

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.view.ViewGroup
import android.widget.BaseAdapter

class ListAdapter (val context: Context, val list:ArrayList<MyData>):BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //TODO("Not yet implemented")

        val view:View   = LayoutInflater.from(context).inflate(R.layout.row_layout,parent,false)
        val id          = view.findViewById<TextView>(R.id.pid)
        val name        = view.findViewById<TextView>(R.id.pname)
        val email       = view.findViewById<TextView>(R.id.pemail)
        val location       = view.findViewById<TextView>(R.id.plocation)

        id.text         = list[position].id.toString()
        name.text       = list[position].name.toString()
        email.text      = list[position].email.toString()
        location.text   = list[position].location.toString()

        return view
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list.size
    }

}