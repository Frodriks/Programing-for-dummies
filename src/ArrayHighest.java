import java.util.Arrays;
public class ArrayHighest {
	
	public static int getLowest(int[] a, int total) {
		Arrays.sort(a);
		return a [0];
	}

	public static void main(String[] args) {
		
		int [] numbers= {1,24,56,13,103,99,34,64,230,72};
		int a[] = {1,24,56,13,103,99,34,64,230,72};
		int i = 0;
		do {
			System.out.println(numbers[i]);
			i++;
		} while(i < 10);
		System.out.println("The lowest number is: " + getLowest(a,10));
		
		
			

    }
}

