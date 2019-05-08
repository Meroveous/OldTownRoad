package HashMap_Exercises;

import java.util.*;

public class HashMap_Exercises {
	
	public static ArrayList<Integer> numberz = new ArrayList<Integer>();
	
	
	public static void main(String[] args) {
		ask();
	

	}
	public static void ask() {
		System.out.println("Give me 5 numbers...");
//	create for loop that runs 5 times, asks for input, store in ArrayList
	for(int i = 0; i < 5; i++) {
		Scanner rich_input = new Scanner(System.in);
		int rich_answer = rich_input.nextInt();
		numberz.add(rich_answer);
		System.out.println("That's " + (i+1));
		}
	System.out.println(numberz);
	System.out.println("Your sum is: " + sum());
	System.out.println("Your product is: " + product());
	System.out.println("Your largest is: " + largest());
	System.out.println("Your smallest is: " + smallest());
	}
	
	public static int sum() {
		int sum = 0;
		for(int i = 0; i < numberz.size(); i++) {
			sum = sum + numberz.get(i);
		}
		return sum;
	}
	
	public static int product() {
		int product = 1;
		for(int i = 0; i < numberz.size(); i++) {
			product = product * numberz.get(i);
		}
		return product;
	}
	
	public static int largest() {
		int largest = 0;
		for (int i = 0; i < numberz.size(); i++) {
			if(numberz.get(i) > largest) {
				largest = numberz.get(i);
			}
		}
		return largest;
	}
	
	public static int smallest() {
		int smallest = numberz.size();
		for (int i = 0; i < numberz.size(); i++) {
			if(numberz.get(i) < smallest) {
				smallest = numberz.get(i);
			}
		}
		return smallest;
	}
	
}


//Ask the user for 5 numbers,
//
//store them in an array list,
//
//then find the sum,=all added together
//find the product, =all multiplied together
//find the largest, 
//and smallest of those numbers





