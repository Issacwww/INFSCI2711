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
            @RequestParam(value = "situation") Integer situation, @RequestParam("types") List<Integer> types)
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
            case 0:
                intermediate =  dayStateRepo.getAllById_YearAndId_MonthAndId_CountryAndId_ProvstateOrderById(
                        year,month,country,state
                );
                break;
//                for (View v: intermediate)
//                    result.add(new ViewInOneLevel(v));
//                return result;
            case 1:
                intermediate = monthStateRepo.getAllById_YearAndId_CountryAndId_ProvstateOrderById(
                        year,country,state
                );
                break;
            case 2:
                intermediate = dayCountryRepo.getAllById_YearAndId_MonthAndId_CountryOrderById(
                        year,month,country
                );
                break;
            case 3:
                intermediate = monthCountryRepo.getAllById_YearAndId_CountryOrderById(
                        year,country
                );
                break;
            case 4:
                intermediate = yearStateRepo.getAllById_YearAndId_CountryOrderById(
                        year,country
                );
                break;
            case 5:
                intermediate = dayRegionRepo.getAllById_YearAndId_MonthAndId_RegionOrderById(
                        year,month,region
                );
                break;
            case 6:
                intermediate = monthRegionRepo.getAllById_YearAndId_RegionOrderById(year,region);
                break;
            case 7:
                intermediate = yearCountryRepo.getAllById_YearAndId_RegionOrderById(year,region);
                break;
            case 8:
                intermediate = monthStateAttackRepo.findByAttackTypes(year,country,state,types);
                break;
            case 9:
                intermediate = monthCountryAttackRepo.findByAttackTypes(year,country,types);
                break;
            case 10:
                intermediate = yearStateAttackRepo.findByAttackTypes(year,country,types);
                break;
            case 11:
                intermediate = monthRegionAttackRepo.findByAttackTypes(year,region,types);
                break;
            case 12:
                intermediate = yearCountryAttackRepo.findByAttackTypes(year,region,types);
                break;
            case 13:
                intermediate = monthStateTargetRepo.findByTargetTypes(year,country,state,types);
                break;
            case 14:
                intermediate = monthCountryTargetRepo.findByTargetTypes(year,country,types);
                break;
            case 15:
                intermediate = yearStateTargetRepo.findByTargetTypes(year,country,types);
                break;
            case 16:
                intermediate = monthRegionTargetRepo.findByTargetTypes(year,month,region,types);
                break;
            case 17:
                intermediate = yearCountryTargetRepo.findByTargetTypes(year,country,types);
                break;
            case 18:
                intermediate = monthStateWeapRepo.findByWeapTypes(year,country,state,types);
                break;
            case 19:
                intermediate = monthCountryWeapRepo.findByWeapTypes(year,country,types);
                break;
            case 20:
                intermediate = yearStateWeapRepo.findByWeapTypes(year,country,types);
                break;
            case 21:
                intermediate = monthRegionWeapRepo.findByWeapTypes(year,region,types);
                break;
            case 22:
                intermediate = yearCountryWeapRepo.findByWeapTypes(year,region,types);
                break;
            case 23:
                intermediate = monthStateAttackRepo.findByAttackTypes(year,month,country,types);
                break;
            case 24:
                intermediate = monthCountryAttackRepo.findByAttackTypes(year,month,region,types);
                break;
            case 25:
                intermediate = monthStateWeapRepo.findByWeapTypes(year,month,country,types);
                break;
            case 26:
                intermediate = monthCountryWeapRepo.findByWeapTypes(year,month,region,types);
                break;
            case 27:
                intermediate = monthStateTargetRepo.findByTargetTypes(year,month,country,types);
                break;
            case 28:
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
