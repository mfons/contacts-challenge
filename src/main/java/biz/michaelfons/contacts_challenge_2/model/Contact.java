package biz.michaelfons.contacts_challenge_2.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Contact {
	private long id;
	private String lastName;
	private String firstName;
	private List<String> phone;
	private List<String> email;
	
	public Contact (
		long id,
		String lastName,
		String firstName,
		List<String> phone,
		List<String> email
	) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.phone = phone;
		this.email = email;
	}
	
	public Contact() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public List<String> getEmail() {
		return email;
	}
	public void setEmail(List<String> email) {
		this.email = email;
	}

}
