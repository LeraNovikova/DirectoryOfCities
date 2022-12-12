import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception{
        InputStream ins = new FileInputStream("src/resources/city_ru.csv");
        Scanner obj = new Scanner(ins);

        List<City> cities = new ArrayList<>();
        while (obj.hasNextLine()) {
            String[] subStr;
            subStr = obj.nextLine().split(";");
            if(subStr.length==6) {
                cities.add(new City(subStr[1],subStr[2],subStr[3],Integer.valueOf(subStr[4]), subStr[5]));
            } else
                cities.add(new City(subStr[1], subStr[2], subStr[3], Integer.valueOf(subStr[4])));
        }

    }

    static class City{
        private String name;
        private String region;
        private String district;
        private int population;
        private String foundation = "";

        City(String name, String region, String district, int population, String foundation) {
            this.name = name;
            this.region = region;
            this.district = district;
            this.population = population;
            this.foundation = foundation;
        }

        City(String name, String region, String district, int population) {
            this.name = name;
            this.region = region;
            this.district = district;
            this.population = population;
        }

        public int getPopulation() {
            return population;
        }

        public String getDistrict() {
            return district;
        }

        public String getFoundation() {
            return foundation;
        }

        public String getName() {
            return name;
        }

        public String getRegion() {
            return region;
        }

    }
}

