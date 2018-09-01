package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpeningHours
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-31T16:22:32.898Z")

public class OpeningHours   {
  @JsonProperty("mo")
  @Valid
  private List<String> mo = null;

  @JsonProperty("tu")
  @Valid
  private List<String> tu = null;

  @JsonProperty("we")
  @Valid
  private List<String> we = null;

  @JsonProperty("th")
  @Valid
  private List<String> th = null;

  @JsonProperty("fr")
  @Valid
  private List<String> fr = null;

  @JsonProperty("sa")
  @Valid
  private List<String> sa = null;

  @JsonProperty("su")
  @Valid
  private List<String> su = null;

  public OpeningHours mo(List<String> mo) {
    this.mo = mo;
    return this;
  }

  public OpeningHours addMoItem(String moItem) {
    if (this.mo == null) {
      this.mo = new ArrayList<String>();
    }
    this.mo.add(moItem);
    return this;
  }

  /**
   * Get mo
   * @return mo
  **/
  @ApiModelProperty(value = "")


  public List<String> getMo() {
    return mo;
  }

  public void setMo(List<String> mo) {
    this.mo = mo;
  }

  public OpeningHours tu(List<String> tu) {
    this.tu = tu;
    return this;
  }

  public OpeningHours addTuItem(String tuItem) {
    if (this.tu == null) {
      this.tu = new ArrayList<String>();
    }
    this.tu.add(tuItem);
    return this;
  }

  /**
   * Get tu
   * @return tu
  **/
  @ApiModelProperty(value = "")


  public List<String> getTu() {
    return tu;
  }

  public void setTu(List<String> tu) {
    this.tu = tu;
  }

  public OpeningHours we(List<String> we) {
    this.we = we;
    return this;
  }

  public OpeningHours addWeItem(String weItem) {
    if (this.we == null) {
      this.we = new ArrayList<String>();
    }
    this.we.add(weItem);
    return this;
  }

  /**
   * Get we
   * @return we
  **/
  @ApiModelProperty(value = "")


  public List<String> getWe() {
    return we;
  }

  public void setWe(List<String> we) {
    this.we = we;
  }

  public OpeningHours th(List<String> th) {
    this.th = th;
    return this;
  }

  public OpeningHours addThItem(String thItem) {
    if (this.th == null) {
      this.th = new ArrayList<String>();
    }
    this.th.add(thItem);
    return this;
  }

  /**
   * Get th
   * @return th
  **/
  @ApiModelProperty(value = "")


  public List<String> getTh() {
    return th;
  }

  public void setTh(List<String> th) {
    this.th = th;
  }

  public OpeningHours fr(List<String> fr) {
    this.fr = fr;
    return this;
  }

  public OpeningHours addFrItem(String frItem) {
    if (this.fr == null) {
      this.fr = new ArrayList<String>();
    }
    this.fr.add(frItem);
    return this;
  }

  /**
   * Get fr
   * @return fr
  **/
  @ApiModelProperty(value = "")


  public List<String> getFr() {
    return fr;
  }

  public void setFr(List<String> fr) {
    this.fr = fr;
  }

  public OpeningHours sa(List<String> sa) {
    this.sa = sa;
    return this;
  }

  public OpeningHours addSaItem(String saItem) {
    if (this.sa == null) {
      this.sa = new ArrayList<String>();
    }
    this.sa.add(saItem);
    return this;
  }

  /**
   * Get sa
   * @return sa
  **/
  @ApiModelProperty(value = "")


  public List<String> getSa() {
    return sa;
  }

  public void setSa(List<String> sa) {
    this.sa = sa;
  }

  public OpeningHours su(List<String> su) {
    this.su = su;
    return this;
  }

  public OpeningHours addSuItem(String suItem) {
    if (this.su == null) {
      this.su = new ArrayList<String>();
    }
    this.su.add(suItem);
    return this;
  }

  /**
   * Get su
   * @return su
  **/
  @ApiModelProperty(value = "")


  public List<String> getSu() {
    return su;
  }

  public void setSu(List<String> su) {
    this.su = su;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpeningHours openingHours = (OpeningHours) o;
    return Objects.equals(this.mo, openingHours.mo) &&
        Objects.equals(this.tu, openingHours.tu) &&
        Objects.equals(this.we, openingHours.we) &&
        Objects.equals(this.th, openingHours.th) &&
        Objects.equals(this.fr, openingHours.fr) &&
        Objects.equals(this.sa, openingHours.sa) &&
        Objects.equals(this.su, openingHours.su);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mo, tu, we, th, fr, sa, su);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpeningHours {\n");
    
    sb.append("    mo: ").append(toIndentedString(mo)).append("\n");
    sb.append("    tu: ").append(toIndentedString(tu)).append("\n");
    sb.append("    we: ").append(toIndentedString(we)).append("\n");
    sb.append("    th: ").append(toIndentedString(th)).append("\n");
    sb.append("    fr: ").append(toIndentedString(fr)).append("\n");
    sb.append("    sa: ").append(toIndentedString(sa)).append("\n");
    sb.append("    su: ").append(toIndentedString(su)).append("\n");
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

