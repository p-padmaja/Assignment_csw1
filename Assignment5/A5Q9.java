
public class A5Q9 {
	private static void printString(int columnNumber) {
		StringBuilder columnName = new StringBuilder();
	    while (columnNumber > 0) {
	    	int rem = columnNumber % 26;
	        if (rem == 0) {
	        	columnName.append("Z");
	            columnNumber = (columnNumber / 26) - 1;
	        }
	        else {
	            columnName.append((char)((rem - 1) + 'A'));
	            columnNumber = columnNumber / 26;
	        }
	     }
	     System.out.print(columnName.reverse());
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 27;i++) {
			printString(i);
			System.out.println(" is encoded to "+i);
		}
	}

}
