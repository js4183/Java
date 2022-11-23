package Model;

public abstract class Store {
	
	public String name;
	public String event;
	public double price;

	
	
	public Store(String name, String event, double price) {
		super();
		this.name = name;
		this.event = event;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double grade() {
		return 0;
	}
	


}
