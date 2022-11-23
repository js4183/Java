package Model;

public class Salon extends Store {

	public double technology;
	public double kindness;

	public Salon(String name, String event, double price, double technology, double kindness) {
		super(name, event, price);
		this.technology = technology;
		this.kindness = kindness;
	}

	public double getTechnology() {
		return technology;
	}

	public void setTechnology(double technology) {
		this.technology = technology;
	}

	public double getKindness() {
		return kindness;
	}

	public void setKindness(double kindness) {
		this.kindness = kindness;
	}

}
