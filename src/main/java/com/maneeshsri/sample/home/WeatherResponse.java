/**
 * 
 */
package com.maneeshsri.sample.home;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author maneesh.kumar
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true) 
public class WeatherResponse {
	
	
	
	@JsonProperty("current_observation")
	private DisplayData currentObservation;
	
	
	@JsonProperty("temperature_string")
	private String temperature;
	
	

	public DisplayData getCurrentObservation() {
		return currentObservation;
	}

	public void setCurrentObservation(DisplayData currentObservation) {
		this.currentObservation = currentObservation;
	}
	
	/**
	 * @return the temparature
	 */
	public String getTemperature() {
		return temperature;
	}

	/**
	 * @param temparature the temparature to set
	 */
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	
	

}
