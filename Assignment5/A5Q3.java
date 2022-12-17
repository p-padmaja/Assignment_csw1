
public class A5Q3 {
	static int swapBits(int x, int i, int j)
    {
        int set1 = (x >> i)&1 ;
        int set2 = (x >> j)&1;
        int xor = (set1 ^ set2);
        xor = (xor << i) | (xor << j);
        int result = x ^ xor;
 
        return result;
    }

	public static void main(String[] args) {
		int x = swapBits(24,2,3);
        System.out.println(x);
	}

}
//input:
//x = 24(11000)
//starting 0th position from right side.
//p1 = 2 (Start from the third bit from the right side)which is 0
//p2 = 3 (Start from the forth bit from the right side)which is 1
//Output:
//20 (10100)