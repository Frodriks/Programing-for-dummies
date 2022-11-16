import java.util.Arrays;
import java.util.*;
import java.lang.Math;

public class arrayOfBooleans {

	static void air() {
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		
		Boolean [] news = {true, false, false, true ,true ,false, false, true, true, false};
		Random random = new Random();
		for (int i = 0; i < news.length; i++) {
			System.out.println("The boolean value is; " + random.nextBoolean());
		}
		
		air();
		
		
		for (int j = 0; j < 10; j++) {
			int randomNumber = (int)(Math.random() *11);
			System.out.println(randomNumber);
		}
		
		air();
		
		double degrees = 170.0;
		System.out.println(Math.toRadians(degrees));
		
		degrees = 60;
		System.out.println(Math.toRadians(degrees));
		
		degrees = 30;
		System.out.println(Math.toRadians(degrees));
		
		Double radians = 2.9670597283903604;
		System.out.println(Math.toDegrees(radians));
		
		radians = 1.0471975511965976;
		System.out.println(Math.toDegrees(radians));
		
		radians = 0.5235987755982988;
		System.out.println(Math.toDegrees(radians));
		
		air();
		
		int ageUser1 = (int)(Math.random()*51);
		int ageUser2= (int)(Math.random()*51);
		if (ageUser1>ageUser2) {
			System.out.print("User 1 is older: ");
		}else {
			System.out.print("User 2 is older: ");
		}
		System.out.print(Math.max(ageUser1, ageUser2));
		
	}

}
