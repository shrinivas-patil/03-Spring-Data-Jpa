package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
public class Product {
	
	//we have to set Wrapper value it give null it will give exception
	//if one is missing value it will give exception ex:id and name is set and price is default
	//if we set primitive it will set value as default like 0
	
	//@Id
//	@TableGenerator(initialValue = 100, name = "pid", table="pid_seq_tbl")
//	@GeneratedValue(strategy = GenerationType.TABLE, generator="pid")
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId; // null
	private String productName; // null
	private Double productPrice; // null
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Integer productId, String productName, Double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	
	

	
	
}
