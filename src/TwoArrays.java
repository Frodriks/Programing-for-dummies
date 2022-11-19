import java.util.Random;


public class TwoArrays {
	
	static void air() {
		System.out.println(" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random number = new Random();
		int [] firstArray = new int[10];
		int [] secondArray = new int[10];
		
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = number.nextInt();
			System.out.println(firstArray[i]);
		}
		
		air();
		
		
		for (int i = 0; i < secondArray.length; i++) {
			secondArray[i] = number.nextInt();
			System.out.println(secondArray[i]);
		}

	}

}
