package HashMap_Exercises;

import java.util.*;

public class hashMap {
	
	public static HashMap<String,String>cars = new HashMap<>();

	
	

	public static void main(String[] args) {
		
		cars.put("Accord", "Honda");
		cars.put("Civic", "Honda");
		cars.put("Malibu", "Chevy");
		cars.put("Optima", "Kia");
		cars.put("Camaro", "Chevy");
		cars.put("Corvette", "Chevy");
		cars.put("F-150", "Ford");
		cars.put("Cherokee", "Jeep");
		cars.put("Ultima", "Nissan");
		cars.put("Maxima", "Nissan");
		
		ask();
		
	}
		public static void ask() {
			System.out.println("What model of car do you want?");
			
			Scanner customer = new Scanner(System.in);
			String custAnswer = customer.nextLine();
			
			
			boolean mdl = cars.containsKey(custAnswer);
			
			if(mdl) {
			String mk = cars.get(custAnswer);
			System.out.println("Oh, you are looking for " + custAnswer + "? Our " +  mk + " selection is right over here...");
			}
			else {
				System.out.println("Don't have one.");
			}
		}
}
	




//You are a car dealer - create a hash map of vehicles:
//
//The model is the Key, the make is the Value.
//
//Ask the customer what car (model) they are looking for,
//
//use the HashMap to determine if you have that vehicle, and what make it is.
//
//(e.g., "Oh, you're looking for a Civic? Our Honda selection is right over here...")