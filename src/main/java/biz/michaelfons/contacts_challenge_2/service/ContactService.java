package biz.michaelfons.contacts_challenge_2.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import biz.michaelfons.contacts_challenge_2.database.DatabaseClass;
import biz.michaelfons.contacts_challenge_2.model.Contact;

public class ContactService {
	
	private Map<Long, Contact> contacts = DatabaseClass.getContacts();
	
	public ContactService() {
		// seed contacts
		Contact c1 = new Contact(1, "Fons", "Michael",
				Arrays.asList("720-837-7830", "303-123-4567"),
				Arrays.asList("michael.fons@gmail.com", "mfons@blm.gov"));
		Contact c2 = new Contact(2, "Smith", "Donald",
				Arrays.asList("720-321-5555"),
				Arrays.asList("donald.smith123@yahoo.com"));
		
		contacts.put(1L, c1);
		contacts.put(2L, c2);
	}

	public List<Contact> getAllContacts() {
		return new ArrayList<Contact>(contacts.values());
	}
	
	public Contact getContact(long id) {
		return contacts.get(id);
	}
	
	public Contact addContact(Contact contact) {
		contact.setId(contacts.size() + 1);
		contacts.put(contact.getId(), contact);
		return contact;
	}
	
	public Contact updateContact(Contact contact) {
		if (contact.getId() <= 0) {
			return null;
		}
		contacts.put(contact.getId(), contact);
		return contact;
	}
	
	public Contact removeContact(long id) {
		return contacts.remove(id);
	}

}
