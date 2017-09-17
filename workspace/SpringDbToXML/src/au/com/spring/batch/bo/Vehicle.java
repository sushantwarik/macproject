package au.com.spring.batch.bo;

import java.sql.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Vehicle")
public class Vehicle {
	
	private String modelNo;
	private String make;
	private String bodyType;
	private String transmission;
	private String noOfWheels;
	private String vehicleType;
	private String engineCapacity;
	private int makeYear;
	private Date lastUpdated;
	
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	@XmlElement(name="Model")
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	
	@XmlElement(name="Brand")
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	@XmlElement(name="Body")
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	
	@XmlElement(name="Gear")
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	
	@XmlElement(name="NumberOfWheels")
	public String getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(String noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
	@XmlElement(name="VehicleType")
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	@XmlElement(name="EngineCapacity")
	public String getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(String engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	@XmlElement(name="ModelMakeYear")
	public int getMakeYear() {
		return makeYear;
	}
	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}
	
}
