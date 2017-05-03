package md.curs.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class User {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phone;
	private String age;
	
	@NotBlank(message = "First name can not be blank")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@NotBlank
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Email(message = "This is not a valid email")
	@NotBlank
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Size(min = 3, max = 10)
	@NotBlank
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Pattern(regexp = "[\\s]*[0-9]*[1-9]+", message="Age should be greater than 0")
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
