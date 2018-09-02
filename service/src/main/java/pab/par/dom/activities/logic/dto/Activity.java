package pab.par.dom.activities.logic.dto;

import com.google.gson.annotations.SerializedName;

/**
 * Class to manage activities
 */
public class Activity {

    private String name = null;

    @SerializedName("opening_hours")
    private OpeningHours openingHours = null;

    @SerializedName("hours_spent")
    private Float hoursSpent = null;

    private String category = null;

    private String location = null;

    private String district = null;

    private Point latlng = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OpeningHours getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(OpeningHours openingHours) {
        this.openingHours = openingHours;
    }

    public Float getHoursSpent() {
        return hoursSpent;
    }

    public void setHoursSpent(Float hoursSpent) {
        this.hoursSpent = hoursSpent;
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

    public Point getLatlng() {
        return latlng;
    }

    public void setLatlng(Point latlng) {
        this.latlng = latlng;
    }
}
