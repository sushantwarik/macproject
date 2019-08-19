package au.com.home.local.orika;

import java.time.LocalDate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import au.com.home.local.orika.input.Individual;
import au.com.home.local.orika.mapper.PersonMapper;
import au.com.home.local.orika.output.Customer;
import ma.glasnost.orika.OrikaSystemProperties;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class OrikaMain {

	public static void main(String[] args) throws JsonProcessingException {
		
		System.setProperty(OrikaSystemProperties.WRITE_SOURCE_FILES,"true");
		PodamFactory factory = new PodamFactoryImpl();
		Individual individual = factory.manufacturePojoWithFullData(Individual.class);
		
		individual.setDateOfBirth(LocalDate.now());
		individual.getPreferences().setConsentDate(LocalDate.now());;
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		System.out.println("Individual -> " + objectMapper.writeValueAsString(individual));
		
		PersonMapper mapper = new PersonMapper();
		
		Customer customer = mapper.mapIndividualToCustomer(individual);
		
		System.out.println("Customer -> " + objectMapper.writeValueAsString(customer));
		

		Individual reverse = mapper.mapReverse(customer);
		
		System.out.println("Reverse -> " + objectMapper.writeValueAsString(reverse));
	}

}
