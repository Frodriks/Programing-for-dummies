import java.util.Arrays;
public class getLowest {
	
	public static int getLargest(int[] a, int total) {
		Arrays.sort(a);
		return a [total-1];
	}

	public static void main(String[] args) {

		int [] number = {1,24,56,13,103,99,34,64,230,72};
		int a[] = {1,24,56,13,103,99,34,64,230,72};
		int j = 0;
		while(j <10) {
				System.out.println(number[j]);
		j++;
		}
		System.out.println("The lowest number is: " + getLargest(a,10));
	}

}
