package diicegame;
import java.util.Scanner;

public class Game{
	
	private Player firstPlayer;
	private Player secondPlayer;
	
	
	
	/*
	public void requestPlayerNames() {
		Scanner inputValue = new Scanner(System.in);
		System.out.println("Please input name for first player: ");
		String firstPlayerName = inputValue.nextLine();
		firstPlayer.setName(firstPlayerName);
		
		
		System.out.println("Please input name for second player: ");
		String secondPlayerName = inputValue.nextLine();
		secondPlayer.setName(secondPlayerName);
		//inputValue.close();
		
	} */
	
<<<<<<< HEAD
=======
	public void requestPlayerNames() {
		
	
			Scanner playerNames = new Scanner(System.in);
			System.out.println("Please input name for first player: ");
			String firstPlayerName = playerNames.nextLine();
			firstPlayer.setName(firstPlayerName);
			System.out.println(firstPlayer.getName()); //funkar inte.... hur ska jag göra!!??
			playerNames.close();
		}
		
		
		
		/*System.out.println("Please input name for second player: ");
		String secondPlayerName = playerNames.nextLine();
		secondPlayer.setName(secondPlayerName);
		playerNames.close();
		
	}
	*/
>>>>>>> 255f87db868637e3a62430f45f740b39acabf25d
	public void requestPlayerThrows() {
		
	}
	
<<<<<<< HEAD
	public void comparePointsOfPlayers(firstPlayer, secondPlayer) {
=======
	public void comparePointsOfPlayers() {
>>>>>>> 255f87db868637e3a62430f45f740b39acabf25d
		
	}
	
	public void runGame() {
		requestPlayerNames();
		requestPlayerThrows();
		comparePointsOfPlayers();
	}
}

/*
1. Has firstPlayer and secondPlayer as attributes.

2. Has a method requestPlayerNames() that asks the users to enter
their names and creates two players with the given names.

3. Has a method requestPlayerThrows() with a player as parameter.
Each player should throw the dice three times. The method
requires the user to press a key for throwing the dice at each
new throw. The method should return a Player with updated
values of the attribute totalOfPoints and the attribute name should
be the set as the name of the Player object that was used as a
parameter for the method.

4. Has a method comparePointsOfPlayers() where it takes two
parameters; firstPlayer and secondPlayer. The method compares
which player has a higher value in the attribute totalOfPoints and
decides who won or eventually if it was a draw.

5. Has a method runGame() that will be called by the main class.
The method should call the method requestPlayerNames(), and
request the method requestPlayerThrows() for both the firstPlayer
and the secondPlayer. Finally, the method should call the method
comparePointsOfPlayers() and decide who won.
*/