import com.google.gson.annotations.SerializedName




data class Catalog_contents (

	@SerializedName("id") val id : Int,
	@SerializedName("category_name") val category_name : String,
	@SerializedName("slug_url") val slug_url : String,
	@SerializedName("category_banner") val category_banner : String,
	@SerializedName("category_logo") val category_logo : String,
	@SerializedName("parent_id") val parent_id : Int,
	@SerializedName("lft") val lft : String,
	@SerializedName("rgt") val rgt : String,
	@SerializedName("depth") val depth : String,
	@SerializedName("description") val description : String,
	@SerializedName("category_publication_status") val category_publication_status : Int,
	@SerializedName("created_by") val created_by : Int,
	@SerializedName("updated_by") val updated_by : Int,
	@SerializedName("updated_at") val updated_at : String,
	@SerializedName("created_at") val created_at : String,
	@SerializedName("children_recursive") val children_recursive : List<String>,
	@SerializedName("active_children") val active_children : List<String>
)