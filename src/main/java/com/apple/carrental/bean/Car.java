package com.apple.carrental.bean;

public class Car {
	String make;
	String model	;
	String vin;
	Perdayrent perdayrent;
	Metrics metrics;
	Metadata metadata;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public Perdayrent getPerdayrent() {
		return perdayrent;
	}

	public void setPerdayrent(Perdayrent perdayrent) {
		this.perdayrent = perdayrent;
	}

	public Metrics getMetrics() {
		return metrics;
	}

	public void setMetrics(Metrics metrics) {
		this.metrics = metrics;
	}

	public String sample() {
		return "apple";
	}
	
	public String toString() {
		StringBuilder out = new StringBuilder("Make: ").append(this.getMake()).append("\n")
				.append("Color: ").append(this.getMetadata().getColor()).append("\n")
				.append("Notes: ").append(this.getMetadata().getNotes()).append("\n")
				.append("Price: ").append(this.getPerdayrent().getPrice()).append("\n")
				.append("Discount: ").append(this.getPerdayrent().getDiscount()).append("\n");
		
		return out.toString();
	}

}
