package diicegame;

public class Player{ //extends Game????
	
	private String name; //provade = " "  , men det funkade inte... fortfarande null...
	private int totalPoints; // provade skriva in = 0..
	
	public Player (String inputName, int totalPoints) {
		this.name = inputName;
		this.totalPoints = totalPoints;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void settotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	
	public int gettotalPoints() {
		return totalPoints;
	}
	

		
	
	
	

}


/*
1. Has an attribute name that stores the name of a player.
2. Has an attribute totalPoints that stores the sum of the points of a
player.
3. Create getters and setters methods for the attributes and a
constructor method that req
*/