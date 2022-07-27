package co.grandcircus.weatherlab;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentObservation {
	private String name;
	
	@JsonProperty("Winds")
	private String winds;
	
	@JsonProperty("Gust")
	private int gust;
	
	@JsonProperty("Visibility")
	private double visibility;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWinds() {
		return winds;
	}

	public void setWinds(String winds) {
		this.winds = winds;
	}

	public int getGust() {
		return gust;
	}

	public void setGust(int gust) {
		this.gust = gust;
	}

	public double getVisibility() {
		return visibility;
	}

	public void setVisibility(double visibility) {
		this.visibility = visibility;
	}
	
}
