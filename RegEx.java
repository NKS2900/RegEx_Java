package org.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			System.out.println("Enter E-mail : ");
			String email = scan.nextLine();
			boolean b = isValid(email);
			if (b)
				System.out.println(email + " -->is_Vlaid_Email...");
			else
				System.out.println("Invalid_Email.???");
		} while (true);
	}
	
	public static boolean isValid(String email) {
		String regex = "^[a-zA-Z0-9]+[.(a-zA-Z0-9)]*(\\@)[a-zA-Z0-9]+(\\.)[a-z]{2,4}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		return m.matches();
	}
}
