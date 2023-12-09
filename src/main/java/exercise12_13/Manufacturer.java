package exercise12_13;

import java.util.Objects;

public class Manufacturer {
    private String name;
    private Integer yearOfEstablishment;
    private String country;

    public Manufacturer(){}

    public Manufacturer(String name, Integer yearOfEstablishment, String country) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }


    @Override
    public boolean equals(Object obj){
        if (obj==null || getClass() != obj.getClass())
            return false;
        if (this==obj)
            return true;
        Manufacturer manufacturer=(Manufacturer) obj;
        return (this.getName()==manufacturer.getName());
    }


    public int hashCode(){
        return Objects.hash(yearOfEstablishment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearofestablishment() {
        return yearOfEstablishment;
    }

    public void setYearofestablishment(Integer yearofestablishment) {
        this.yearOfEstablishment = yearofestablishment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
