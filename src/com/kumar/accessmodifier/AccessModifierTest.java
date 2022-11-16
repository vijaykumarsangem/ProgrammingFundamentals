package com.kumar.accessmodifier;

import com.kumar.email.EmailValidator;

public class AccessModifierTest {

	public static void main(String[] args) {
	EmailValidator emailValidator= new EmailValidator();
	emailValidator.emailTest();
	}
	
//	Now change your EmailValidator public method to private
//	and try to run. What happens?
//	method visibilty compilation error
	
	
//	Do the same but this time change your method to having no access modifier
//	method visibilty compilation error
	
}
