import java.util.Scanner;
public class A5Q7 {
	static String name(String name) {
		String sub = name.substring(0,2);
		return sub;
	}
	static String setPass(String name,String dob) {
		String password = "A";
		String dob0 = dob.substring(2,4);
		switch(dob0) {
		case "01": password = name(name) + "Janaury";break;
		case "02": password = name(name) + "February";break;
		case "03": password = name(name) + "March";break;
		case "04": password = name(name) + "April";break;
		case "05": password = name(name) + "May";break;
		case "06": password = name(name) + "June";break;
		case "07": password = name(name) + "July";break;
		case "08": password = name(name) + "August";break;
		case "09": password = name(name) + "September";break;
		case "10": password = name(name) + "October";break;
		case "11": password = name(name) + "November";break;
		case "12": password = name(name) + "December";break;
		}
		return password;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the DOB(in DD/MM/YYYY): ");
		String dob = s.next();
		System.out.print("Enter the name: ");
		String name = s.next();
		String password = setPass(name, dob);
		System.out.println("The password is: "+password);

	}

}
