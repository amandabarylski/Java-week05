package week05;

public class SpacedLogger implements Logger {

	@Override
	public void log(String str) {
		//I initially had everything (except the return line) from the addSpaces method here.
		//However, I decided it was more efficient to have it outside of the public methods instead of having a copy of it in each.
		StringBuilder spacedStr = addSpaces(str);
		System.out.println(spacedStr);
	}

	@Override
	public void error(String str) {
		//I had to space out the string again here, which is when I moved the StringBuilder construction into a private method.
		//This is almost identical to the log method, only concatenating the ERROR: part before the spaced out string.
		StringBuilder spacedStr = addSpaces(str);
		System.out.println("ERROR: " + spacedStr);
	}
	
	private StringBuilder addSpaces(String str) {
		//As altering strings isn't memory efficient, I instead initiated a StringBuilder.
		StringBuilder spacedStr = new StringBuilder();
		//I used a for loop to iterate over the string and add each character and a space to my StringBuilder.
		//However, I didn't want a space at the end, so I enclosed an if statement and only added the character from the last index.
		for (int i = 0; i < str.length(); i++) {
			if (i != str.length() - 1) {
				spacedStr.append(str.charAt(i) + " ");
			} else {
				spacedStr.append(str.charAt(i));
			}
		}
		return spacedStr;
	}

}
