package com.kumar.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	public boolean emailTest() {
		String email = "aj@123";
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		System.out.println(email + " : " + matcher.matches());
		return false;
	}
}
