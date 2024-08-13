/*
 * Locationforecast
 * Weather forecast for a specified place
 *
 * The version of the OpenAPI document: 2.0
 * Contact: weatherapi-adm@met.no
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.spond.data.web.metno.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

/**
 * Forecast
 */
@JsonPropertyOrder({
  Forecast.JSON_PROPERTY_META,
  Forecast.JSON_PROPERTY_TIMESERIES
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-09T15:59:38.720538+02:00[Europe/Oslo]")
public class Forecast {
  public static final String JSON_PROPERTY_META = "meta";
  private ForecastMeta meta;

  public static final String JSON_PROPERTY_TIMESERIES = "timeseries";
  private List<ForecastTimeStep> timeseries = new ArrayList<ForecastTimeStep>();


  public Forecast meta(ForecastMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ForecastMeta getMeta() {
    return meta;
  }


  public void setMeta(ForecastMeta meta) {
    this.meta = meta;
  }


  public Forecast timeseries(List<ForecastTimeStep> timeseries) {
    
    this.timeseries = timeseries;
    return this;
  }

  public Forecast addTimeseriesItem(ForecastTimeStep timeseriesItem) {
    this.timeseries.add(timeseriesItem);
    return this;
  }

   /**
   * Get timeseries
   * @return timeseries
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TIMESERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ForecastTimeStep> getTimeseries() {
    return timeseries;
  }


  public void setTimeseries(List<ForecastTimeStep> timeseries) {
    this.timeseries = timeseries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Forecast forecast = (Forecast) o;
    return Objects.equals(this.meta, forecast.meta) &&
        Objects.equals(this.timeseries, forecast.timeseries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, timeseries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Forecast {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    timeseries: ").append(toIndentedString(timeseries)).append("\n");
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

