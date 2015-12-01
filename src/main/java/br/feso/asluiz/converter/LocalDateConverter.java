package br.feso.asluiz.converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.enterprise.context.RequestScoped;

import br.com.caelum.vraptor.Convert;
import br.com.caelum.vraptor.converter.ConversionException;
import br.com.caelum.vraptor.converter.ConversionMessage;
import br.com.caelum.vraptor.converter.Converter;

@Convert(LocalDate.class)
@RequestScoped
public class LocalDateConverter implements Converter<LocalDate> {

	@Override
	public LocalDate convert(String value, Class<? extends LocalDate> arg) {
		if(value == null || value.isEmpty())
			return null;
		
		try {
			return LocalDate.parse(value, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		} catch (DateTimeParseException e) {
			throw new ConversionException(new ConversionMessage("is_not_a_valid_date", value));
		}
	}

}