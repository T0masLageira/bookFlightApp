package flight.flightApp.destinations;

public class Reservation {

	private String origin,destination;
	private Integer price;
	public Reservation(String origin, String destination, Integer price) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.price = price;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Reservation [origin=" + origin + ", destination=" + destination + ", price=" + price + "]";
	}
	
	
	
	
}
