package br.com.weathercheck.models;

/**
 * The class represents the geographical coordinates object. 
 * 
 * @author Pamela Inacio Almeida
 */
public class GeographicalCoordinates {
	
	private String longitude;
	private String latitude;
	
	public String getLongitude() {
		return longitude;
	}
	
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	public String getLatitude() {
		return latitude;
	}
	
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

}
