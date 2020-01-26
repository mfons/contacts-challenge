package biz.michaelfons.contacts_challenge_2.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/contacts")
public class ContactResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getContacts() {
		return "Hello World";
	}
}
