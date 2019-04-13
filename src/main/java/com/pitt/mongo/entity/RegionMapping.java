package com.pitt.mongo.entity;

public class RegionMapping {
    private final static String[] regions = {
            "Australasia & Oceania","Central America & Caribbean","Central Asia","East Asia",
            "Eastern Europe","Middle East & North Africa","North America","South America",
            "South Asia","Southeast Asia","Sub-Saharan Africa","Western Europe"
    };

    public static String getRegion(int code){
        return regions[code];
    }
}
