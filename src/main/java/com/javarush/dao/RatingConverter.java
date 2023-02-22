package com.javarush.dao;

import com.javarush.domain.Rating;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class RatingConverter implements AttributeConverter<Rating, String> {
    @Override
    public String convertToDatabaseColumn(Rating attribute) {

        return attribute.getValue();
    }

    @Override
    public Rating convertToEntityAttribute(String dbData) {
        Rating[] vallues = Rating.values();
        for (Rating rating : vallues) {
            if(rating.getValue().equals(dbData)){
                return rating;
            }
        }
        return null;
    }
}
