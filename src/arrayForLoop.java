//import java.util.Arrays;

public class arrayForLoop {

	public static void main(String[] args) {
		
		int [] aboveTen = {55,3,4,77,8,9,0,13,2,104};
		
		for (int i = 0; i < aboveTen.length; i++) {
			//System.out.println(" " + aboveTen[i]);
			if (aboveTen[i] >= 10) {
				System.out.println(" " + aboveTen[i]);
			}
		}
		
		
	}

}
