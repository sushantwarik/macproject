package au.com.spring.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import au.com.spring.batch.bo.Vehicle;

public class DbItemProcessor implements ItemProcessor<Vehicle,Vehicle> {

	@Override
	public Vehicle process(Vehicle vehicle) throws Exception {
		System.out.println("Processing Vehicle " + vehicle.getModelNo());
		return vehicle;
	}

}
