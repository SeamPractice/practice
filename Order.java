import java.util.*;

public class Order{

	private int orderId;
	private Date creationDate;
	private String dateShipped;
	private String status;
	private Bill bill;
	private List<Product> products = new ArrayList<Product>;

	public Order(){}

	public int getOrderId(){

		return this.orderId;

	}

	public void setOrderId(int orderId){

		this.orderId = orderId;

	}

	public Date getCreationDate(){

		return this.creationDate;

	}

	public void setCreationDate(Date creationDate){

		this.creationDate = creationDate;

	}

	public String getDateShipped(){

		return this.dateShipped;

	}

	public void setDateShipped(String dateShipped){

		this.dateShipped = dateShipped;

	}

	public String getStatus(){

		return this.status;

	}

	public void setStatus(String status){

		this.status = status;

	}

	public Bill getBill(){

		return this.bill;

	}

	public void setBill(Bill bill){

		this.bill = bill;

	}

	public List<Product> getProducts(){

		return this.products;

	}

	public void setProducts(List<Product> products){

		this.products = products;

	}


}

