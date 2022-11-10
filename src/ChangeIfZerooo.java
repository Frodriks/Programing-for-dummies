import java.util.ArrayList;
import java.util.stream.IntStream;

public class ChangeIfZerooo {
	
	static void air() {
		System.out.println(" ");
	}
	
	

	public static void main(String[] args) {
		
		/*ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(0);
		numbers.add(3);
		numbers.add(5);
		numbers.add(2); */
		
		int [] numbers = {1,0,3,5,2};
		
		int toFind = 0;
		
		boolean found = IntStream.of(numbers).anyMatch(n -> n == toFind);
		
		if (found)
			System.out.println(toFind);
		
		/*
		for(int a : numbers) {
			System.out.print(a + " ");
		}
		*/
		
		air();
		air();
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(3);
		number.add(0);
		number.add(5);
		number.add(0);
		number.add(1);
		
		for(int b : number) {
			System.out.print(b + " ");
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
		}
		

	}

}
