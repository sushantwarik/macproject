package au.com.home.local.orika.output;

import java.time.LocalDate;

public class PhoneTypes {
	
	private String phoneKey;
	private String areaCode;
	private String countryCode;
	private String localNumber;
	private LocalDate effectiveFromDate;
	private LocalDate effectiveToDate;
	public String getPhoneKey() {
		return phoneKey;
	}
	public void setPhoneKey(String phoneKey) {
		this.phoneKey = phoneKey;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getLocalNumber() {
		return localNumber;
	}
	public void setLocalNumber(String localNumber) {
		this.localNumber = localNumber;
	}
	public LocalDate getEffectiveFromDate() {
		return effectiveFromDate;
	}
	public void setEffectiveFromDate(LocalDate effectiveFromDate) {
		this.effectiveFromDate = effectiveFromDate;
	}
	public LocalDate getEffectiveToDate() {
		return effectiveToDate;
	}
	public void setEffectiveToDate(LocalDate effectiveToDate) {
		this.effectiveToDate = effectiveToDate;
	}
	
	

}
