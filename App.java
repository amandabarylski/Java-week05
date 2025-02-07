package week05;

public class App {

	public static void main(String[] args) {
		//Final step for the AsteriskLogger:
		Logger asterisks = new AsteriskLogger();
		//I switched out the strings and ran the code multiple times to check how it looked with different length strings.
		//My asterisk box looked how I wanted it to, changing to fit the different lengths.
		System.out.println("Asterisk Logger Tests:");
		asterisks.log("hello");
		asterisks.error("hello");
		asterisks.log("Hello World");
		asterisks.error("We have a problem!");
		
		System.out.println();
		
		//Testing the SpacedLogger:
		Logger spaces = new SpacedLogger();
		//As with the AsteriskLogger, I checked different string inputs while testing.
		System.out.println("Spaced Logger Tests:");
		spaces.log("hello");
		spaces.error("hello");
		spaces.log("Good afternoon");
		spaces.error("Oh no!");

	}

}
