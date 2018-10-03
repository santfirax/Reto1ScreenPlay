package co.com.proyectobase.screenplay.model;

public class RegistrationForm {
	private String firstName;
	private String lastName;
	private String address;
	private String emailAddress;
	private String phone;
	private String languages;
	private String password;
	private String confirmPassword;
	private String skills;
	private String country;
	private String selectCountry;
	private String year;
	private String headerWebTable;
	

	public String getHeaderWebTable() {
		return headerWebTable;
	}

	public String getSkills() {
		return skills;
	}

	public String getCountry() {
		return country;
	}

	public String getSelectCountry() {
		return selectCountry;
	}

	public String getYear() {
		return year;
	}

	public String getMonth() {
		return month;
	}

	public String getDay() {
		return day;
	}

	private String month;
	private String day;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getPhone() {
		return phone;
	}

	public String getLanguages() {
		return languages;
	}

	public String getPassword() {
		return password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

}
