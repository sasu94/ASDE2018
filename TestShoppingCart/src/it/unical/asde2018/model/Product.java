package it.unical.asde2018.model;

public class Product {
	private int id;
	private String description,title;
	private float price;
	public Product(int id, String description, String title, float price) {
		super();
		this.id = id;
		this.description = description;
		this.title = title;
		this.price = price;
	}
	public Product(String title, String description, float price) {
		this.title=title;
		this.description=description;
		this.price=price;
	}
	public String getDescription() {
		return description;
	}
	public int getId() {
		return id;
	}
	public float getPrice() {
		return price;
	}
	public String getTitle() {
		return title;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
