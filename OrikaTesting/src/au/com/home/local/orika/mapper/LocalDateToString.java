package au.com.home.local.orika.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.metadata.Type;

public class LocalDateToString extends CustomConverter<LocalDate,String>{


	@Override
	public String convert(LocalDate source, Type<? extends String> destinationType, MappingContext mappingContext) {
		return source.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}

}
