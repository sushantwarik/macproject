package au.com.home.local.orika.input;

import java.time.LocalDate;
import java.util.List;

public class Individual {
	
	private IndividualName names;
	private LocalDate dateOfBirth;
	private String gender;
	
	private Preferences preferences;
	private StaffDetail staff;
	
	private List<Phone> mobilePhones;
	private List<Phone> otherPhones;
	
	private List<Email> emailContacts;

	public IndividualName getNames() {
		return names;
	}

	public void setNames(IndividualName names) {
		this.names = names;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Preferences getPreferences() {
		return preferences;
	}

	public void setPreferences(Preferences preferences) {
		this.preferences = preferences;
	}

	public StaffDetail getStaff() {
		return staff;
	}

	public void setStaff(StaffDetail staff) {
		this.staff = staff;
	}

	public List<Phone> getMobilePhones() {
		return mobilePhones;
	}

	public void setMobilePhones(List<Phone> mobilePhones) {
		this.mobilePhones = mobilePhones;
	}

	public List<Phone> getOtherPhones() {
		return otherPhones;
	}

	public void setOtherPhones(List<Phone> otherPhones) {
		this.otherPhones = otherPhones;
	}

	public List<Email> getEmailContacts() {
		return emailContacts;
	}

	public void setEmailContacts(List<Email> emailContacts) {
		this.emailContacts = emailContacts;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "My name is " + getNames().getFirstName() + " " + getNames().getLastName();
	}
	
}
