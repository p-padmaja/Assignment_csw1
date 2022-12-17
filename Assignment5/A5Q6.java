import java.util.Scanner;

public class A5Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String input=sc.nextLine();
		String[] word=input.split(" ");
		System.out.println(word.length);
	}

}
