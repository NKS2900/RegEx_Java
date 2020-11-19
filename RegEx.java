package org.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExLastName {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter First_Name : ");
		String fname = scan.nextLine();

		boolean b = isValidPassword(fname);
		if (b)
			System.out.println("Valid_name !!!");
		else
			System.out.println("Invalid_name???");
	}
	public static boolean isValidPassword(String fname) {

		String regex = "^([A-Z]{1})+[a-zA-z0-9]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(fname);
		return m.matches();
	}
}
