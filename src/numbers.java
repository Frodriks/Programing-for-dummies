import java.util.*;
import static java.lang.Math.*;

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
		
		
		double master = 10.0;
		double divider = 0.86;
		double c = master / divider;
		System.out.println(c); //prints out "master" divided by "divider"
		System.out.println(round(c)); // rounds up/down the calculation 
		
		air();
		
		
		int exponent = 33;
		System.out.println("33 elevated by two = " + round(Math.pow(exponent,2)));
		
		air();
		
		double pi = (PI);
		double radie = 22.43;
		double area = ((pi)*(Math.pow(radie,2)));
		System.out.println("The area of the circle is: " + String.format("%.2f",(area))+ " cm");
		
		air();
		
		
	}

}
