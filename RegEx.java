package org.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPinCode {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Pin_Code : ");
		String pin = scan.nextLine();
		boolean b=isValid(pin);
		if(b)
			System.out.println("Vlaid_Pin_Code!!!");
		else
			System.out.println("Invalid_Pin_Code.???");
	}

	public static boolean isValid(String pin) {
		String regex = "^[0-9]{6}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(pin);
		return m.matches();
	}
}
