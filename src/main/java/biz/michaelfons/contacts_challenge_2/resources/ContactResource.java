package biz.michaelfons.contacts_challenge_2.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import biz.michaelfons.contacts_challenge_2.model.Contact;
import biz.michaelfons.contacts_challenge_2.service.ContactService;

@Path("/contacts")
@Produces(MediaType.APPLICATION_JSON)
public class ContactResource {
	ContactService service = new ContactService();
	
	@GET
	public List<Contact> getContacts() {
		return service.getAllContacts();
	}
	
	@GET
	@Path("/{id}")
	public Contact getContactById(@PathParam("id") Long id) {
		return service.getContact(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Contact addContact(Contact contact) {
		return service.addContact(contact);
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Contact updateContact(@PathParam("id") Long id, Contact contact) {
		return service.updateContact(contact);
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Contact deleteContact(@PathParam("id") Long id) {
		return service.removeContact(id);
	}
	
}
