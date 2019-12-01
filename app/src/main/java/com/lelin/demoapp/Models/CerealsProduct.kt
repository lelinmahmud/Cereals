package com.lelin.demoapp.Models

import Catalog_contents
import Catalog_products
import com.google.gson.annotations.SerializedName

class CerealsProduct(@SerializedName("status") val status : Boolean,
                     @SerializedName("catalog_contents") val catalog_contents : Catalog_contents,
                     @SerializedName("subCategories") val subCategories : List<String>,
                     @SerializedName("catalog_products") val catalog_products : List<Catalog_products>) {
}