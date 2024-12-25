



import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Exercise5 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();
        InMemoryWorldDao worldDao = InMemoryWorldDao.getInstance();
        Map<String, Country> countries = worldDao.getCountries();
       //write your answer here 
       

        List<Integer> CapticalCodes=countries.entrySet().stream()
        .map(entry->entry.getValue().getCapital())
        .filter(Objects::nonNull)
        .toList();

        List<City> matchedCapitalCities = countries.values().stream()
        .flatMap(country -> country.getCities().stream())
        .filter(city -> CapticalCodes.contains(city.getId()))        
        .toList();

        System.out.println(
            matchedCapitalCities.stream()
            .max(
                Comparator.comparingInt(City::getPopulation)
            ).get()
        );
    
        





       /*

        City capitalHigh = countries.entrySet().stream() 
       .map(entry -> entry.getValue().getCapital()) 
       .filter(Objects::nonNull) 
       .max(Comparator.comparingInt(City::getPopulation)) 
       .orElse(null);
        */
       
        

       

    



    }

}