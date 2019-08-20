/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

// import java.util.Scanner;
// uncomment the above line to use input in your program.

import java.util.Scanner;

public class Gravity {
	// TODO 1: Create the main method
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float time = scanner.nextFloat();
		float g = 9.8f;
		System.out.println("The speed of the object at " + time + " seconds after its release is " + g * time + " and the distance the object has travelled in the " + time + " seconds after the relase is " + .5 * g * time * time);
		/* TODO 2:
		 *   a. Declare all your necessary variables inside main method.
		 *   b. Declare a constant for 'gravity', assume the value to be 9.8
		 *   c. Calculate the result and print it to the screen.
		 * */

	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
