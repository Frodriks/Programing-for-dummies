import java.util.ArrayList;
import java.util.Collections;

public class changeIfZero {
	
	static void air() {
		System.out.println(" ");
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		Collections.sort(numbers); 
		
		for(int i : numbers) {
			System.out.print(i + " ");
		}
		
		air();
		air();
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(4);
		number.add(5);
		number.add(6);
		number.add(10);
		number.add(12);
		
		Collections.sort(number); 
		
		for(int j : number) {
			System.out.print(j + " ");
		}
		
		air();
		air();
		
		ArrayList<Integer> numbe = new ArrayList<Integer>();
		numbe.add(12);
		numbe.add(32);
		numbe.add(3);
		numbe.add(42);
		numbe.add(5);
		numbe.add(26);
		
		Collections.sort(numbe); 
		
		for(int k : numbe) {
			System.out.print(k + " ");
		}
		
		air();
		air();
		
		ArrayList<Integer> numb = new ArrayList<Integer>();
		numb.add(21);
		numb.add(2);
		numb.add(0);
		numb.add(12);
		
		Collections.sort(numb); 
		
		for(int l : numb) {
			System.out.print(l + " ");
		}
		
	}

}
