package org.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExLastName {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Last_Name : ");
		String lname = scan.nextLine();

		boolean b = isValidPassword(lname);
		if (b)
			System.out.println("Strong_Password!!!");
		else
			System.out.println("Invalid_Password???");
	}
	public static boolean isValidPassword(String lname) {

		String regex = "^([A-Z]{1})+[a-zA-z0-9]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lname);
		return m.matches();
	}
}
