package au.com.home.local.orika.output;

import java.util.List;

public class Customer {
	
	private IndividualDetail details;
	
	private CustomerAttributes attributes;
	
	private List<PhoneTypes> phones;
	
	private List<EmailTypes> emails;

	public IndividualDetail getDetails() {
		return details;
	}

	public void setDetails(IndividualDetail details) {
		this.details = details;
	}

	public CustomerAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(CustomerAttributes attributes) {
		this.attributes = attributes;
	}

	public List<PhoneTypes> getPhones() {
		return phones;
	}

	public void setPhones(List<PhoneTypes> phones) {
		this.phones = phones;
	}

	public List<EmailTypes> getEmails() {
		return emails;
	}

	public void setEmails(List<EmailTypes> emails) {
		this.emails = emails;
	}
	
	@Override
	public String toString() {
		
		return "Name Details -> " + getDetails().getName().getfName()+ "," + getDetails().getName().getlName();
	}
	
}
