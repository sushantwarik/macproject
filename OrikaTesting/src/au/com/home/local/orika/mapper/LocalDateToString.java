package au.com.home.local.orika.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.metadata.Type;

public class LocalDateToString extends BidirectionalConverter<LocalDate,String>{



	@Override
	public String convertTo(LocalDate source, Type<String> destinationType, MappingContext mappingContext) {
		// TODO Auto-generated method stub
		return source.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}

	@Override
	public LocalDate convertFrom(String source, Type<LocalDate> destinationType, MappingContext mappingContext) {
		// TODO Auto-generated method stub
		return LocalDate.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}

}
