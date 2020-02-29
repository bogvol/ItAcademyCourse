package org.itacademy.testing;

/**
 * Hello world!
 */

public class App {
	 protected String aaaa;
	 protected String b;

	public App() {
	}

	public App(String a, String b) {
		this.aaaa = a;
		this.b = b;
	}

	final static String GREETING_TO_ME = "Hello ".concat("Wor'l'd!");

	public static void main(String[] args) {
		//first Java program
//		System.out.println("Hello World!");

		//suffix and prefix increment in methods
//		suffixIncrement();
//		prefixIncrement();

		//suffix and prefix increment without methods
		/*int i;
		i = 1;
		if (i++ == 2) {
			System.out.println("we are iside of if statement");
		} else {
			System.out.println("we are outside of if statement");
		}

		int j = 1;
		String day = "Saturday";
		if (++j == 2 && !day.equals("Saturday")) {
			System.out.println("we are iside of if statement");
		} else {
			System.out.println("we are outside of if statement");
		}*/

		//Java Type Widening Casting
		/*int i = 9;
		System.out.println(i);

		double castedI = i;
		System.out.println(castedI);*/

		//Java Type Narrowing Casting
		/*double i = 9.98989;
		System.out.println(i);

		int castedI = (int) i;
		System.out.println(castedI);*/

		char letter = 'a';

		String text = "Hello World!";
		System.out.println(text);

		//upperCase
		String upperCaseText = text.toUpperCase();
		System.out.println(upperCaseText);

		//lowerCase
		String lowerCaseText = text.toLowerCase();
		System.out.println(lowerCaseText);
		//length
		int textLength = text.length();
		System.out.println(textLength);

		//trim
		String unTrimmedText = "    Hello World!     ";
		System.out.println(unTrimmedText);
		String trimmedText = unTrimmedText.trim();
		System.out.println(trimmedText);

		//indexOf
		int firstPosition = text.indexOf("lo");
		System.out.println(firstPosition);

		//contains
		boolean doesContain = text.contains("lll");
		System.out.println(doesContain);

		//double quotes print
		String planetExpress = "Called Planet Express";
		System.out.println(planetExpress);

		String planetExpress1 = "Called 'Planet Express'";
		System.out.println(planetExpress1);

		String planetExpress2 = "Called \"Planet Express\"";
		System.out.println(planetExpress2);

		//path
		String path = new String("C:\\Users\\Downloads");
		System.out.println(path);

		String pathLinux = "/home/Downloads";
		System.out.println(pathLinux);

		int a = 6;
		int b = 2;

		if (a > b) {
			System.out.println("a is greater");
		} else if (a < b) {
			System.out.println("b is greater");
		} else {
			System.out.println("both equals");
		}

		//loops
		System.out.println("Hello, World1!");
		System.out.println("Hello, World2!");
		System.out.println("Hello, World3!");
		System.out.println("Hello, World4!");
		System.out.println("Hello, World5!");

		System.out.println("");
		System.out.println("");

		int it = 1;
		while (it <= 5) {
			System.out.println("Hello World" + it + "!");
			it++;
		}

		//for loop
		System.out.println("");
		System.out.println("");

		int iter;
		for (iter = 1; iter <= 5; iter++) {
			System.out.println("Hello World" + iter + "!");
		}

		//for-each and arrays
		System.out.println("");
		System.out.println("");
		String[] cars = {"Volvo", "BMW", "Mazda", "Volkswagen"};
		System.out.println("Third trade mark is: " + cars[2]);//to access third element
		cars[2] = "Opel"; //to change third value
		for (String c : cars) {
			System.out.println(c);
		}

		App.Builder builder = new App.Builder();
	}

	public static void suffixIncrement() {
		int i = 1;
		if (i++ == 2) {
			System.out.println("we are iside of if statement");
		} else {
			System.out.println("we are outside of if statement");
		}
	}

	public static void prefixIncrement() {
		int i = 1;
		if (++i == 2) {
			System.out.println("we are iside of if statement");
		} else {
			System.out.println("we are outside of if statement");
		}
	}


	public static class Builder{
		String field1 = "field1";
		int[] integ = {1, 2, 3};

		public static void suffixIncrement1() {
			int i = 1;
			if (i++ == 2) {
				System.out.println("we are iside of if statement");
			} else {
				System.out.println("we are outside of if statement");
			}
		}

	}
}
