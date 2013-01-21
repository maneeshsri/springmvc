/**
 * 
 */
package com.maneeshsri.sample.home;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
/**
 * @author maneeshkumar
 * 
 */

@Service
public class HomeService {

	private RestTemplate restClient = new RestTemplate();

	@Value("${app.apiKey}")
	private String apiKey;
	

	@Value("${app.restUrl}")
	private String restUrl;
	
	

	
	public DisplayData getWeatherData(String zipCode) {
		String url = restUrl+apiKey+"/conditions/q/" + zipCode + ".json";
	
		WeatherResponse response = restClient.getForObject(url, WeatherResponse.class);
		return response.getCurrentObservation();
	}

}
