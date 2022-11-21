
public class tryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int slumpa = (int)(Math.random() *4);
		int randomNumA = 100;//(int)(Math.random() *100);
		int randomNumB = 0;//(int)(Math.random() *100);
		System.out.println ("The first number is: " + randomNumA);
		System.out.println ("The second number is: " + randomNumB);
		try {  //try catch = "try" running this code and if it fails "catch" it and print an error message, then continue with the code
			switch (slumpa) {
			case 0:
				System.out.println ("The first + the second = " + (randomNumA + randomNumB));
				break;
			case 1:
				System.out.println ("The first - the second = " + (randomNumA - randomNumB));
				break;
			case 2:
				System.out.println ("The first * the second = " + (randomNumA * randomNumB));
				break;
			case 3:
				System.out.println ("The first / the second = " + (randomNumA / randomNumB));
				break;
			default:
				System.out.println("ORIMLIGT!\n");	
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("*************");
			e.printStackTrace();
		} finally {
			System.out.println("Koden fortsätter\n");
		}
		
		System.out.println("Slut på kod!");

	}

}
