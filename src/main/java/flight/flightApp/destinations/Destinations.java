package flight.flightApp.destinations;

public class Destinations {

	private Integer id,price,distance;
	private String name;
	
	public Destinations(Integer id, String name, Integer distance, Integer price) {
		super();
		this.id = id;
		this.price = price;
		this.distance = distance;
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Destinations [id=" + id + ", price=" + price + ", distance=" + distance + ", name=" + name + "]";
	}

}
