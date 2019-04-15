package com.pitt.mongo.controller;

import com.google.gson.Gson;
import com.pitt.mongo.entity.Fact;
import com.pitt.mongo.entity.RegionMapping;
import com.pitt.mongo.entity.View;
import com.pitt.mongo.entity.ViewInOneLevel;
import com.pitt.mongo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/mongo")
@CrossOrigin
public class FactController {

    @Autowired
    private FactRepo factRepo;
    @Autowired
    private DayRegionRepo dayRegionRepo ;
    @Autowired
    private MonthRegionRepo monthRegionRepo ;
    @Autowired
    private MonthStateAttackRepo monthStateAttackRepo ;
    @Autowired
    private DayCountryRepo dayCountryRepo ;
    @Autowired
    private MonthCountryWeapRepo monthCountryWeapRepo ;
    @Autowired
    private YearCountryRepo yearCountryRepo ;
    @Autowired
    private YearCountryAttackRepo yearCountryAttackRepo ;
    @Autowired
    private MonthCountryAttackRepo monthCountryAttackRepo ;
    @Autowired
    private YearCountryWeapRepo yearCountryWeapRepo ;
    @Autowired
    private MonthStateWeapRepo monthStateWeapRepo ;
    @Autowired
    private YearStateAttackRepo yearStateAttackRepo ;
    @Autowired
    private MonthRegionWeapRepo monthRegionWeapRepo ;
    @Autowired
    private MonthRegionTargetRepo monthRegionTargetRepo ;
    @Autowired
    private DayStateRepo dayStateRepo ;
    @Autowired
    private MonthStateRepo monthStateRepo ;
    @Autowired
    private MonthRegionAttackRepo monthRegionAttackRepo ;
    @Autowired
    private YearStateTargetRepo yearStateTargetRepo ;
    @Autowired
    private YearCountryTargetRepo yearCountryTargetRepo ;
    @Autowired
    private MonthCountryTargetRepo monthCountryTargetRepo ;
    @Autowired
    private MonthCountryRepo monthCountryRepo ;
    @Autowired
    private YearStateWeapRepo yearStateWeapRepo ;
    @Autowired
    private YearStateRepo yearStateRepo ;
    @Autowired
    private MonthStateTargetRepo monthStateTargetRepo ;
    private Gson gson = new Gson();
    @GetMapping
    public String queryEntrance(
            @RequestParam("year") Integer year, @RequestParam("month") Integer month, @RequestParam("day") Integer day,
            @RequestParam("region") String regioncode, @RequestParam("country") String country, @RequestParam("state") String state,
            @RequestParam("situation") String situation, @RequestParam("types") List<Integer> types)
    {
//         String attacktype = params.get("attacktype"), targtype = params.get("targtype"), weaptype = params.get("weaptype");
        //according to the input params, decide which repo to use for the query
        String region = null;
        if(!regioncode.equals(""))
         region = RegionMapping.getRegion(Integer.valueOf(regioncode));
        List<ViewInOneLevel> result = new ArrayList<>();
//        System.out.println(id);
        List<View> intermediate = null;
        switch (situation){
            case "230t":
                intermediate =  dayStateRepo.getAllById_YearAndId_MonthAndId_CountryAndId_ProvstateOrderById(
                        year,month,country,state
                );
                break;
//                for (View v: intermediate)
//                    result.add(new ViewInOneLevel(v));
//                return result;
            case "130t":
                intermediate = monthStateRepo.getAllById_YearAndId_CountryAndId_ProvstateOrderById(
                        year,country,state
                );
                break;
            case "220t":
                intermediate = dayCountryRepo.getAllById_YearAndId_MonthAndId_CountryOrderById(
                        year,month,country
                );
                break;
            case "120t":
                intermediate = monthCountryRepo.getAllById_YearAndId_CountryOrderById(
                        year,country
                );
                break;
            case "120l":
                intermediate = yearStateRepo.getAllById_YearAndId_CountryOrderById(
                        year,country
                );
                break;
            case "210t":
                intermediate = dayRegionRepo.getAllById_YearAndId_MonthAndId_RegionOrderById(
                        year,month,region
                );
                break;
            case "110t":
                intermediate = monthRegionRepo.getAllById_YearAndId_RegionOrderById(year,region);
                break;
            case "110l":
                intermediate = yearCountryRepo.getAllById_YearAndId_RegionOrderById(year,region);
                break;
            case "131t":
                intermediate = monthStateAttackRepo.findByAttackTypes(year,country,state,types);
                break;
            case "121t":
                intermediate = monthCountryAttackRepo.findByAttackTypes(year,country,types);
                break;
            case "121l":
                intermediate = yearStateAttackRepo.findByAttackTypes(year,country,types);
                break;
            case "111t":
                intermediate = monthRegionAttackRepo.findByAttackTypes(year,region,types);
                break;
            case "111l":
                intermediate = yearCountryAttackRepo.findByAttackTypes(year,region,types);
                break;
            case "132t":
                intermediate = monthStateTargetRepo.findByTargetTypes(year,country,state,types);
                break;
            case "122t":
                intermediate = monthCountryTargetRepo.findByTargetTypes(year,country,types);
                break;
            case "122l":
                intermediate = yearStateTargetRepo.findByTargetTypes(year,country,types);
                break;
            case "112t":
                intermediate = monthRegionTargetRepo.findByTargetTypes(year,month,region,types);
                break;
            case "112l":
                intermediate = yearCountryTargetRepo.findByTargetTypes(year,country,types);
                break;
            case "133t":
                intermediate = monthStateWeapRepo.findByWeapTypes(year,country,state,types);
                break;
            case "123t":
                intermediate = monthCountryWeapRepo.findByWeapTypes(year,country,types);
                break;
            case "123l":
                intermediate = yearStateWeapRepo.findByWeapTypes(year,country,types);
                break;
            case "113t":
                intermediate = monthRegionWeapRepo.findByWeapTypes(year,region,types);
                break;
            case "113l":
                intermediate = yearCountryWeapRepo.findByWeapTypes(year,region,types);
                break;
            case "221l":
                intermediate = monthStateAttackRepo.findByAttackTypes(year,month,country,types);
                break;
            case "211l":
                intermediate = monthCountryAttackRepo.findByAttackTypes(year,month,region,types);
                break;
            case "223l":
                intermediate = monthStateWeapRepo.findByWeapTypes(year,month,country,types);
                break;
            case "213l":
                intermediate = monthCountryWeapRepo.findByWeapTypes(year,month,region,types);
                break;
            case "222l":
                intermediate = monthStateTargetRepo.findByTargetTypes(year,month,country,types);
                break;
            case "212l":
                intermediate = monthCountryTargetRepo.findByTargetTypes(year,month,region,types);
                break;
            default:
                //Time and Location
                //error
                break;
        }
        if (intermediate != null){
            for (View v : intermediate)
                result.add(new ViewInOneLevel(v));
        }
        return "{\"result\": " + gson.toJson(result) + " }";
    }

    @GetMapping("/facts")
    public List<Fact> getFactsByTimeLocType(
            @RequestParam("year") String year, @RequestParam("month") String month, @RequestParam("day") String day,
            @RequestParam("region") String region, @RequestParam("country") String country, @RequestParam("state") String state){
        return factRepo.findFactsByYearAndMonthAndDayAndRegionAndCountryAndProvstateOrderById(
                Integer.valueOf(year),Integer.valueOf(month),Integer.valueOf(day),
                region,country,state
        );

    }
    @GetMapping("/fact/{id}")
    public Fact getFactById(@PathVariable Long id){
        return factRepo.findById(id).get();
    }

    //test
    @GetMapping("/{y}/{m}/{d}")
    public List<Fact> getFactsByDate(@PathVariable("y") int y, @PathVariable("m") int m, @PathVariable("d") int d){
        return factRepo.findFactsByYearAndMonthAndDay(y,m,d);
    }

    @GetMapping("/{y}/{m}")
    public List<Fact> getFactsByMonth(@PathVariable("y") int y, @PathVariable("m") int m){
        return factRepo.findFactsByYearAndMonth(y,m);
    }

    @GetMapping("/{y}")
    public List<Fact> getFactsByYear(@PathVariable("y") int y){
        return factRepo.findAllByYearOrderById(y);
    }
}
