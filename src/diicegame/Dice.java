package diicegame;

public class Dice {
	
	private int eachThrow;
	
	public Dice (int throwDice) {
		this.eachThrow = throwDice;
	}
	
	public int geteachThorw() {
		return eachThrow;
	}
	
	public void seteachThrow(int eachThrow) {
		this.eachThrow = eachThrow;
	}
	
	
	public static int throwDice(int minValue, int maxValue) {
		return (int)(Math.random()*6 + 1);
		
	}
	
	
	
	

}


/*
1. Has an int attribute value that will store the value of a dice when
thrown.
2. Create getters and setters methods for the attributes and a
constructor method.
3. Create a method called throwDice(), that randomly returns a
value from 1 through 6 to represent the throw of a dice.
*/