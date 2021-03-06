/*
 * PaymentNotification
 * to notify about  the SADAD API  payment to tahseel-plugin
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.killbill.billing.plugin.tahseel.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * PayorPOI
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-21T17:39:52.135Z")
public class PayorPOI extends HashMap<String, Object> {
  @SerializedName("POINum")
  private String poINum = null;

  /**
   * Gets or Sets poIType
   */
  @JsonAdapter(PoITypeEnum.Adapter.class)
  public enum PoITypeEnum {
    NAT("NAT"),
    
    IQA("IQA"),
    
    BIS("BIS"),
    
    PAS("PAS");

    private String value;

    PoITypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PoITypeEnum fromValue(String text) {
      for (PoITypeEnum b : PoITypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PoITypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PoITypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PoITypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PoITypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("POIType")
  private PoITypeEnum poIType = null;

  public PayorPOI poINum(String poINum) {
    this.poINum = poINum;
    return this;
  }

   /**
   * Get poINum
   * @return poINum
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPoINum() {
    return poINum;
  }

  public void setPoINum(String poINum) {
    this.poINum = poINum;
  }

  public PayorPOI poIType(PoITypeEnum poIType) {
    this.poIType = poIType;
    return this;
  }

   /**
   * Get poIType
   * @return poIType
  **/
  @ApiModelProperty(value = "")
  public PoITypeEnum getPoIType() {
    return poIType;
  }

  public void setPoIType(PoITypeEnum poIType) {
    this.poIType = poIType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayorPOI payorPOI = (PayorPOI) o;
    return Objects.equals(this.poINum, payorPOI.poINum) &&
        Objects.equals(this.poIType, payorPOI.poIType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poINum, poIType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayorPOI {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    poINum: ").append(toIndentedString(poINum)).append("\n");
    sb.append("    poIType: ").append(toIndentedString(poIType)).append("\n");
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

