class City {
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;

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
        this.foundation = "";
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
