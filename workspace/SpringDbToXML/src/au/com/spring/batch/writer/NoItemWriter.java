package au.com.spring.batch.writer;

import java.sql.Date;
import java.util.List;

import org.springframework.batch.item.ItemWriter;

import au.com.spring.batch.bo.Vehicle;

public class NoItemWriter implements ItemWriter<Vehicle> {

	@Override
	public void write(List<? extends Vehicle> vehList) throws Exception {
		System.out.println("Writer Called " + (vehList!=null?vehList.size():0));
		Date latestDate = null;
		for (Vehicle vehicle : vehList) {
			if(latestDate == null) 
				latestDate = vehicle.getLastUpdated();
			else {
				if(latestDate.before(vehicle.getLastUpdated())){
					latestDate = vehicle.getLastUpdated();
				}
			}
		}
		System.out.println("Last updated " + latestDate);
	}

}
