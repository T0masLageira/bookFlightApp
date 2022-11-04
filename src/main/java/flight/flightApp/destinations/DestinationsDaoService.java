package flight.flightApp.destinations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DestinationsDaoService {

	private static List<Destinations> destinations = new ArrayList<>();
	private static List<Reservation> reserves = new ArrayList<>();

	private static int destCount = 0;

	// Create destinations
	static {
		destinations.add(new Destinations(++destCount, "Portugal", 0, 1));
		destinations.add(new Destinations(++destCount, "Spain", 300, 1));
		destinations.add(new Destinations(++destCount, "France", 400, 1));
		destinations.add(new Destinations(++destCount, "Italy", 500, 1));
		destinations.add(new Destinations(++destCount, "Germany", 600, 1));
	}

	// Find all destinations

	public List<Destinations> findAll() {
		return destinations;
	}

	// Find 1 destination

	public Destinations findDestination(int id) {
		return destinations.get(id - 1);
	}

	// Find all reservations
	public List<Reservation> findAllReservations() {
		return reserves;
	}

	// Create reserve
	public Reservation createReserve(Reservation reserve) {
		reserves.add(reserve);
		return (reserve);
	}

}
