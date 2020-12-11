package model;

public class Model {
	
	private String firstname;
	private String lastname;
	private String dob;
	private String gender;
	private String email;
	private String phonenumber;
	private String password;
	
	
	
	
	
	@Override
	public String toString() {
		return "Model [firstname=" + firstname + ", lastname=" + lastname + ", dob=" + dob + ", gender=" + gender
				+ ", email=" + email + ", phonenumber=" + phonenumber + ", password=" + password + "]";
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	
	
}
