package ma.glasnost.orika.generated;

public class Orika_Customer_Individual_Mapper569471518537798$0 extends ma.glasnost.orika.impl.GeneratedMapperBase {

	public void mapAtoB(java.lang.Object a, java.lang.Object b, ma.glasnost.orika.MappingContext mappingContext) {


super.mapAtoB(a, b, mappingContext);


// sourceType: Individual
au.com.home.local.orika.input.Individual source = ((au.com.home.local.orika.input.Individual)a); 
// destinationType: Customer
au.com.home.local.orika.output.Customer destination = ((au.com.home.local.orika.output.Customer)b); 

if (!(((au.com.home.local.orika.input.IndividualName)source.getNames()) == null)){ 
if ( (!(((au.com.home.local.orika.input.IndividualName)source.getNames()) == null) && !(((java.lang.String)((au.com.home.local.orika.input.IndividualName)source.getNames()).getFirstName()) == null))) {
if ( (!(((au.com.home.local.orika.input.IndividualName)source.getNames()) == null) && !(((java.lang.String)((au.com.home.local.orika.input.IndividualName)source.getNames()).getFirstName()) == null))){

if((((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()) == null)) { 

destination.setDetails(((au.com.home.local.orika.output.IndividualDetail)((ma.glasnost.orika.BoundMapperFacade)usedMapperFacades[0]).newObject(((java.lang.String)((au.com.home.local.orika.input.IndividualName)source.getNames()).getFirstName()), mappingContext))); 
}
if((((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()).getName()) == null)) { 

((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()).setName(((au.com.home.local.orika.output.NamePart)((ma.glasnost.orika.BoundMapperFacade)usedMapperFacades[1]).newObject(((java.lang.String)((au.com.home.local.orika.input.IndividualName)source.getNames()).getFirstName()), mappingContext))); 
}
}

if ( (!(((au.com.home.local.orika.input.IndividualName)source.getNames()) == null) && !(((java.lang.String)((au.com.home.local.orika.input.IndividualName)source.getNames()).getFirstName()) == null))){ 
((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()).getName()).setfName(((java.lang.String)((au.com.home.local.orika.input.IndividualName)source.getNames()).getFirstName())); 
}
}
}if (!(((au.com.home.local.orika.input.IndividualName)source.getNames()) == null)){ 
if ( (!(((au.com.home.local.orika.input.IndividualName)source.getNames()) == null) && !(((java.lang.String)((au.com.home.local.orika.input.IndividualName)source.getNames()).getLastName()) == null))) {
if ( (!(((au.com.home.local.orika.input.IndividualName)source.getNames()) == null) && !(((java.lang.String)((au.com.home.local.orika.input.IndividualName)source.getNames()).getLastName()) == null))){

if((((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()) == null)) { 

destination.setDetails(((au.com.home.local.orika.output.IndividualDetail)((ma.glasnost.orika.BoundMapperFacade)usedMapperFacades[0]).newObject(((java.lang.String)((au.com.home.local.orika.input.IndividualName)source.getNames()).getLastName()), mappingContext))); 
}
if((((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()).getName()) == null)) { 

((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()).setName(((au.com.home.local.orika.output.NamePart)((ma.glasnost.orika.BoundMapperFacade)usedMapperFacades[1]).newObject(((java.lang.String)((au.com.home.local.orika.input.IndividualName)source.getNames()).getLastName()), mappingContext))); 
}
}

if ( (!(((au.com.home.local.orika.input.IndividualName)source.getNames()) == null) && !(((java.lang.String)((au.com.home.local.orika.input.IndividualName)source.getNames()).getLastName()) == null))){ 
((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()).getName()).setlName(((java.lang.String)((au.com.home.local.orika.input.IndividualName)source.getNames()).getLastName())); 
}
}
}if (!(((au.com.home.local.orika.input.IndividualName)source.getNames()) == null)){ 
if ( (!(((au.com.home.local.orika.input.IndividualName)source.getNames()) == null) && !(((java.lang.String)((au.com.home.local.orika.input.IndividualName)source.getNames()).getPreferredName()) == null))) {
if ( (!(((au.com.home.local.orika.input.IndividualName)source.getNames()) == null) && !(((java.lang.String)((au.com.home.local.orika.input.IndividualName)source.getNames()).getPreferredName()) == null))){

if((((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()) == null)) { 

destination.setDetails(((au.com.home.local.orika.output.IndividualDetail)((ma.glasnost.orika.BoundMapperFacade)usedMapperFacades[0]).newObject(((java.lang.String)((au.com.home.local.orika.input.IndividualName)source.getNames()).getPreferredName()), mappingContext))); 
}
if((((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()).getName()) == null)) { 

((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()).setName(((au.com.home.local.orika.output.NamePart)((ma.glasnost.orika.BoundMapperFacade)usedMapperFacades[1]).newObject(((java.lang.String)((au.com.home.local.orika.input.IndividualName)source.getNames()).getPreferredName()), mappingContext))); 
}
}

if ( (!(((au.com.home.local.orika.input.IndividualName)source.getNames()) == null) && !(((java.lang.String)((au.com.home.local.orika.input.IndividualName)source.getNames()).getPreferredName()) == null))){ 
((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()).getName()).setpName(((java.lang.String)((au.com.home.local.orika.input.IndividualName)source.getNames()).getPreferredName())); 
}
}
}if ( !(((java.lang.String)source.getGender()) == null)) {
if ( !(((java.lang.String)source.getGender()) == null)){

if((((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()) == null)) { 

destination.setDetails(((au.com.home.local.orika.output.IndividualDetail)((ma.glasnost.orika.BoundMapperFacade)usedMapperFacades[0]).newObject(((java.lang.String)source.getGender()), mappingContext))); 
}
}
if (((!(((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()) == null)) && ((ma.glasnost.orika.Filter)usedFilters[0]).shouldMap(((ma.glasnost.orika.metadata.Type)usedTypes[0]), "gender", ((java.lang.String)source.getGender()), ((ma.glasnost.orika.metadata.Type)usedTypes[0]), "details.sex", ((java.lang.String)((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()).getSex()), mappingContext)) || (((((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()) == null)) && ((ma.glasnost.orika.Filter)usedFilters[0]).shouldMap(((ma.glasnost.orika.metadata.Type)usedTypes[0]), "gender", ((java.lang.String)source.getGender()), ((ma.glasnost.orika.metadata.Type)usedTypes[0]), "details.sex", null, mappingContext))) {
if ( !(((java.lang.String)source.getGender()) == null)){ 
((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()).setSex(((java.lang.String)((ma.glasnost.orika.Filter)usedFilters[0]).filterSource(((java.lang.String)source.getGender()), ((ma.glasnost.orika.metadata.Type)usedTypes[0]), "gender", ((ma.glasnost.orika.metadata.Type)usedTypes[0]), "sex", mappingContext))); 
}
}

}if ( !(((java.time.LocalDate)source.getDateOfBirth()) == null)) {
if ( !(((java.time.LocalDate)source.getDateOfBirth()) == null)){

if((((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()) == null)) { 

destination.setDetails(((au.com.home.local.orika.output.IndividualDetail)((ma.glasnost.orika.BoundMapperFacade)usedMapperFacades[2]).newObject(((java.time.LocalDate)source.getDateOfBirth()), mappingContext))); 
}
}

if ( !(((java.time.LocalDate)source.getDateOfBirth()) == null)){ 
((au.com.home.local.orika.output.IndividualDetail)destination.getDetails()).setDateOfBirth(((java.lang.String)((ma.glasnost.orika.Converter)usedConverters[0]).convert(((java.time.LocalDate)source.getDateOfBirth()), ((ma.glasnost.orika.metadata.Type)usedTypes[0]), mappingContext))); 
}
}if (!(((au.com.home.local.orika.input.Preferences)source.getPreferences()) == null)){ 
if ( (!(((au.com.home.local.orika.input.Preferences)source.getPreferences()) == null) && !(((java.lang.Boolean)((au.com.home.local.orika.input.Preferences)source.getPreferences()).getMarketingConsent()) == null))) {
if ( (!(((au.com.home.local.orika.input.Preferences)source.getPreferences()) == null) && !(((java.lang.Boolean)((au.com.home.local.orika.input.Preferences)source.getPreferences()).getMarketingConsent()) == null))){

if((((au.com.home.local.orika.output.CustomerAttributes)destination.getAttributes()) == null)) { 

destination.setAttributes(((au.com.home.local.orika.output.CustomerAttributes)((ma.glasnost.orika.BoundMapperFacade)usedMapperFacades[3]).newObject(((java.lang.Boolean)((au.com.home.local.orika.input.Preferences)source.getPreferences()).getMarketingConsent()), mappingContext))); 
}
}

if ( (!(((au.com.home.local.orika.input.Preferences)source.getPreferences()) == null) && !(((java.lang.Boolean)((au.com.home.local.orika.input.Preferences)source.getPreferences()).getMarketingConsent()) == null))){ 
((au.com.home.local.orika.output.CustomerAttributes)destination.getAttributes()).setMarketingConsentFlag(((java.lang.Boolean)((au.com.home.local.orika.input.Preferences)source.getPreferences()).getMarketingConsent())); 
}
}
}if (!(((au.com.home.local.orika.input.Preferences)source.getPreferences()) == null)){ 
if ( (!(((au.com.home.local.orika.input.Preferences)source.getPreferences()) == null) && !(((java.time.LocalDate)((au.com.home.local.orika.input.Preferences)source.getPreferences()).getConsentDate()) == null))) {
if ( (!(((au.com.home.local.orika.input.Preferences)source.getPreferences()) == null) && !(((java.time.LocalDate)((au.com.home.local.orika.input.Preferences)source.getPreferences()).getConsentDate()) == null))){

if((((au.com.home.local.orika.output.CustomerAttributes)destination.getAttributes()) == null)) { 

destination.setAttributes(((au.com.home.local.orika.output.CustomerAttributes)((ma.glasnost.orika.BoundMapperFacade)usedMapperFacades[4]).newObject(((java.time.LocalDate)((au.com.home.local.orika.input.Preferences)source.getPreferences()).getConsentDate()), mappingContext))); 
}
}

if ( (!(((au.com.home.local.orika.input.Preferences)source.getPreferences()) == null) && !(((java.time.LocalDate)((au.com.home.local.orika.input.Preferences)source.getPreferences()).getConsentDate()) == null))){ 
((au.com.home.local.orika.output.CustomerAttributes)destination.getAttributes()).setEdocsConsentDate(((java.lang.String)((ma.glasnost.orika.Converter)usedConverters[0]).convert(((java.time.LocalDate)((au.com.home.local.orika.input.Preferences)source.getPreferences()).getConsentDate()), ((ma.glasnost.orika.metadata.Type)usedTypes[0]), mappingContext))); 
}
}
}
		if(customMapper != null) { 
			 customMapper.mapAtoB(source, destination, mappingContext);
		}
	}

	public void mapBtoA(java.lang.Object a, java.lang.Object b, ma.glasnost.orika.MappingContext mappingContext) {


super.mapBtoA(a, b, mappingContext);


// sourceType: Customer
au.com.home.local.orika.output.Customer source = ((au.com.home.local.orika.output.Customer)a); 
// destinationType: Individual
au.com.home.local.orika.input.Individual destination = ((au.com.home.local.orika.input.Individual)b); 

if (!(((au.com.home.local.orika.output.IndividualDetail)source.getDetails()) == null) && !(((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()) == null)){ 
if ( (!(((au.com.home.local.orika.output.IndividualDetail)source.getDetails()) == null) && !(((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()) == null) && !(((java.lang.String)((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()).getfName()) == null))){

if((((au.com.home.local.orika.input.IndividualName)destination.getNames()) == null)) { 

destination.setNames(((au.com.home.local.orika.input.IndividualName)((ma.glasnost.orika.BoundMapperFacade)usedMapperFacades[5]).newObject(((java.lang.String)((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()).getfName()), mappingContext))); 
}
}

if ( (!(((au.com.home.local.orika.output.IndividualDetail)source.getDetails()) == null) && !(((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()) == null) && !(((java.lang.String)((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()).getfName()) == null))){ 
((au.com.home.local.orika.input.IndividualName)destination.getNames()).setFirstName(((java.lang.String)((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()).getfName())); 
} else if (!(((au.com.home.local.orika.input.IndividualName)destination.getNames()) == null)){ 
((au.com.home.local.orika.input.IndividualName)destination.getNames()).setFirstName(null);
 }
}if (!(((au.com.home.local.orika.output.IndividualDetail)source.getDetails()) == null) && !(((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()) == null)){ 
if ( (!(((au.com.home.local.orika.output.IndividualDetail)source.getDetails()) == null) && !(((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()) == null) && !(((java.lang.String)((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()).getlName()) == null))){

if((((au.com.home.local.orika.input.IndividualName)destination.getNames()) == null)) { 

destination.setNames(((au.com.home.local.orika.input.IndividualName)((ma.glasnost.orika.BoundMapperFacade)usedMapperFacades[5]).newObject(((java.lang.String)((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()).getlName()), mappingContext))); 
}
}

if ( (!(((au.com.home.local.orika.output.IndividualDetail)source.getDetails()) == null) && !(((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()) == null) && !(((java.lang.String)((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()).getlName()) == null))){ 
((au.com.home.local.orika.input.IndividualName)destination.getNames()).setLastName(((java.lang.String)((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()).getlName())); 
} else if (!(((au.com.home.local.orika.input.IndividualName)destination.getNames()) == null)){ 
((au.com.home.local.orika.input.IndividualName)destination.getNames()).setLastName(null);
 }
}if (!(((au.com.home.local.orika.output.IndividualDetail)source.getDetails()) == null) && !(((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()) == null)){ 
if ( (!(((au.com.home.local.orika.output.IndividualDetail)source.getDetails()) == null) && !(((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()) == null) && !(((java.lang.String)((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()).getpName()) == null))){

if((((au.com.home.local.orika.input.IndividualName)destination.getNames()) == null)) { 

destination.setNames(((au.com.home.local.orika.input.IndividualName)((ma.glasnost.orika.BoundMapperFacade)usedMapperFacades[5]).newObject(((java.lang.String)((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()).getpName()), mappingContext))); 
}
}

if ( (!(((au.com.home.local.orika.output.IndividualDetail)source.getDetails()) == null) && !(((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()) == null) && !(((java.lang.String)((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()).getpName()) == null))){ 
((au.com.home.local.orika.input.IndividualName)destination.getNames()).setPreferredName(((java.lang.String)((au.com.home.local.orika.output.NamePart)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getName()).getpName())); 
} else if (!(((au.com.home.local.orika.input.IndividualName)destination.getNames()) == null)){ 
((au.com.home.local.orika.input.IndividualName)destination.getNames()).setPreferredName(null);
 }
}if (!(((au.com.home.local.orika.output.IndividualDetail)source.getDetails()) == null)){ 
if (((ma.glasnost.orika.Filter)usedFilters[0]).shouldMap(((ma.glasnost.orika.metadata.Type)usedTypes[0]), "details.sex", ((java.lang.String)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getSex()), ((ma.glasnost.orika.metadata.Type)usedTypes[0]), "gender", ((java.lang.String)destination.getGender()), mappingContext)) {
destination.setGender(((java.lang.String)((ma.glasnost.orika.Filter)usedFilters[0]).filterSource(((java.lang.String)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getSex()), ((ma.glasnost.orika.metadata.Type)usedTypes[0]), "sex", ((ma.glasnost.orika.metadata.Type)usedTypes[0]), "gender", mappingContext))); 
}

}if (!(((au.com.home.local.orika.output.IndividualDetail)source.getDetails()) == null)){ 

if ( (!(((au.com.home.local.orika.output.IndividualDetail)source.getDetails()) == null) && !(((java.lang.String)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getDateOfBirth()) == null))){ 
destination.setDateOfBirth(((java.time.LocalDate)((ma.glasnost.orika.Converter)usedConverters[0]).convert(((java.lang.String)((au.com.home.local.orika.output.IndividualDetail)source.getDetails()).getDateOfBirth()), ((ma.glasnost.orika.metadata.Type)usedTypes[1]), mappingContext))); 
} else { 
destination.setDateOfBirth(null);
 }
}if (!(((au.com.home.local.orika.output.CustomerAttributes)source.getAttributes()) == null)){ 
if ( (!(((au.com.home.local.orika.output.CustomerAttributes)source.getAttributes()) == null) && !(((java.lang.Boolean)((au.com.home.local.orika.output.CustomerAttributes)source.getAttributes()).getMarketingConsentFlag()) == null))){

if((((au.com.home.local.orika.input.Preferences)destination.getPreferences()) == null)) { 

destination.setPreferences(((au.com.home.local.orika.input.Preferences)((ma.glasnost.orika.BoundMapperFacade)usedMapperFacades[6]).newObject(((java.lang.Boolean)((au.com.home.local.orika.output.CustomerAttributes)source.getAttributes()).getMarketingConsentFlag()), mappingContext))); 
}
}

if ( (!(((au.com.home.local.orika.output.CustomerAttributes)source.getAttributes()) == null) && !(((java.lang.Boolean)((au.com.home.local.orika.output.CustomerAttributes)source.getAttributes()).getMarketingConsentFlag()) == null))){ 
((au.com.home.local.orika.input.Preferences)destination.getPreferences()).setMarketingConsent(((java.lang.Boolean)((au.com.home.local.orika.output.CustomerAttributes)source.getAttributes()).getMarketingConsentFlag())); 
} else if (!(((au.com.home.local.orika.input.Preferences)destination.getPreferences()) == null)){ 
((au.com.home.local.orika.input.Preferences)destination.getPreferences()).setMarketingConsent(null);
 }
}if (!(((au.com.home.local.orika.output.CustomerAttributes)source.getAttributes()) == null)){ 
if ( (!(((au.com.home.local.orika.output.CustomerAttributes)source.getAttributes()) == null) && !(((java.lang.String)((au.com.home.local.orika.output.CustomerAttributes)source.getAttributes()).getEdocsConsentDate()) == null))){

if((((au.com.home.local.orika.input.Preferences)destination.getPreferences()) == null)) { 

destination.setPreferences(((au.com.home.local.orika.input.Preferences)((ma.glasnost.orika.BoundMapperFacade)usedMapperFacades[7]).newObject(((java.lang.String)((au.com.home.local.orika.output.CustomerAttributes)source.getAttributes()).getEdocsConsentDate()), mappingContext))); 
}
}

if ( (!(((au.com.home.local.orika.output.CustomerAttributes)source.getAttributes()) == null) && !(((java.lang.String)((au.com.home.local.orika.output.CustomerAttributes)source.getAttributes()).getEdocsConsentDate()) == null))){ 
((au.com.home.local.orika.input.Preferences)destination.getPreferences()).setConsentDate(((java.time.LocalDate)((ma.glasnost.orika.Converter)usedConverters[0]).convert(((java.lang.String)((au.com.home.local.orika.output.CustomerAttributes)source.getAttributes()).getEdocsConsentDate()), ((ma.glasnost.orika.metadata.Type)usedTypes[1]), mappingContext))); 
} else if (!(((au.com.home.local.orika.input.Preferences)destination.getPreferences()) == null)){ 
((au.com.home.local.orika.input.Preferences)destination.getPreferences()).setConsentDate(null);
 }
}
		if(customMapper != null) { 
			 customMapper.mapBtoA(source, destination, mappingContext);
		}
	}

}