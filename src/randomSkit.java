import java.util.Scanner;
public class randomSkit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] vars = new int[3];

		System.out.println("Enter "+vars.length+" vars: ");
		for(int i = 0; i < vars.length; i++)
		  vars[i] = in.nextInt();
	}
}
