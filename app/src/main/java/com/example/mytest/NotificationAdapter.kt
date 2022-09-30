package com.example.mytest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class NotificationAdapter(val messageList: ArrayList<DataClass>) :RecyclerView.Adapter<NotificationAdapter.ViewHolder>(){
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val message = itemView.findViewById<TextView>(R.id.name)
        val images = itemView.findViewById<ImageView>(R.id.img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val messages : DataClass = messageList[position]
        holder.message.text = messages.name
        holder.images.setImageResource(messages.image)
    }

    override fun getItemCount(): Int {
      return  messageList.size
    }
}