package pab.par.dom.activities.logic.dto;

public class SearchCriteria {

    private String city;

    private String category;

    private String location;

    private String district;

    public SearchCriteria(String city, String category, String location, String district) {
        this.city = city;
        this.category = category;
        this.location = location;
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
