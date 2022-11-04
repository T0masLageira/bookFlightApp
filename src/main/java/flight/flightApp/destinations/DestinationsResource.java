package flight.flightApp.destinations;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class DestinationsResource {

	private DestinationsDaoService service;

	public DestinationsResource(DestinationsDaoService service) {
		this.service = service;
	}
	
	@GetMapping("/destinations")
	public List<Destinations> retrieveAllDestinations() {
		return service.findAll();
	}
	
	@GetMapping("/destinations/{id}")
	public Destinations retrieveDestination(@PathVariable int id) {
		Destinations destination = service.findDestination(id);
		return destination;
	}
	
	@GetMapping("/reservations")
	public List<Reservation> retrieveAllReservations() {
		return service.findAllReservations();
	}
	
	@PostMapping("/reservations")
	public ResponseEntity<Reservation> makeReservation(@RequestBody Reservation reserve) {
		Reservation reservation = service.createReserve(reserve);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{origin}").buildAndExpand(reservation.getOrigin())
				.toUri();
		return ResponseEntity.created(location).build();
	}
	
}
