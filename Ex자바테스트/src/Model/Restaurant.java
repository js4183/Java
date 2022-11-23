package Model;

public class Restaurant extends Store {

	public double service;
	public double flavor;
	public double clean;
	public double reAvg;

	public Restaurant(String name, String event, double price, double service, double flavor, double clean) {
		super(name, event, price);
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
	}

	public double getService() {
		return service;
	}

	public void setService(double service) {
		this.service = service;
	}

	public double getFlavor() {
		return flavor;
	}

	public void setFlavor(double flavor) {
		this.flavor = flavor;
	}

	public double getClean() {
		return clean;
	}

	public void setClean(double clean) {
		this.clean = clean;
	}

	// grade() 상속

}
