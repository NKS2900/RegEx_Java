package org.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Password : ");
		String pass = scan.nextLine();

		boolean b = isValidPassword(pass);
		if (b)
			System.out.println(pass+" ->is Strong password!!!");
		else
			System.out.println("Invalid_Password???");
	}
	public static boolean isValidPassword(String pass) {

		String regex = "^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(pass);
		return m.matches();
	}
}
