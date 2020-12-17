package travel.example;

import java.util.Comparator;

public class Flight {
private double price;
private int flightNumber;
private String departureCity;
private int distance;
private int numberofFlight;
private double discountedPrice;
public double getPrice() {
	return price;
}
public double getDiscountedPrice() {
	return discountedPrice;
}
public void setDiscountedPrice(double discountedPrice) {
	this.discountedPrice = discountedPrice;
}
public void setPrice(double price) {
	this.price = price;
}
public int getFlightNumber() {
	return flightNumber;
}
public void setFlightNumber(int flightNumber) {
	this.flightNumber = flightNumber;
}
public String getDepartureCity() {
	return departureCity;
}
public void setDepartureCity(String departureCity) {
	this.departureCity = departureCity;
}

public int getDistance() {
	return distance;
}
public void setDistance(int distance) {
	this.distance = distance;
}
public int getNumberofFlight() {
	return numberofFlight;
}
public void setNumberofFlight(int numberofFlight) {
	this.numberofFlight = numberofFlight;
}

@Override
public String toString() {
	return "Flight [numberofFlight=" + numberofFlight +",price=" + price + ", flightNumber=" + flightNumber + ", departureCity=" + departureCity
			+ ", distance=" + distance + "]";
}

public static Comparator<Flight> departureNameComparator = new Comparator<Flight>() {

	public int compare(Flight s1, Flight s2) {
	   String StudentName1 = s1.getDepartureCity().toUpperCase();
	   String StudentName2 = s2.getDepartureCity().toUpperCase();
	   return StudentName1.compareTo(StudentName2);

   }};
}
