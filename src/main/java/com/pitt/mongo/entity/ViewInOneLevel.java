package com.pitt.mongo.entity;

import org.springframework.context.annotation.Bean;


public class ViewInOneLevel {

    private int year;

    private int month;

    private int day;

    private String country;

    private String region;

    private String provstate;

    private int nkill;

    private int nwound;

    private int propvalue;

    private int num;

    public ViewInOneLevel(View view){
        year = view.getId().getYear();
        month = view.getId().getMonth();
        day = view.getId().getDay();
        country = view.getId().getCountry();
        region = view.getId().getRegion();
        provstate = view.getId().getProvstate();
        nkill = view.getNkill();
        nwound = view.getNwound();
        propvalue = view.getPropvalue();
        num = view.getNum();
    }
}
