package com.java.springboot.productproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int productId;
private String productName;
private int productCost;
private String productType;

public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getProductCost() {
	return productCost;
}
public void setProductCost(int productCost) {
	this.productCost = productCost;
}
public String getProductType() {
	return productType;
}
public void setProductType(String productType) {
	this.productType = productType;
}

}
