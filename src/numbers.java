import java.util.*;

public class numbers {
	
	static void air() {
		System.out.println(" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		do {
			int zeroToTen = (int)(Math.random() *11);
			System.out.print(zeroToTen + " ");
			i++;
		}while (i<10);
		
		air();
		air();
		
		int sum = 0,avg;
		List<Integer> random = new LinkedList<>();
		
		for (int j = 0; j < 10; j++) {
		random.add((int)(Math.random() *11));
		sum = sum + random.get(j);
	
		}
		
		avg = sum/random.size();
		System.out.println(random);
		System.out.println(avg);
		System.out.println(sum);
		
		
		
		air();
		
		

	}

}
