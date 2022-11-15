package me.whiteship.refactoring._22_data_class._42_encapsulate_record;

//변하는 객체인 경우 사용
public class Organization {

    private String name;

    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
