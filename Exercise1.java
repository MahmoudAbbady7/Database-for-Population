import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;




public class Exercise1 {

   public static void main(String[] args) {
     // CountryDao countryDao= InMemoryWorldDao.getInstance();
      //write your answer here
      //Find the highest populated city of each country

      InMemoryWorldDao worldDao = InMemoryWorldDao.getInstance();

        Map<String, Country> countries = worldDao.getCountries();
         
  List<City> highestPopulatedCities = countries.entrySet().stream()
            .map(entry -> entry.getValue().getCities().stream()
                .max(Comparator.comparingInt(City::getPopulation))
                .orElse(null))
            .filter(Objects::nonNull)
          .toList();

   highestPopulatedCities.forEach(city -> 
            System.out.println(city.getCountryCode()+":"+city.getName() + ": " + city.getPopulation())
        );
             


   }

}