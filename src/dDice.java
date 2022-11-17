import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class dDice {

	
	
	static void air() {
		System.out.println(" ");
	}
	
	public static int getRandomBetweenNumbers(int minValue, int maxValue) {
		return (int)(Math.random()*6 + 1);
	}

	public static void main(String[] args) {
		

		
		air();
		
		for (int i = 0; i < 10 ; i++) {
			int randomNumber = getRandomBetweenNumbers(1, 6);
			System.out.println(randomNumber);
		}
		
		air();
		
		
		
	}

}
