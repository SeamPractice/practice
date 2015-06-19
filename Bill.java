import java.util.*;

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

	public long calculateTotalCost(){

		long totalDiscounts = 0;

		for(int i = 0; i < discounts.size(); i++)
		
			totalDiscounts+=discounts.get(i);

		return totalCost-totalDiscounts;

	}
}

	