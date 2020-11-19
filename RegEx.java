package org.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Mobile_no : ");
		String mobile = scan.nextLine();

		boolean b = isValidPassword(mobile);
		if (b)
			System.out.println(mobile+" ->is Valid mobile no!!!");
		else
			System.out.println("Invalid_mobile???");
	}
	public static boolean isValidPassword(String mobile) {

		String regex = "^(91){1}[ ]+[0-9]{10}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mobile);
		return m.matches();
	}
}
