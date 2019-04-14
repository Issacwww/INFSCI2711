package com.pitt.mysql.controller;

import com.pitt.mongo.entity.RegionMapping;
import com.pitt.mysql.entity.*;
import com.pitt.mysql.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mysql")
public class controller {

    @Autowired
    private DayStateRepos dayStateRepos;

    @Autowired
    private MonthStateRepos monthStateRepos;

    @Autowired
    private MonthCountryRepos monthCountryRepos;

    @Autowired
    private YearStateRepos yearStateRepos;

    @Autowired
    private DayCountryRepos dayCountryRepos;

    @Autowired
    private DayRegionRepos dayRegionRepos;

    @Autowired
    private MonthRegionRepos monthRegionRepos;
    @Autowired
    private YearCountryRepos yearCountryRepos;
    @Autowired
    private MonthStateAttRepos monthStateAttRepos;
    @Autowired
    private MonthCountryAttRepos monthCountryAttRepos;
    @Autowired
    private YearStateAttRepos yearStateAttRepos;
    @Autowired
    private MonthRegionAttRepos monthRegionAttRepos;
    @Autowired
    private YearCountryAttRepos yearCountryAttRepos;
    @Autowired
    private MonthStateTargRepos monthStateTargRepos;
    @Autowired
    private MonthCountryTargRepos monthCountryTargRepos;
    @Autowired
    private YearStateTargRepos yearStateTargRepos;
    @Autowired
    private MonthRegionTargRepo monthRegionTargRepo;
    @Autowired
    private YearCountryTargRepos yearCountryTargRepos;
    @Autowired
    private MonthStateWeapRepos monthStateWeapRepos;
    @Autowired
    private MonthCountryWeapRepos monthCountryWeapRepos;
    @Autowired
    private YearStateWeapRepos yearStateWeapRepos;
    @Autowired
    private MonthRegionWeapRepos monthRegionWeapRepos;
    @Autowired
    private YearCountryWeapRepos yearCountryWeapRepos;

    @GetMapping
    public Object queryEntrance(
            @RequestParam("year") Integer year, @RequestParam("month") Integer month, @RequestParam("day") Integer day,
            @RequestParam("region") String regioncode, @RequestParam("country") String country, @RequestParam("state") String state,
            @RequestParam(value = "situation") Integer situation, @RequestParam("types") List<Integer> types
    ){
        String region = null;
        if (!regioncode.equals("")){
            region = RegionMapping.getRegion(Integer.valueOf(regioncode));
        }

        System.out.println("y-m-d: "+year+"-"+month+"-"+day+"\nR-C-S: "+region+"-"+country+"-"+state);
        //List<Object> intermediate = null;

        switch (situation){
            case 0:
                List<DayProvstate> intermediate0 =  dayStateRepos.findAllByYearAndMonthAndCountryAndProvstate(year,month,country,state);
                return intermediate0;
            case 1:
                List<MonthProvstate> intermediate1 = monthStateRepos.findAllByYearAndProvstateAndCountry(year,state,country);
                return intermediate1;
            case 2:
                List<DayCountry> intermediate2 = dayCountryRepos.findAllByCountryAndYearAndMonth(country,year,month);
                return intermediate2;
            case 3:
                List<MonthCountry> intermediate3 = monthCountryRepos.findAllByCountryAndYear(country, year);
                return intermediate3;
            case 4:
                List<YearProvstate> intermediate4 = yearStateRepos.findAllByCountryAndYear(country,year);
                return intermediate4;
            case 5:
                List<DayRegion> intermediate5 = dayRegionRepos.findAllByRegionAndYearAndMonth(region,year,month);
                return intermediate5;
            case 6:
                List<MonthRegion> intermediate6 = monthRegionRepos.findAllByRegionAndYear(region, year);
                return  intermediate6;
            case 7:
                List<YearCountry> intermediate7 = yearCountryRepos.findAllByRegionAndYear(region, year);
                return intermediate7;
            case 8:
                List<MonthProvstateAtt> intermediate8 = monthStateAttRepos.findAllByCountryAndProvstateAndYearAndAttacktype1In(country, state,
                        year, types);
                return intermediate8;
            case 9:
                List<MonthCountryAtt> intermediate9 = monthCountryAttRepos.findAllByCountryAndYearAndAttacktype1In(country, year, types);
                return intermediate9;
            case 10:
                List<YearProvstateAtt> intermediate10 = yearStateAttRepos.findAllByCountryAndYearAndAttacktype1In(country, year, types);
                return intermediate10;
            case 11:
                List<MonthRegionAtt> intermediate11 = monthRegionAttRepos.findAllByRegionAndYearAndAttacktype1In(region,year,types);
                return intermediate11;
            case 12:
                List<YearCountryAtt> intermediate12 = yearCountryAttRepos.findAllByRegionAndYearAndAttacktype1In(region, year, types);
                return intermediate12;
            case 13:
                List<MonthProvstateTarg> intermediate13 = monthStateTargRepos.findAllByCountryAndProvstateAndYearAndTargettype1In(country, state, year, types);
                return intermediate13;
            case 14:
                List<MonthCountryTarg> intermediate14 = monthCountryTargRepos.findAllByCountryAndYearAndTargettype1In(country,year,types);
                return intermediate14;
            case 15:
                List<YearProvstateTarg> intermediate15 = yearStateTargRepos.findAllByCountryAndYearAndTargettype1In(country,year,types);
                return intermediate15;
            case 16:
                List<MonthRegionTarg> intermediate16 = monthRegionTargRepo.findAllByRegionAndYearAndTargettype1In(region,year,types);
                return intermediate16;
            case 17:
                List<YearCountryTarg> intermediate17 = yearCountryTargRepos.findAllByRegionAndYearAndTargettype1In(region, year, types);
                return intermediate17;
            case 18:
                List<MonthProvstateWeap> intermediate18 = monthStateWeapRepos.findAllByCountryAndProvstateAndYearAndWeaptype1In(country,state,year,types);
                return intermediate18;
            case 19:
                List<MonthCountryWeap> intermediate19 = monthCountryWeapRepos.findAllByCountryAndYearAndWeaptype1In(country,year,types);
                return intermediate19;
            case 20:
                List<YearProvstateWeap> intermediate20 = yearStateWeapRepos.findAllByCountryAndYearAndWeaptype1In(country, year, types);
                return intermediate20;
            case 21:
                List<MonthRegionWeap> intermediate21 = monthRegionWeapRepos.findAllByRegionAndYearAndWeaptype1In(region,year,types);
                return intermediate21;
            case 22:
                List<YearCountryWeap> intermediate22 = yearCountryWeapRepos.findAllByRegionAndYearAndWeaptype1In(region,year,types);
                return intermediate22;
            case 23:
                List<MonthProvstateAtt> intermediate23 = monthStateAttRepos.findAllByCountryAndYearAndMonthAndAttacktype1In(country,year,month,types);
                return intermediate23;
            case 24:
                List<MonthCountryAtt> intermediate24 = monthCountryAttRepos.findAllByRegionAndYearAndMonthAndAttacktype1In(region,year,month,types);
                return intermediate24;
            case 25:
                List<MonthProvstateWeap> intermediate25 = monthStateWeapRepos.findAllByCountryAndYearAndWeaptype1In(country,year,types);
                return intermediate25;
            case 26:
                List<MonthCountryWeap> intermediate26 = monthCountryWeapRepos.findAllByRegionAndYearAndWeaptype1In(region,year,types);
                return  intermediate26;
            case 27:
                List<MonthProvstateTarg> intermediate27 = monthStateTargRepos.findAllByCountryAndYearAndTargettype1In(country,year,types);
                return intermediate27;
            case 28:
                List<MonthCountryTarg> intermediate28 = monthCountryTargRepos.findAllByRegionAndYearAndTargettype1In(region,year,types);
                return intermediate28;
                default:
                    return null;
        }
    }



    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

}
