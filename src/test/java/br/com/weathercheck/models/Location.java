package br.com.weathercheck.models;

/**
 * This class represents a Location
 * @author Pamela Inacio Almeida
 */
public class Location {
	
	private String locationName;
	private int temperatureInCelsius;
	
	public String getLocationName() {
		return locationName;
	}
	
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	public int getTemperatureInCelsius() {
		return temperatureInCelsius;
	}
	
	public void setTemperatureInCelsius(int temperatureInCelsius) {
		this.temperatureInCelsius = temperatureInCelsius;
	}
	

}
