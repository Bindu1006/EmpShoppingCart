package com.sjsu.ad.BO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="products")
public class ProductInfoBO {
	
	@Id
	@Column(name = "productCode", nullable = false)
	private String productCode;
	
	@Column(name = "productName", nullable = false)
	private String productName;
	
	@JoinColumn(name = "productLine_id", referencedColumnName = "productLine")
	@ManyToOne
	private String productLine;
	
	@Column(name = "productScale", nullable = false)
	private String productScale;
	
	@Column(name = "productVendor", nullable = false)
	private String productVendor;
	
	@Column(name = "productDescription", nullable = false)
	private String productDesc;
	
	@Column(name = "quantityInStock", nullable = false)
	private String productQuantity;
	
	@Column(name = "buyPrice", nullable = false)
	private String productPrice;
	
	@Column(name = "featuredProduct", nullable = false)
	private boolean isProductFeatured;
	
	@Column(name = "bestSeller", nullable = false)
	private boolean isBestSeller;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getProductScale() {
		return productScale;
	}

	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}

	public String getProductVendor() {
		return productVendor;
	}

	public void setProductVender(String productVendor) {
		this.productVendor = productVendor;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public boolean isProductFeatured() {
		return isProductFeatured;
	}

	public void setProductFeatured(boolean isProductFeatured) {
		this.isProductFeatured = isProductFeatured;
	}

	public boolean isBestSeller() {
		return isBestSeller;
	}

	public void setBestSeller(boolean isBestSeller) {
		this.isBestSeller = isBestSeller;
	}

	@Override
	public String toString() {
		return "ProductInfoBO [productCode=" + productCode + ", productName="
				+ productName + ", productLine=" + productLine
				+ ", productScale=" + productScale + ", productVendor="
				+ productVendor + ", productDesc=" + productDesc
				+ ", productQuantity=" + productQuantity + ", productPrice="
				+ productPrice + ", isProductFeatured=" + isProductFeatured
				+ ", isBestSeller=" + isBestSeller + "]";
	}
	
	
	
}
