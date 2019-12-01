package com.zhomprass.zhomprasslimited.Adpaters

import Catalog_products
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.lelin.demoapp.R
import com.zhomprass.zhomprasslimited.Utlis.Config


class Adapter(val list:ArrayList<Catalog_products>, val context: Context):RecyclerView.Adapter<Adapter.ViewHolder> (){




    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        val imageView=itemView.findViewById<ImageView>(R.id.offerProductPicId)
        val productsName=itemView.findViewById<TextView>(R.id.offerProductId)
        val eaName=itemView.findViewById<TextView>(R.id.eaId)
        val price=itemView.findViewById<TextView>(R.id.price)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)

        return ViewHolder(view)

    }
    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        Glide.with(context).load(Config.IMAGE_LINE+list.get(position).product_image).into(holder.imageView)

      holder.productsName.text=list.get(position).product_name

       holder.price.text="\u09F3"+"${list.get(position).price}"
    }






}