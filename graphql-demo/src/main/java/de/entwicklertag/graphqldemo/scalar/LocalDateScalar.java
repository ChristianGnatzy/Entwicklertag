package de.entwicklertag.graphqldemo.scalar;

import graphql.language.StringValue;
import graphql.schema.Coercing;
import graphql.schema.GraphQLScalarType;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class LocalDateScalar extends GraphQLScalarType {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public LocalDateScalar() {
        super("LocalDate", "Beschreibung", new Coercing<LocalDate, String>() {

            @Override
            public String serialize(Object result) {
                if (result instanceof LocalDate) {
                    return ((LocalDate) result).format(formatter);  // value send to the client
                }
                return null;
            }

            @Override
            public LocalDate parseValue(Object input) {
                if (input instanceof String) {
                    return LocalDate.parse(input.toString(), formatter);   // value from the client - parse inline values
                }
                return null;
            }

            @Override
            public LocalDate parseLiteral(Object input) {
                if (input instanceof StringValue) {
                    return LocalDate.parse(((StringValue) input).getValue(), formatter);  // value from the client - parse variables
                }
                return null;
            }
        });
    }
}
