package vehicles;

public class �oordinates {
	private double latitude;
	private double longitude;
		
	public �oordinates(double latitude, double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "�oordinates [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
	
}
