import java.util.Scanner;
public class A5Q13{
    static int frequencyDigits(int n, int d){
    int c = 0;
    while (n > 0){
        if (n%10==d)
            c++;
        n=n/10;
    }
    return c;
}
   public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number:");
	  int n=sc.nextInt();
	  System.out.println("Enter the number which frequency you want to find:");
	  int d=sc.nextInt();
	  System.out.print("Frequency of the digit "+d+ " is: ");
      System.out.println(frequencyDigits(n, d));
    }
}
