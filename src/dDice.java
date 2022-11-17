import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class dDice {
	
	static void air() {
		System.out.println(" ");
	}
	
	public int getRandomBetweenNumbers(int minValue, int maxValue) {
		System.out.println(minValue);
		System.out.println(maxValue);
		return 0;
		
	}

	public static void main(String[] args) {
		
		
		dDice numbers = new dDice(); 
		numbers.getRandomBetweenNumbers(1,6);

		//System.out.println((int)(Math.random()));
		
		
		air();
		
		for (int i = 0; i < 10 ; i++) {
			System.out.println(numbers);
		
		}
	}

}
