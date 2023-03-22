package com.rate.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductEntity {
	@Id
	private int productId;
	private double productRatings;
	private String productName;
	private double productPrice;
	private String productCategory;
	private int numberofreviews;
	public ProductEntity(int productId, double productRatings, String productName, double productPrice,
			String productCategory,int numberofreviews) {
		super();
		this.productId = productId;
		this.productRatings = productRatings;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
		this.numberofreviews=numberofreviews;
	}
	public ProductEntity() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getProductRatings() {
		return productRatings;
	}
	public void setProductRatings(double d) {
		this.productRatings = d;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public int getNumberofreviews() {
		return numberofreviews;
	}
	public void setNumberofreviews(int numberofreviews) {
		this.numberofreviews = numberofreviews;
	}
	
	
}
