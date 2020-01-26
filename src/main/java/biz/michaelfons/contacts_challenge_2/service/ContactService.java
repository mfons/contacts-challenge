package biz.michaelfons.contacts_challenge_2.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import biz.michaelfons.contacts_challenge_2.model.Contact;

public class ContactService {

	public List<Contact> getAllContacts() {
		List<Contact> contacts = new ArrayList<Contact>();
		
		Contact c1 = new Contact(1, "Fons", "Michael",
				Arrays.asList("720-837-7830", "303-123-4567"),
				Arrays.asList("michael.fons@gmail.com", "mfons@blm.gov"));
		Contact c2 = new Contact(2, "Smith", "Donald",
				Arrays.asList("720-321-5555"),
				Arrays.asList("donald.smith123@yahoo.com"));
		
		contacts.add(c1);
		contacts.add(c2);

		return contacts;
	}

}
