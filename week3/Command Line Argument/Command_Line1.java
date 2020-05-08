import java.util.ArrayList;
import java.util.List;
 

public class Command_Line1 {
	List<Integer> list = new ArrayList<>();
	private int noOfElements; 
	private int sum;
	private int biggest;
	private int smallest;
	private double avg;
	

	public void setData(String[] args,int noOfElements) {
		this.noOfElements = noOfElements;
		if(args.length == 0) {
			return;
		}
		else{
			for (int i = 0; i<noOfElements ; i++) {
				list.add(Integer.parseInt(args[i]));
			}
		}
		
	}
	
	public void calData() {
		if(list.size() == 0 ) {
			return;
		}
		else{
			sum=0;
			biggest = Integer.MIN_VALUE;
			smallest = Integer.MAX_VALUE;
			for(int i : list) {
				sum+=i;
				if(i>biggest) {
				biggest=i;
				}
				if(i<smallest) {
					smallest=i;
				}
			}
			avg = (double)sum/noOfElements;
		}
		
	}

	public void displayData() {
		
		if(list.size() == 0 ) {
			System.out.println("No data provided in the command line");
			return;
		}
		
		System.out.printf("sum =  %d \naverage = %f \nbiggest = %d \nsmallest %d",sum,avg,biggest,smallest);	
	}
	
}