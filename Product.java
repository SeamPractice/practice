public class Product{

	private int productId;
	private String category;
	private String description;
	private long price;

	public Product(){}

	public int getProductId(){

		return this.productId;

	}

	public void setProductId(int productId){

		this.productId = productId;

	}

	public String getCategory(){

		return this.category;

	}

	public void setCategory(String category){

		this.category = category;

	}

	public String getDescription(){

		return this.description;

	}

	public void setDescription(String description){

		this.description = description;

	}

	public long getPrice(){

		return this.price;

	}

	public void setPrice(long price){

		this.price = price;

	}

}