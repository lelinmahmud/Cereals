package com.lelin.demoapp.Activities

import Catalog_products
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lelin.demoapp.Models.CerealsProduct
import com.lelin.demoapp.R
import com.zhomprass.zhomprasslimited.Adpaters.Adapter
import com.zhomprass.zhomprasslimited.ApiClient.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var toolbar:Toolbar
    lateinit var recyclerView: RecyclerView
    private lateinit var catalogProduct: ArrayList<Catalog_products>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar=findViewById(R.id.toolbar)
        recyclerView=findViewById(R.id.recyclcerView)
        toolbar.setTitle("Cereals")
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back)
        toolbar.setTitleTextColor(Color.WHITE)
        setSupportActionBar(toolbar)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        supportActionBar?.setDisplayShowHomeEnabled(true)

        recyclerView.layoutManager=GridLayoutManager(this,2)

        getProducts()


    }



    private fun getProducts() {
        ApiClient.instance.getCereals(1)
            .enqueue(object :Callback<CerealsProduct>{
                override fun onFailure(call: Call<CerealsProduct>, t: Throwable) {
                    println(t.message)
                }

                override fun onResponse(
                    call: Call<CerealsProduct>,
                    response: Response<CerealsProduct>
                ) {
                    if (response.body()?.status!!){
                        catalogProduct= response.body()!!.catalog_products as ArrayList<Catalog_products>
                        val adapter=Adapter(catalogProduct,this@MainActivity)
                        recyclerView.adapter=adapter

                    }
                }

            })
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item,menu)
        return true


    }



}
