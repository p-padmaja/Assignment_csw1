import java.util.Scanner;
public class A5Q4 {
	    static int Multiply(int a, int b)
	    {
	        int res = 0; 
	        while (b > 0)
	        {
	             // If second number becomes odd,
	             // add the first number to result
	            if ((b & 1) != 0)
	                res = res + a;
	            // Double the first number
	            // and halve the second number
	              a = a << 1;
	              b = b >> 1;
	        }
	        return res;
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x and y:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(+x+"*"+y+"="+Multiply(x, y));

	}

}
