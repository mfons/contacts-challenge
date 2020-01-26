package biz.michaelfons.contacts_challenge_2.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import biz.michaelfons.contacts_challenge_2.model.Contact;
import biz.michaelfons.contacts_challenge_2.service.ContactService;

@Path("/contacts")
public class ContactResource {
	ContactService service = new ContactService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Contact> getContacts() {
		return service.getAllContacts();
	}
}
