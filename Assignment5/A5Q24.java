package Assignment_5;
import java.util.*;
public class A5Q24 {

	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<Integer>();
        nums.add(1);
        nums.add(15);
        nums.add(20);
        System.out.println("Total="+addNumbers(nums));
        
	}
	public static int addNumbers(List<Integer> num) {
		int total=0;
		for(Integer nums:num) {
			total += nums;
			
		}
		return total;
		
	}

}
