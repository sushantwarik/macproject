package au.com.home.local.orika.mapper;

import au.com.home.local.orika.input.Individual;
import au.com.home.local.orika.output.Customer;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.NullFilter;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.ClassMapBuilder;
import ma.glasnost.orika.metadata.Property;
import ma.glasnost.orika.metadata.Type;

public class PersonMapper {

	private MapperFacade mapperFacade;
	
	public PersonMapper() {
		MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
		LocalDateToString dateConvertor = new LocalDateToString();
		mapperFactory.getConverterFactory().registerConverter("localdateconvertor", dateConvertor);
		mapperFactory.registerFilter(new NullFilter<String, String>(){
			
			@Override
			public boolean appliesTo(Property source, Property destination) {
				// TODO Auto-generated method stub
				System.out.println(source.getExpression() + ":" + destination.getExpression()
				+ " ... perform mapping " 
						+ (source.getExpression().equalsIgnoreCase("details.sex")
								|| source.getExpression().equalsIgnoreCase("gender")));
				return super.appliesTo(source, destination) 
						&& (source.getExpression().equalsIgnoreCase("details.sex")
								|| source.getExpression().equalsIgnoreCase("gender"));
			}
			
			@Override
			public boolean filtersSource() {
				// TODO Auto-generated method stub
				return true;
			}
			
			@Override
			public boolean filtersDestination() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public <S extends String, D extends String> boolean shouldMap(Type<S> sourceType, String sourceName,
					S source, Type<D> destType, String destName, D dest, MappingContext mappingContext) {
				// TODO Auto-generated method stub
				System.out.println(sourceName + " : " + destName);
				return super.shouldMap(sourceType, sourceName, source, destType, destName, dest, mappingContext);
			}
			
			@SuppressWarnings("unchecked")
			@Override
			public <S extends String> S filterSource(S sourceValue, Type<S> sourceType, String sourceName,
					Type<?> destType, String destName, MappingContext mappingContext) {
				// TODO Auto-generated method stub
				return (S)(sourceValue.equalsIgnoreCase("M")?"MALE":"FEMALE");
			}
			
		}); 
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
		.field("gender","details.sex")
		.fieldMap("dateOfBirth","details.dateOfBirth").converter("localdateconvertor").add();
		;
	}

	private void mapNames(ClassMapBuilder<Individual, Customer> mapperFactory) {
		mapperFactory.mapNulls(false)
		.field("names.firstName","details.name.fName")
		.field("names.lastName","details.name.lName")
		.field("names.preferredName","details.name.pName");
	}
	
	private void mapPreferences(ClassMapBuilder<Individual, Customer> mapperFactory) {
		mapperFactory.mapNulls(false)
		.field("preferences.marketingConsent","attributes.marketingConsentFlag")
		.fieldMap("preferences.consentDate","attributes.edocsConsentDate").converter("localdateconvertor").add();
	}

	public Customer mapIndividualToCustomer(Individual individual) {
		
		return mapperFacade.map(individual, Customer.class);
	}
	
	public Individual mapReverse(Customer individual) {
		
		return mapperFacade.map(individual, Individual.class);
	}

}
