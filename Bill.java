public class Bill{

	private long totalCost;
	private List<Integer> discounts = new ArrayList<Integer>();

	public Bill(){}

	public long getTotalCost(){

		return this.totalCost;

	}

	public void setTotalCost(long totalCost){

		this.totalCost = totalCost;

	}

	public List<Integer> getDiscounts(){

		return this.discounts;

	}

	public void setDiscounts(List<Integer> discounts){

		this.discounts = discounts;

	}

}

	