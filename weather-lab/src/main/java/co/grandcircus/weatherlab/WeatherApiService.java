package co.grandcircus.weatherlab;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherApiService {

	private static RestTemplate request = new RestTemplate();
	
	String url = "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";
	
	public String getAreaDescription() {
		Location response = request.getForObject(url, WeatherResponse.class).getLocation();
		
		return response.getAreaDescription();
	}
	
	public int getGust() {
		int gust = request.getForObject(url, WeatherResponse.class).getCurrentobservation().getGust();
		return gust;
	}
	
	public String getWinds() {
		String winds = request.getForObject(url, WeatherResponse.class).getCurrentobservation().getWinds();
		return winds;
	}
	
	
	
	
}
