package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	private List<Contact> contactsList;
	
	public void addContact(Contact contact) {
		if(contactsList==null){
			contactsList=new ArrayList<>();
        }
		contactsList.add(contact);
	}
	
	public static void main(String[] args) {
		
	}
}
