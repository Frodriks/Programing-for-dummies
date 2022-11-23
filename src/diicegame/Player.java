package diicegame;

public class Player {
	
	private String name;
	private int totalPoints;
	
	public Player (String inputName, int totalPoints) {
		this.name = inputName;
		this.totalPoints = totalPoints;
	}
	
	public String getname() {
		return name;
	}
	
	public int gettotalPoints() {
		return totalPoints;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void settotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}

}


/*
1. Has an attribute name that stores the name of a player.
2. Has an attribute totalPoints that stores the sum of the points of a
player.
3. Create getters and setters methods for the attributes and a
constructor method that req
*/