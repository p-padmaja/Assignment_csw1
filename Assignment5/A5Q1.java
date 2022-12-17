import java.util.Scanner;
public class A5Q1 {
	static int bitReturn(int i)
	  {
	        int count = 0;
	        while (i > 0) {
	            count += i & 1;
	            i >>= 1;
	        }
	        return count;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int i1=sc.nextInt();
	    int x = bitReturn(i1);
	    System.out.println("The total bit of the number "+i1+" is "+x);
	}

}
