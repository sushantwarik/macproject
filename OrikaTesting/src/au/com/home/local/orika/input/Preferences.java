package au.com.home.local.orika.input;

import java.time.LocalDate;

public class Preferences {
	
	private Boolean marketingConsent;
	private LocalDate consentDate;
	
	public Boolean getMarketingConsent() {
		return marketingConsent;
	}
	public void setMarketingConsent(Boolean marketingConsent) {
		this.marketingConsent = marketingConsent;
	}
	public LocalDate getConsentDate() {
		return consentDate;
	}
	public void setConsentDate(LocalDate consentDate) {
		this.consentDate = consentDate;
	}

}
