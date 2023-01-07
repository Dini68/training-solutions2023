package composition.person;

public class Address {

    private String country;
    private String city;
    private String zipCode;

    public Address(String country, String city, String zipCode) {
        this.country = country;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void correctData(String country, String city,
                            String zipCode) {
        this.country = country;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String addressToString() {
        return "Country: " + country +
                "\nCity: " + city +
                "\nzipCode: " + zipCode;
    }
}
