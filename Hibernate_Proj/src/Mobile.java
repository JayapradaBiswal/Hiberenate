import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//1st rule              //2nd rules
public class Mobile implements Serializable
{
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int d) {
		this.ramSize = d;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Mobile() {
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int id;
private String brand;
private int ramSize;
private double price;
@Override
public String toString() {
	return "Mobile [id=" + id + ", brand=" + brand + ", ramSize=" + ramSize + ", price=" + price + "]";
}

}
