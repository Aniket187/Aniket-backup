package beans;

public class Address {

	String streetName;
	String city;
	int pincode;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", pincode=" + pincode +"]";
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
}
