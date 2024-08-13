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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

/**
 * Weather parameters valid for a specific point in time.
 */
@ApiModel(description = "Weather parameters valid for a specific point in time.")
@JsonPropertyOrder({
  ForecastTimeInstant.JSON_PROPERTY_AIR_PRESSURE_AT_SEA_LEVEL,
  ForecastTimeInstant.JSON_PROPERTY_AIR_TEMPERATURE,
  ForecastTimeInstant.JSON_PROPERTY_CLOUD_AREA_FRACTION,
  ForecastTimeInstant.JSON_PROPERTY_CLOUD_AREA_FRACTION_HIGH,
  ForecastTimeInstant.JSON_PROPERTY_CLOUD_AREA_FRACTION_LOW,
  ForecastTimeInstant.JSON_PROPERTY_CLOUD_AREA_FRACTION_MEDIUM,
  ForecastTimeInstant.JSON_PROPERTY_DEW_POINT_TEMPERATURE,
  ForecastTimeInstant.JSON_PROPERTY_FOG_AREA_FRACTION,
  ForecastTimeInstant.JSON_PROPERTY_RELATIVE_HUMIDITY,
  ForecastTimeInstant.JSON_PROPERTY_WIND_FROM_DIRECTION,
  ForecastTimeInstant.JSON_PROPERTY_WIND_SPEED,
  ForecastTimeInstant.JSON_PROPERTY_WIND_SPEED_OF_GUST
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-09T15:59:38.720538+02:00[Europe/Oslo]")
public class ForecastTimeInstant {
  public static final String JSON_PROPERTY_AIR_PRESSURE_AT_SEA_LEVEL = "air_pressure_at_sea_level";
  private BigDecimal airPressureAtSeaLevel;

  public static final String JSON_PROPERTY_AIR_TEMPERATURE = "air_temperature";
  private BigDecimal airTemperature;

  public static final String JSON_PROPERTY_CLOUD_AREA_FRACTION = "cloud_area_fraction";
  private BigDecimal cloudAreaFraction;

  public static final String JSON_PROPERTY_CLOUD_AREA_FRACTION_HIGH = "cloud_area_fraction_high";
  private BigDecimal cloudAreaFractionHigh;

  public static final String JSON_PROPERTY_CLOUD_AREA_FRACTION_LOW = "cloud_area_fraction_low";
  private BigDecimal cloudAreaFractionLow;

  public static final String JSON_PROPERTY_CLOUD_AREA_FRACTION_MEDIUM = "cloud_area_fraction_medium";
  private BigDecimal cloudAreaFractionMedium;

  public static final String JSON_PROPERTY_DEW_POINT_TEMPERATURE = "dew_point_temperature";
  private BigDecimal dewPointTemperature;

  public static final String JSON_PROPERTY_FOG_AREA_FRACTION = "fog_area_fraction";
  private BigDecimal fogAreaFraction;

  public static final String JSON_PROPERTY_RELATIVE_HUMIDITY = "relative_humidity";
  private BigDecimal relativeHumidity;

  public static final String JSON_PROPERTY_WIND_FROM_DIRECTION = "wind_from_direction";
  private BigDecimal windFromDirection;

  public static final String JSON_PROPERTY_WIND_SPEED = "wind_speed";
  private BigDecimal windSpeed;

  public static final String JSON_PROPERTY_WIND_SPEED_OF_GUST = "wind_speed_of_gust";
  private BigDecimal windSpeedOfGust;


  public ForecastTimeInstant airPressureAtSeaLevel(BigDecimal airPressureAtSeaLevel) {
    
    this.airPressureAtSeaLevel = airPressureAtSeaLevel;
    return this;
  }

   /**
   * Air pressure at sea level
   * @return airPressureAtSeaLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1017.23", value = "Air pressure at sea level")
  @JsonProperty(JSON_PROPERTY_AIR_PRESSURE_AT_SEA_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAirPressureAtSeaLevel() {
    return airPressureAtSeaLevel;
  }


  public void setAirPressureAtSeaLevel(BigDecimal airPressureAtSeaLevel) {
    this.airPressureAtSeaLevel = airPressureAtSeaLevel;
  }


  public ForecastTimeInstant airTemperature(BigDecimal airTemperature) {
    
    this.airTemperature = airTemperature;
    return this;
  }

   /**
   * Air temperature
   * @return airTemperature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "17.1", value = "Air temperature")
  @JsonProperty(JSON_PROPERTY_AIR_TEMPERATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAirTemperature() {
    return airTemperature;
  }


  public void setAirTemperature(BigDecimal airTemperature) {
    this.airTemperature = airTemperature;
  }


  public ForecastTimeInstant cloudAreaFraction(BigDecimal cloudAreaFraction) {
    
    this.cloudAreaFraction = cloudAreaFraction;
    return this;
  }

   /**
   * Amount of sky covered by clouds.
   * @return cloudAreaFraction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "95.2", value = "Amount of sky covered by clouds.")
  @JsonProperty(JSON_PROPERTY_CLOUD_AREA_FRACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCloudAreaFraction() {
    return cloudAreaFraction;
  }


  public void setCloudAreaFraction(BigDecimal cloudAreaFraction) {
    this.cloudAreaFraction = cloudAreaFraction;
  }


  public ForecastTimeInstant cloudAreaFractionHigh(BigDecimal cloudAreaFractionHigh) {
    
    this.cloudAreaFractionHigh = cloudAreaFractionHigh;
    return this;
  }

   /**
   * Amount of sky covered by clouds at high elevation.
   * @return cloudAreaFractionHigh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "95.2", value = "Amount of sky covered by clouds at high elevation.")
  @JsonProperty(JSON_PROPERTY_CLOUD_AREA_FRACTION_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCloudAreaFractionHigh() {
    return cloudAreaFractionHigh;
  }


  public void setCloudAreaFractionHigh(BigDecimal cloudAreaFractionHigh) {
    this.cloudAreaFractionHigh = cloudAreaFractionHigh;
  }


  public ForecastTimeInstant cloudAreaFractionLow(BigDecimal cloudAreaFractionLow) {
    
    this.cloudAreaFractionLow = cloudAreaFractionLow;
    return this;
  }

   /**
   * Amount of sky covered by clouds at low elevation.
   * @return cloudAreaFractionLow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "95.2", value = "Amount of sky covered by clouds at low elevation.")
  @JsonProperty(JSON_PROPERTY_CLOUD_AREA_FRACTION_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCloudAreaFractionLow() {
    return cloudAreaFractionLow;
  }


  public void setCloudAreaFractionLow(BigDecimal cloudAreaFractionLow) {
    this.cloudAreaFractionLow = cloudAreaFractionLow;
  }


  public ForecastTimeInstant cloudAreaFractionMedium(BigDecimal cloudAreaFractionMedium) {
    
    this.cloudAreaFractionMedium = cloudAreaFractionMedium;
    return this;
  }

   /**
   * Amount of sky covered by clouds at medium elevation.
   * @return cloudAreaFractionMedium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "95.2", value = "Amount of sky covered by clouds at medium elevation.")
  @JsonProperty(JSON_PROPERTY_CLOUD_AREA_FRACTION_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCloudAreaFractionMedium() {
    return cloudAreaFractionMedium;
  }


  public void setCloudAreaFractionMedium(BigDecimal cloudAreaFractionMedium) {
    this.cloudAreaFractionMedium = cloudAreaFractionMedium;
  }


  public ForecastTimeInstant dewPointTemperature(BigDecimal dewPointTemperature) {
    
    this.dewPointTemperature = dewPointTemperature;
    return this;
  }

   /**
   * Dew point temperature at sea level
   * @return dewPointTemperature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8.1", value = "Dew point temperature at sea level")
  @JsonProperty(JSON_PROPERTY_DEW_POINT_TEMPERATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDewPointTemperature() {
    return dewPointTemperature;
  }


  public void setDewPointTemperature(BigDecimal dewPointTemperature) {
    this.dewPointTemperature = dewPointTemperature;
  }


  public ForecastTimeInstant fogAreaFraction(BigDecimal fogAreaFraction) {
    
    this.fogAreaFraction = fogAreaFraction;
    return this;
  }

   /**
   * Amount of area covered by fog.
   * @return fogAreaFraction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "95.2", value = "Amount of area covered by fog.")
  @JsonProperty(JSON_PROPERTY_FOG_AREA_FRACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFogAreaFraction() {
    return fogAreaFraction;
  }


  public void setFogAreaFraction(BigDecimal fogAreaFraction) {
    this.fogAreaFraction = fogAreaFraction;
  }


  public ForecastTimeInstant relativeHumidity(BigDecimal relativeHumidity) {
    
    this.relativeHumidity = relativeHumidity;
    return this;
  }

   /**
   * Amount of humidity in the air.
   * @return relativeHumidity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "81.1", value = "Amount of humidity in the air.")
  @JsonProperty(JSON_PROPERTY_RELATIVE_HUMIDITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRelativeHumidity() {
    return relativeHumidity;
  }


  public void setRelativeHumidity(BigDecimal relativeHumidity) {
    this.relativeHumidity = relativeHumidity;
  }


  public ForecastTimeInstant windFromDirection(BigDecimal windFromDirection) {
    
    this.windFromDirection = windFromDirection;
    return this;
  }

   /**
   * The direction wind is coming from, in degrees clockwise from North
   * @return windFromDirection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "121.3", value = "The direction wind is coming from, in degrees clockwise from North")
  @JsonProperty(JSON_PROPERTY_WIND_FROM_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWindFromDirection() {
    return windFromDirection;
  }


  public void setWindFromDirection(BigDecimal windFromDirection) {
    this.windFromDirection = windFromDirection;
  }


  public ForecastTimeInstant windSpeed(BigDecimal windSpeed) {
    
    this.windSpeed = windSpeed;
    return this;
  }

   /**
   * Speed of wind
   * @return windSpeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5.9", value = "Speed of wind")
  @JsonProperty(JSON_PROPERTY_WIND_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWindSpeed() {
    return windSpeed;
  }


  public void setWindSpeed(BigDecimal windSpeed) {
    this.windSpeed = windSpeed;
  }


  public ForecastTimeInstant windSpeedOfGust(BigDecimal windSpeedOfGust) {
    
    this.windSpeedOfGust = windSpeedOfGust;
    return this;
  }

   /**
   * Speed of wind gust
   * @return windSpeedOfGust
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15.9", value = "Speed of wind gust")
  @JsonProperty(JSON_PROPERTY_WIND_SPEED_OF_GUST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWindSpeedOfGust() {
    return windSpeedOfGust;
  }


  public void setWindSpeedOfGust(BigDecimal windSpeedOfGust) {
    this.windSpeedOfGust = windSpeedOfGust;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastTimeInstant forecastTimeInstant = (ForecastTimeInstant) o;
    return Objects.equals(this.airPressureAtSeaLevel, forecastTimeInstant.airPressureAtSeaLevel) &&
        Objects.equals(this.airTemperature, forecastTimeInstant.airTemperature) &&
        Objects.equals(this.cloudAreaFraction, forecastTimeInstant.cloudAreaFraction) &&
        Objects.equals(this.cloudAreaFractionHigh, forecastTimeInstant.cloudAreaFractionHigh) &&
        Objects.equals(this.cloudAreaFractionLow, forecastTimeInstant.cloudAreaFractionLow) &&
        Objects.equals(this.cloudAreaFractionMedium, forecastTimeInstant.cloudAreaFractionMedium) &&
        Objects.equals(this.dewPointTemperature, forecastTimeInstant.dewPointTemperature) &&
        Objects.equals(this.fogAreaFraction, forecastTimeInstant.fogAreaFraction) &&
        Objects.equals(this.relativeHumidity, forecastTimeInstant.relativeHumidity) &&
        Objects.equals(this.windFromDirection, forecastTimeInstant.windFromDirection) &&
        Objects.equals(this.windSpeed, forecastTimeInstant.windSpeed) &&
        Objects.equals(this.windSpeedOfGust, forecastTimeInstant.windSpeedOfGust);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airPressureAtSeaLevel, airTemperature, cloudAreaFraction, cloudAreaFractionHigh, cloudAreaFractionLow, cloudAreaFractionMedium, dewPointTemperature, fogAreaFraction, relativeHumidity, windFromDirection, windSpeed, windSpeedOfGust);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastTimeInstant {\n");
    sb.append("    airPressureAtSeaLevel: ").append(toIndentedString(airPressureAtSeaLevel)).append("\n");
    sb.append("    airTemperature: ").append(toIndentedString(airTemperature)).append("\n");
    sb.append("    cloudAreaFraction: ").append(toIndentedString(cloudAreaFraction)).append("\n");
    sb.append("    cloudAreaFractionHigh: ").append(toIndentedString(cloudAreaFractionHigh)).append("\n");
    sb.append("    cloudAreaFractionLow: ").append(toIndentedString(cloudAreaFractionLow)).append("\n");
    sb.append("    cloudAreaFractionMedium: ").append(toIndentedString(cloudAreaFractionMedium)).append("\n");
    sb.append("    dewPointTemperature: ").append(toIndentedString(dewPointTemperature)).append("\n");
    sb.append("    fogAreaFraction: ").append(toIndentedString(fogAreaFraction)).append("\n");
    sb.append("    relativeHumidity: ").append(toIndentedString(relativeHumidity)).append("\n");
    sb.append("    windFromDirection: ").append(toIndentedString(windFromDirection)).append("\n");
    sb.append("    windSpeed: ").append(toIndentedString(windSpeed)).append("\n");
    sb.append("    windSpeedOfGust: ").append(toIndentedString(windSpeedOfGust)).append("\n");
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
