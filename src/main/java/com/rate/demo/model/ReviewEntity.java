package com.rate.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ReviewEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int productId;
	private String productName;
	private double productRating;
	private String productReview;
	private int productPrice;
	private String category;
	private Long updatedDate;
	private Long createdDate;
	public ReviewEntity() {
		super();
	}

	public ReviewEntity(int id, int productId, String productName, double productRating, String productReview,
			int productPrice, String category, Long updatedDate, Long createdDate) {
		super();
		this.id = id;
		this.productId = productId;
		this.productName = productName;
		this.productRating = productRating;
		this.productReview = productReview;
		this.productPrice = productPrice;
		this.category = category;
		this.updatedDate = updatedDate;
		this.createdDate = createdDate;
	}
   public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public double getProductRating() {
		return productRating;
	}

	public void setProductRating(double productRating) {
		this.productRating = productRating;
	}

	public String getProductReview() {
		return productReview;
	}

	public void setProductReview(String productReview) {
		this.productReview = productReview;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Long updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Long getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Long createdDate) {
		this.createdDate = createdDate;
	}
}
	