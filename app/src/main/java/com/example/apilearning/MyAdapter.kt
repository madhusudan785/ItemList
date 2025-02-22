package com.example.apilearning

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MyAdapter(val context: Activity,val productArrayList: List<Product>):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val itemView=LayoutInflater.from(context).inflate(R.layout.eachitem,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
       return productArrayList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val currentItem=productArrayList[position]
        holder.title.text=currentItem.title
        //our image in form of url so we can use a 3rd party library picasso\
        Picasso.get().load(currentItem.thumbnail).into(holder.image)
    }
    class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val title:TextView
        val image:ImageView

        init {
            title=itemView.findViewById(R.id.item_name)
            image=itemView.findViewById(R.id.item_img)
        }
    }
}