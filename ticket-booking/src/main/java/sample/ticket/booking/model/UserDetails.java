package sample.ticket.booking.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
	
	@Id
	private String userName;
	private int age;
	private String source;
	private String destination;
	
	public UserDetails() {
		
	}
	
	public UserDetails(String userName, int age, String source, String destination) {
		super();
		this.userName = userName;
		this.age = age;
		this.source = source;
		this.destination = destination;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}

}
