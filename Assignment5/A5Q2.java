
import java.util.Scanner;
public class A5Q2 {
	static long bitReturn(long i)
	  {
	        long count = 0;
	        while (i > 0) {
	            count += i & 1;
	            i >>= 1;
	        }
	        return count;
	        
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		long i1=sc.nextLong();
	    long x = bitReturn(i1);
	    if((x%2)==0) {
	    	System.out.println("Parity is 0");
	    }
        else {
        	System.out.println("Parity is 1");
        }
	    
	}

}


