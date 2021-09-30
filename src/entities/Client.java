package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	private static  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String name;
	private String email;
	private Date birdhDate;
	
	public Client () {
		
	}

	public Client(String name, String email, Date birdDate) {
		super();
		this.name = name;
		this.email = email;
		this.birdhDate = birdDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirdDate() {
		return birdhDate;
	}

	public void setBirdDate(Date birdDate) {
		this.birdhDate = birdDate;
	}
	
	@Override
	public String toString() {
		return name + " (" + sdf.format(birdhDate) + ") - " + email;
}
}