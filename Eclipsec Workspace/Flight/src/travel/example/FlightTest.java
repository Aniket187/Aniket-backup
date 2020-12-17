package travel.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FlightTest {
	Flight f;
	List<Flight> li = new ArrayList<Flight>();

	public void readValidate(Scanner sc2) {
		int num = 0;
		do {
			System.out.println("Enter number of flights to make entry ");
			num = sc2.nextInt();
		} while (num == 0);
		for (int i = 1; i < num + 1; i++) {
			int temp = 0;
			f = new Flight();
			System.out.println("Enter flight " + i + " details");
			f.setNumberofFlight(i);
			;
			System.out.println("Enter Departure city");
			f.setDepartureCity(sc2.next());
			sc2.nextLine();
			do {
				try {
					System.out.println("Enter the flight distance ");
					temp = sc2.nextInt();
					f.setDistance(temp);
				} catch (InputMismatchException e) {
					System.err.println("Enter in number format");
				}
				sc2.nextLine();
			} while (temp <= 0);
			do {
				try {
					System.out.println("Enter Fligth Number  ");
					temp = 0;
					temp = sc2.nextInt();
					if (temp < 1111 || temp > 9999) {
						System.err.println(("Please Enter Flight Number Between 1111 to 9999 "));
					}
					f.setFlightNumber(temp);
				} catch (InputMismatchException e) {
					System.err.println("Enter number");
				}
				sc2.nextLine();
			} while (temp < 1111 || temp > 9999);

			do {
				try {
					System.out.println("Enter the Prize of the Flight");
					temp = sc2.nextInt();
					if (temp < 9 || temp > 900) {
						System.err.println("Please enter Ticket Price bewteen 9$ to 900$");
					}

					f.setPrice(temp);
				} catch (InputMismatchException e) {
					System.err.println("Enter number for price");
				}
				sc2.nextLine();
			} while (temp < 9 || temp > 900);
			li.add(f);

		}

	}

	public void findAllflight(List<Flight> l) {
		System.out.println("All FLights ");
		System.out.println("FlightNumber |FilghtDistance |DepartureCity |Price|DiscountedPrice");
		for (Flight rs : l) {
			System.out.println(rs.getFlightNumber() + "  		 " + rs.getDistance() + "  		 "
					+ rs.getDepartureCity() + "   " + rs.getPrice()+ " 	" + rs.getDiscountedPrice());
		}

	}

	public void dicountPrice(List<Flight> l, double discount) {
		System.out.println("----Discounted price--");
		double temp = discount / 100;
		for (Flight rs : l) {
			rs.setDiscountedPrice(rs.getPrice() - (rs.getPrice() * temp));
		}
		System.out.println("FlightNumber |FilghtDistance |DepartureCity |DiscountedPrice");
		for (Flight rs : l) {
			System.out.println(rs.getFlightNumber() + "  		 " + rs.getDistance() + "  		 "
					+ rs.getDepartureCity() + "   " + rs.getDiscountedPrice());
		}

	}

	public void findFligthbynumber(int number, List<Flight> l) {
		boolean flag = false;
		System.out.println("Find Flight by number");
		for (Flight rs : l) {
			if (rs.getFlightNumber() == number) {
				System.out.println(rs);
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("There is no flight of this number");
		}

	}

	public void sortByprice(List<Flight> l) {

		for (int i = 0; i < l.size(); i++) {
			for (int j = i + 1; j < l.size(); j++) {
				if (l.get(i).getPrice() > l.get(j).getPrice()) {
					Collections.swap(l, i, j);
				}
			}
		}
		System.out.println("Sorting by Price");
		System.out.println("FlightNumber |FilghtDistance |DepartureCity |Price|DiscountedPrice");
		for (Flight rs : l) {
			System.out.println(rs.getFlightNumber() + "  		 " + rs.getDistance() + "  		 "
					+ rs.getDepartureCity() + "   " + rs.getPrice()+ " 	" + rs.getDiscountedPrice());
		}
	}

	public static void main(String[] args) {
		FlightTest test = new FlightTest();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("--------Welcome to Flight Attendance App---------");
		System.out.println("Enter the number for following operation");
		do {
			System.out.println("------------------------------");
			System.out.println("1. To add Flight details \n" + "2. To Find All Flight \n"
					+ "3. To find Flight by Flightnumber \n" + "4. To Sort Flight As per Price \n"
					+ "5. To Sort As per Departure City \n" + "6. To displayed Discounted Price \n" + "7. Exist  \n");
			int operation = sc.nextInt();
			switch (operation) {
			case 1: {
				count++;
				test.readValidate(sc);
				break;
			}
			case 2: {
				count++;
				if (!test.li.isEmpty()) {
					test.findAllflight(test.li);
				} else {
					System.out.println("No flights found first add Flights");
				}
				break;
			}
			case 3: {
				count++;
				if (!test.li.isEmpty()) {
					System.out.println("Enter the flight number");
					int temp = sc.nextInt();
					test.findFligthbynumber(temp, test.li);
				} else {
					System.out.println("No flights found first add Flights");
				}
				break;
			}
			case 4: {
				count++;
				if (!test.li.isEmpty()) {
					test.sortByprice(test.li);
				} else {
					System.out.println("No flights found first add Flights");
				}
				break;
			}
			case 5: {
				count++;
				if (!test.li.isEmpty()) {
					Collections.sort(test.li, Flight.departureNameComparator);
					System.out.println("FlightNumber |FilghtDistance |DepartureCity |Price |Discounted price");
					for (Flight rs : test.li) {
						System.out.println(rs.getFlightNumber() + "  		 " + rs.getDistance() + "  		 "
								+ rs.getDepartureCity() + "   " + rs.getPrice() + " 	" + rs.getDiscountedPrice());
					}
				} else {
					System.out.println("No flights found first add Flights");
				}
				break;
			}
			case 6: {
				count++;
				if (!test.li.isEmpty()) {
					double discount = 20;
					test.dicountPrice(test.li, discount);

				} else {
					System.out.println("No flights found first add Flights");
				}
				break;
			}
			case 7: {
				count = 0;
				System.out.println("Thank you for using our app");
				break;
			}
			}
		} while (count > 0);
		sc.close();
	}

}
