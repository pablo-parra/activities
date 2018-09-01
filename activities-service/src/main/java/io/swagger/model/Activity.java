package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OpeningHours;
import io.swagger.model.Point;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Activity
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-31T16:22:32.898Z")

public class Activity   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("opening_hours")
  private OpeningHours openingHours = null;

  @JsonProperty("hours_spent")
  private Float hoursSpent = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("district")
  private String district = null;

  @JsonProperty("latlng")
  private Point latlng = null;

  public Activity name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Activity openingHours(OpeningHours openingHours) {
    this.openingHours = openingHours;
    return this;
  }

  /**
   * Get openingHours
   * @return openingHours
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OpeningHours getOpeningHours() {
    return openingHours;
  }

  public void setOpeningHours(OpeningHours openingHours) {
    this.openingHours = openingHours;
  }

  public Activity hoursSpent(Float hoursSpent) {
    this.hoursSpent = hoursSpent;
    return this;
  }

  /**
   * Get hoursSpent
   * @return hoursSpent
  **/
  @ApiModelProperty(value = "")


  public Float getHoursSpent() {
    return hoursSpent;
  }

  public void setHoursSpent(Float hoursSpent) {
    this.hoursSpent = hoursSpent;
  }

  public Activity category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Activity location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Activity district(String district) {
    this.district = district;
    return this;
  }

  /**
   * Get district
   * @return district
  **/
  @ApiModelProperty(value = "")


  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public Activity latlng(Point latlng) {
    this.latlng = latlng;
    return this;
  }

  /**
   * Get latlng
   * @return latlng
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Point getLatlng() {
    return latlng;
  }

  public void setLatlng(Point latlng) {
    this.latlng = latlng;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activity activity = (Activity) o;
    return Objects.equals(this.name, activity.name) &&
        Objects.equals(this.openingHours, activity.openingHours) &&
        Objects.equals(this.hoursSpent, activity.hoursSpent) &&
        Objects.equals(this.category, activity.category) &&
        Objects.equals(this.location, activity.location) &&
        Objects.equals(this.district, activity.district) &&
        Objects.equals(this.latlng, activity.latlng);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, openingHours, hoursSpent, category, location, district, latlng);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openingHours: ").append(toIndentedString(openingHours)).append("\n");
    sb.append("    hoursSpent: ").append(toIndentedString(hoursSpent)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    latlng: ").append(toIndentedString(latlng)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

