
public class arrayOfIntegers {
	
	static void air() {
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		
		int [] integers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; //For-Loop
		
		for (int i = integers.length-1; i >= 0; i--){
			System.out.print(integers[i] + " ");
		}
		air();
		air();
		
		int [] integer = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};//While-Loop
		int j = integer.length-1;
		while (j >= 0) {
			System.out.print(integer[j] + " ");
		j--;
		}
		
		air();
		air();
		
		int [] intege = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};//Do-While-Loop
		int k = intege.length-1;
		do {
			System.out.print(intege[k] + " ");
		k--;
		}while (k>=0);
		
		
		
	}

}
