import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        InMemoryWorldDao worldDao = InMemoryWorldDao.getInstance();

        Map<String, Country> countries = worldDao.getCountries();
        Set<String> continents = worldDao.getAllContinents();

        List<City> highestPopulatedCitiesByContinent = continents.stream()
            .map(continent -> countries.values().stream()
                .filter(country -> continent.equals(country.getContinent()))
                .flatMap(country -> country.getCities().stream())
                //[[a,b,c],[d,v,c],[r,t,y]]>>[a,b,c,d,v,c,r,t,y]
                .max(Comparator.comparingInt(City::getPopulation))
                .orElse(null))
            .filter(Objects::nonNull)
            .toList();

            List<String> list = new ArrayList<>(continents);
            int cout = 0;
            
            for (City city : highestPopulatedCitiesByContinent) {
                System.out.print(list.get(cout)+" - ");
                System.out.println(city.getName() + " - Population: " + city.getPopulation());
                cout++;
            }
            

    }
}
