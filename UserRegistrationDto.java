package br.com.carlosjunior.registrationlogin.web.dto;

public class UserRegistrationDto {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phonenumber;
	public UserRegistrationDto() {
		
	}
	
	public UserRegistrationDto(String firstName, String lastName, String email, String phonenumber, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phonenumber=phonenumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


}
