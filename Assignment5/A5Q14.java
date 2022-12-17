
public class A5Q14 {
	 static void countFrequency(int[] array, int size){
	        for (int i = 0; i < size; i++){
	            int f = 0;
	            int count = 0;

	            for (int j = i+1; j < size; j++){
	                if (array[i] == array[j]){
	                    f = 1;
	                    break;
	                }
	            }
	            if (f == 1)
	                continue;

	            for (int j = 0;j<=i;j++){
	                if (array[i] == array[j])
	                    count++;
	            }
	            System.out.println(array[i]+" occurs "+count+ " times.");
	        }
	    }
	public static void main(String[] args) {
		
		int[] arr = {5, 8, 5, 7, 8, 10};
        int size = arr.length;
        countFrequency(arr, size);
	}

}
