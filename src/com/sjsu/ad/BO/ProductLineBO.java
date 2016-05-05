package com.sjsu.ad.BO;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="productlines")
public class ProductLineBO {
	
	@Id
	@Column(name = "productLine", nullable = false)
	private String productLine;
	
	@Column(name = "textDescription")
	private String textDescription;
	
	@Column(name = "htmlDescription")
	private String htmlDescription;
	
	@Column(name = "productImage")
	private byte[] productImage;

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getTextDescription() {
		return textDescription;
	}

	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}

	public String getHtmlDescription() {
		return htmlDescription;
	}

	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}

	public byte[] getProductImage() {
		return productImage;
	}

	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
	}

	@Override
	public String toString() {
		return "ProductLineBO [productLine=" + productLine
				+ ", textDescription=" + textDescription + ", htmlDescription="
				+ htmlDescription + ", productImage="
				+ Arrays.toString(productImage) + "]";
	}
	
	

}
