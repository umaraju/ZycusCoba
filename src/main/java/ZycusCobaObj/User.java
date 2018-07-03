package ZycusCobaObj;

import java.util.List;

public class User {

	//Customer personal information
	private String firstName;
	private String lastName;
	private Integer age;
	private Address address;
	private List<PhoneNumbers> PhoneNumbers;

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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<PhoneNumbers> getPhoneNumbers() {
		return PhoneNumbers;
	}
	public void setPhoneNumbers(List<PhoneNumbers> phoneNumbers) {
		PhoneNumbers = phoneNumbers;
	}


}
