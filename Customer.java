import java.util.*;

public class Customer extends User{

	private long creditCard;
	private List<String> interests = new ArrayList<String>();
	private String postalAddress;
	private List<Order> orders = new ArrayList<Order>();

	public Customer(){}

	public long getCreditCard(){

		return this.creditCard;

	}

	public void setCreditCard(long creditCard){

		this.creditCard = creditCard;

	}


	public List<String> getInterest(){

		return this.interests;

	}

	public void setInterest(List<String> interest){

		this.interests = interest;

	}

	public String getPostalAddress(){

		return this.postalAddress;

	}

	public void setPostalAddress(String postalAddress){

		this.postalAddress = postalAddress;

	}

	public List<Order> getOrders(){

		return this.orders;

	}

	public void setOrders(List<Order> orders){

		this.orders = orders;

	}

	public void addInterest(String interest){

		this.interests.add(interest);

	}


	private boolean removeInterest(String interest){

		return this.interests.remove(interest);

	}

}