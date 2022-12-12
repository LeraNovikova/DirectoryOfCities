public class City {
    static class City1{
        private String name;
        private String region;
        private String district;
        private int population;
        private String foundation = "";

        City1(String name, String region, String district, int population, String foundation) {
            this.name = name;
            this.region = region;
            this.district = district;
            this.population = population;
            this.foundation = foundation;
        }

        City1(String name, String region, String district, int population) {
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
