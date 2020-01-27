package biz.michaelfons.contacts_challenge_2.database;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import biz.michaelfons.contacts_challenge_2.model.Contact;

public class DatabaseClass {
	private static Map<Long, Contact> contacts = new HashMap<>();
	
	static {
			Contact c1 = new Contact(1, "Fons", "Michael",
					Arrays.asList("720-837-7830", "303-123-4567"),
					Arrays.asList("michael.fons@gmail.com", "mfons@blm.gov"));
			Contact c2 = new Contact(2, "Smith", "Donald",
					Arrays.asList("720-321-5555"),
					Arrays.asList("donald.smith123@yahoo.com"));
			
			contacts.put(1L, c1);
			contacts.put(2L, c2);

	}
	
	public static Map<Long, Contact> getContacts() {
		return contacts;
	};
}
