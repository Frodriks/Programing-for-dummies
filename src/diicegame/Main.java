package diicegame;




public class Main {
	
	
	

	public static void main(String[] args) {
		
		
		try {
			Game runGame = new Game();
			runGame.requestPlayerNames();
		} catch (Exception e) { //java.lang.NullPointer
			System.out.println(e.getMessage());
			System.out.println("*************");
			e.printStackTrace();
		}
		

	}

}


/*
1. Has a main method. You should instantiate an object Game
within it and also call the method runGame() in order to play the
game
*/