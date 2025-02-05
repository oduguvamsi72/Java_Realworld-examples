package javaproject;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class Flight {
	String airline;
	String departure;
	String arrival;
	String departureTime;
	String arrivalTime;

	Flight(String airline, String departure, String arrival, String departureTime, String arrivalTime) {
		this.airline = airline;
		this.departure = departure;
		this.arrival = arrival;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}

	void displayFlightDetails() {
		System.out.println("Airline: " + airline);
		System.out.println("Departure: " + departure);
		System.out.println("Arrival: " + arrival);
		System.out.println("Departure Time: " + departureTime);
		System.out.println("Arrival Time: " + arrivalTime);
		System.out.println("======================================");
	}
}

class InternationalFlight extends Flight {
	InternationalFlight(String airline, String departure, String arrival, ZonedDateTime departureTime) {
		super(airline, departure, arrival, 
			departureTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")), 
			departureTime.plusHours(5).format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
	}
}

public class FlightsTimeZone {
	public static void main(String[] args) {
		ZonedDateTime now = ZonedDateTime.now();

		InternationalFlight f1 = new InternationalFlight("Emirates", "Dubai", "New York", now);
		InternationalFlight f2 = new InternationalFlight("Qatar Airways", "Doha", "London", now);
		InternationalFlight f3 = new InternationalFlight("Singapore Airlines", "Singapore", "Tokyo", now);
		InternationalFlight f4 = new InternationalFlight("British Airways", "London", "Los Angeles", now);
		InternationalFlight f5 = new InternationalFlight("Lufthansa", "Frankfurt", "Sydney", now);
		InternationalFlight f6 = new InternationalFlight("Air India", "Delhi", "Toronto", now);
		InternationalFlight f7 = new InternationalFlight("Turkish Airlines", "Istanbul", "Bangkok", now);

		f1.displayFlightDetails();
		f2.displayFlightDetails();
		f3.displayFlightDetails();
		f4.displayFlightDetails();
		f5.displayFlightDetails();
		f6.displayFlightDetails();
		f7.displayFlightDetails();
	}
}
