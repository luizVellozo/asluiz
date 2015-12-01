package br.feso.asluiz.converter;

import java.sql.Date;
import java.time.LocalDate;

import javax.enterprise.context.RequestScoped;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class LocalDatePersistenceConverter implements
    AttributeConverter<LocalDate, java.sql.Date> {
	
	@Override
    public Date convertToDatabaseColumn(LocalDate entityValue) {
        return (entityValue == null) ? null : Date.valueOf(entityValue);
    }

	@Override
    public LocalDate convertToEntityAttribute(java.sql.Date databaseValue) {
        return databaseValue.toLocalDate();
    }
}
