package inher_5;

public class Country {
    private String countryName;
    private String continent;

    public Country(String name, String continent) {
        this.countryName = name;
        this.continent = continent;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
