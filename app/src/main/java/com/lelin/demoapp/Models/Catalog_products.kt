import com.google.gson.annotations.SerializedName




data class Catalog_products (

	@SerializedName("id") val id : Int,
	@SerializedName("category_id") val category_id : Int,
	@SerializedName("product_name") val product_name : String,
	@SerializedName("product_model") val product_model : String,
	@SerializedName("product_desc") val product_desc : String,
	@SerializedName("product_image") val product_image : String,
	@SerializedName("tag") val tag : String,
	@SerializedName("product_publication_status") val product_publication_status : String,
	@SerializedName("is_feature_product") val is_feature_product : Int,
	@SerializedName("stock") val stock : Int,
	@SerializedName("batch_no") val batch_no : String,
	@SerializedName("created_by") val created_by : Int,
	@SerializedName("updated_by") val updated_by : Int,
	@SerializedName("created_at") val created_at : String,
	@SerializedName("updated_at") val updated_at : String,
	@SerializedName("tax_class_id") val tax_class_id : String,
	@SerializedName("tax_rate") val tax_rate : Double,
	@SerializedName("weight_class_id") val weight_class_id : String,
	@SerializedName("weight_class") val weight_class : String,
	@SerializedName("weight") val weight : Double,
	@SerializedName("new_arrival") val new_arrival : Int,
	@SerializedName("gift_voucher") val gift_voucher : Int,
	@SerializedName("vendor_id") val vendor_id : String,
	@SerializedName("commission_type") val commission_type : String,
	@SerializedName("commission") val commission : String,
	@SerializedName("specification") val specification : String,
	@SerializedName("warranty") val warranty : String,
	@SerializedName("emi") val emi : String,
	@SerializedName("product_id") val product_id : Int,
	@SerializedName("outlet_id") val outlet_id : Int,
	@SerializedName("stock_qty") val stock_qty : Int,
	@SerializedName("price") val price : Int,
	@SerializedName("discount") val discount : String,
	@SerializedName("type") val type : String,
	@SerializedName("start_date") val start_date : String,
	@SerializedName("end_date") val end_date : String,
	@SerializedName("max_in_cart") val max_in_cart : String,
	@SerializedName("images") val images : List<String>
)