package bean;

public class User {
	public String name;
	public String city;
	public String country;

	public User() {

	}

	public User(String name, String city, String country) {
		super();
		this.name = name;
		this.city = city;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", city=" + city + ", country=" + country + "]";
	}

}
