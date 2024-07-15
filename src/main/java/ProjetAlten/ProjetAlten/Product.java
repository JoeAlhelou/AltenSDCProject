package ProjetAlten.ProjetAlten;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@javax.persistence.Entity
public class Product {

	private @Id @GeneratedValue Integer id;
	private String code;
	private String name;
	private String description;
	private int price;
	private int quantity;
	private String inventoryStatus;
	private String category;
	private String image;
	private int rating;


	public Product(String code, String name, String description, int price, int quantity, String inventoryStatus,
			String category) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.inventoryStatus = inventoryStatus;
		this.category = category;
	}
	public Product() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getInventoryStatus() {
		return inventoryStatus;
	}
	public void setInventoryStatus(String inventoryStatus) {
		this.inventoryStatus = inventoryStatus;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
}
