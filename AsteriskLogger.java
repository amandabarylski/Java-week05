package week05;
//Step 3: when implementing Logger in the two subclasses, I then had to add the two methods to each.
//I used Eclipse's auto-add function by right clicking on the class names.

public class AsteriskLogger implements Logger {

	//Step 4: Implementing the methods in AsteriskLogger according to the coding instructions.
	
	@Override
	public void log(String str) {
		// This was simple, just concatenating the string input with asterisks on either side.
		System.out.println("***" + str + "***");
	}

	@Override
	public void error(String str) {
		//I made this more complicated since I wanted the asterisk rows to have the same number of characters as the center row.
		//I decided to use StringBuilders as that would allow me to append many times without taking up as much memory space.
		StringBuilder message = new StringBuilder("***ERROR: " + str + "***");
		StringBuilder asteriskRow = new StringBuilder();
		//A for loop seemed like the most straightforward way to append the number of asterisks I needed.
		//I used the length of message to determine how many times to iterate over the loop.
		for (int i = 0; i < message.length(); i++) {
			asteriskRow.append('*');
		}
		System.out.println(asteriskRow);
		System.out.println(message);
		System.out.println(asteriskRow);
	}

}
