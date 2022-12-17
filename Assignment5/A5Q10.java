
public class A5Q10 {
	static int val(char c) {
	    if (c >= '0' && c <= '9') return(int)c - '0';
	    else return(int)c - 'A' + 10;
	}
	static int toDeci(String str, int base) {
	    int len = str.length();
	    int power = 1;
	    int num = 0;
	    for(int i = len - 1; i >= 0; i--) {
	        if (val(str.charAt(i)) >= base) {
	            System.out.printf("Invalid Number");
	            return -1;
	        }
	        num += val(str.charAt(i)) * power;
	        power = power * base;
	    }
	    return num;
	}
	static char reVal(int num) {
	    if (num >= 0 && num <= 9) return(char)(num + '0');
	    else return(char)(num - 10 + 'A');
	}
	static String fromDeci(int base, int inputNum)
	{
	    String res = "";
	    while (inputNum > 0) {
	        res += reVal(inputNum % base);
	        inputNum /= base;
	    }
	    res = reverse(res);
	    return res;
	}
	static void convertBase(String s, int a, int b) {
	    int num = toDeci(s, a);
	    String ans = fromDeci(b, num);
	    System.out.print(ans);
	}
	 
	static String reverse(String input) {
	    char[] a = input.toCharArray();
	    int l, r = a.length - 1;
	    for(l = 0; l < r; l++, r--) {
	        char temp = a[l];
	        a[l] = a[r];
	        a[r] = temp;
	    }
	    return String.valueOf(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "10B";
	    int a = 16, b = 10;
	    convertBase(s, a, b);
	}

}
