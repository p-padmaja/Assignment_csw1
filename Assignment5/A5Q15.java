
public class A5Q15 {
	static int primeCheck(int num) {
		int c = 0;
		boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	    	  if(!flag) flag = true;
	    	  else flag = false;
	      }
	    }
	    if(!flag) c++;
	    return c;
	}
	static int arraycheck(int []arr) {
		int res = 0;
		for(int i = 0;i < arr.length; i++) {
			if(arr[i]==0||arr[i]==1) res--;
			res = res + primeCheck(arr[i]);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {4,5,9,6,7,7,7,3,5};
		System.out.println(arraycheck(a)-1);

	}

}
