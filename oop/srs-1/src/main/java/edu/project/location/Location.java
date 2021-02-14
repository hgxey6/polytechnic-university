package edu.project.location;

/*
 * The company only hires employees from Europe, Asia and North America.
 * Countries are also fixed.
 */
public class Location {

    private Continent continent;
    private Country country;
    private String city;

    public Location() {
    }

    public Location(Continent continent, Country country, String city) {
        this.continent = continent;
        this.country = country;
        this.city = city;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Location{" +
                "continent=" + continent +
                ", country=" + country +
                ", city='" + city + '\'' +
                '}';
    }
}
