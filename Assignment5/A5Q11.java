import java.util.Scanner;
public class A5Q11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String input=sc.nextLine();
		String[] word=input.split(" ");
		System.out.println("Sentence after all word reversed is:");
        for(int i=word.length-1;i>=0;i--) {
        	System.out.print(word[i]+" ");	
        }
	}

}
