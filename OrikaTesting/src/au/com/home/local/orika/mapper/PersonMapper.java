package au.com.home.local.orika.mapper;

import au.com.home.local.orika.input.Individual;
import au.com.home.local.orika.output.Customer;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.ClassMapBuilder;

public class PersonMapper {

	private MapperFacade mapperFacade;
	
	public PersonMapper() {
		MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
		LocalDateToString dateConvertor = new LocalDateToString();
		mapperFactory.getConverterFactory().registerConverter("localdateconvertor", dateConvertor);
		mapperFacade = mapperFactory.getMapperFacade();
		buildCustomerMap(mapperFactory);
	}
	
	private void buildCustomerMap(MapperFactory mapperFactory) {
		
		ClassMapBuilder<Individual, Customer> builder 
			=  mapperFactory.classMap(Individual.class, Customer.class);
		mapDetails(builder);
		mapPreferences(builder);
		builder.byDefault().register();
		/*
		 * mapperFactory.classMap(Individual.class, Customer.class) .mapNulls(false)
		 * .fieldAToB("names.firstName","details.name.fName")
		 * .fieldAToB("names.lastName","details.name.lName")
		 * .fieldAToB("names.preferredName","details.name.pName")
		 * .fieldAToB("gender","details.gender")
		 * .fieldAToB("preferences.marketingConsent","attributes.marketingConsentFlag")
		 * .fieldMap("dateOfBirth","details.dateOfBirth").converter("localdateconvertor"
		 * ).add()
		 * .fieldMap("preferences.consentDate","attributes.edocsConsentDate").converter(
		 * "localdateconvertor").add() .byDefault() .register();
		 */	
		
	}
	
	private void mapDetails(ClassMapBuilder<Individual, Customer> mapperFactory) {

		mapNames(mapperFactory);
		mapperFactory.mapNulls(false)
		.fieldAToB("gender","details.gender")
		.fieldMap("dateOfBirth","details.dateOfBirth").converter("localdateconvertor").add();
	}

	private void mapNames(ClassMapBuilder<Individual, Customer> mapperFactory) {
		mapperFactory.mapNulls(false)
		.fieldAToB("names.firstName","details.name.fName")
		.fieldAToB("names.lastName","details.name.lName")
		.fieldAToB("names.preferredName","details.name.pName");
	}
	
	private void mapPreferences(ClassMapBuilder<Individual, Customer> mapperFactory) {
		mapperFactory.mapNulls(false)
		.fieldAToB("preferences.marketingConsent","attributes.marketingConsentFlag")
		.fieldMap("preferences.consentDate","attributes.edocsConsentDate").converter("localdateconvertor").add();
	}

	public Customer mapIndividualToCustomer(Individual individual) {
		
		return mapperFacade.map(individual, Customer.class);
	}

}
