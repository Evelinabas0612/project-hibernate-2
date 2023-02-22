package com.javarush.domain;

import static java.util.Objects.isNull;

public enum Feature {
    TRAILERS("Trailers"),
    COMMENTARIES("Commentaries"),
    DELETED_SCENES("Deleted Scenes"),
    BEHIND_THE_SCENES("Behind the Scenes");

    private final String value;


    Feature(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public static Feature getFeatureByValue(String value){
        if(isNull(value) || value.isEmpty()){
            return null;
        }

        Feature[] fetures = Feature.values();
        for (Feature feture : fetures) {
            if(feture.value.equals(value)){
                return feture;
            }
        }
        return null;
    }
}
