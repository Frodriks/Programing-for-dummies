import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ChangeIfZerooo {
	
	static void air() {
		System.out.println(" ");
	}
	
	//hur byter jag ut 0 till nästa index?

	public static void main(String[] args) {
		
		
		
		int [] intArray = new int [] {3, 0 ,0 ,4,1};
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i]==0) {
				if (i == intArray.length-1) {
					intArray[i] = intArray[0];
				}else {
					intArray[i] = intArray[i+1];
				}
			}
			
		}
		System.out.println(Arrays.toString(intArray));
		
		
		
		int [] intArra = new int [] {1,0,1,1,0};
		for(int i = 0; i < intArra.length; i++) {
			if(intArra[i]==0) {
				if (i == intArra.length-1) {
					intArra[i] = intArra[0];
				}else {
					intArra[i] = intArra[i+1];
				}
			}
			
		}
		System.out.println(Arrays.toString(intArra));
		
		/*int [] intArray = new int [] {};
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i]==0) {
				if (i == intArray.length-1) {
					intArray[i] = intArray[0];
				}else {
					intArray[i] = intArray[i+1];
				}
			}
			
		}
		System.out.println(Arrays.toString(intArray));/*
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(0);
		numbers.add(3);
		numbers.add(5);
		numbers.add(2); 

		int toFind = 0;
		
		int[] numbers = {1,0,3,5,2};
		
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] == toFind) {  //Be läraren förklara detta för mig!!!
				if (i == numbers.length-1) 
				numbers[i] = numbers[i+1];
			}
		} 
		
		
		//System.out.print(numbers.toString());
		
		
		boolean found = IntStream.of(numbers).anyMatch(n -> n == toFind);
		
		if (found)
			System.out.println(toFind);
		
		
		for(int a : numbers) {
			System.out.print(a + " ");
		}
		
		
		air();
		air();
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(3);
		number.add(0);
		number.add(5);
		number.add(0);
		number.add(1);
		
		for(int i = 0; i < number.size() ;i++) {
			System.out.print(number.get(i) + " ");
		}
		
		air();
		air();
		
		ArrayList<Integer> numbe = new ArrayList<Integer>();
		numbe.add(4);
		numbe.add(0);
		numbe.add(2);
		numbe.add(1);
		numbe.add(0);
		
		for(int c : numbe) {
			System.out.print(c + " ");
		}
		
		air();
		air();

		
		ArrayList<Integer> numb = new ArrayList<Integer>();
		numb.add(1);
		numb.add(0);
		numb.add(1);
		numb.add(1);
		numb.add(0);
		
		for(int d : numb) {
			System.out.print(d + " ");
		}
		
		air();
		air();
		
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(3);
		num.add(0);
		num.add(0);
		num.add(4);
		num.add(1);
		
		for(int e : num) {
			System.out.print(e + " ");
		} */
		

	}

}
