package au.com.spring.batch.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import au.com.spring.batch.bo.Vehicle;

public class VehicleMapper implements RowMapper<Vehicle> {

	@Override
	public Vehicle mapRow(ResultSet dbItem, int rowNum) throws SQLException {
		Vehicle v = new Vehicle();
		v.setModelNo(dbItem.getString("modelNo"));
		v.setMake(dbItem.getString("make"));
		v.setBodyType(dbItem.getString("bodyType"));
		v.setTransmission(dbItem.getString("transmission"));
		v.setNoOfWheels(dbItem.getString("noOfWheels"));
		v.setVehicleType(dbItem.getString("vehicleType"));
		v.setEngineCapacity(dbItem.getString("engineCapacity"));
		v.setMakeYear(dbItem.getInt("makeYear"));
		v.setLastUpdated(dbItem.getDate("lastUpdated"));
		return v;
	}

}
