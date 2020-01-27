package biz.michaelfons.contacts_challenge_2.database;

import java.util.HashMap;
import java.util.Map;

import biz.michaelfons.contacts_challenge_2.model.Contact;

public class DatabaseClass {
	private static Map<Long, Contact> contacts = new HashMap<>();
	
	public static Map<Long, Contact> getContacts() {
		return contacts;
	};
}
