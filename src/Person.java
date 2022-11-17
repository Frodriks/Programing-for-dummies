import java.util.*;
public class Person {
	
	static void air() {
		System.out.println(" ");
	}
	
	private String fNameLName;
	private String gender;
	private String country;
	private int age;
	
	public Person(String inputName, String inputGender, String inputCountry, int inputAge) {
		this.fNameLName = inputName;
		this.gender = inputGender;
		this.country = inputCountry;
		this.age = inputAge;
	}



}
