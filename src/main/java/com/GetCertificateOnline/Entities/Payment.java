package com.GetCertificateOnline.Entities;

import java.util.Objects;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "paymentId")
	private int paymentId;

	@Column(name = "customerName")
	private String customerName;

	@Column(name = "price")
	private Float price;

	@Column(name = "paymentMode")
	private String paymentMode;

	public Payment(String customerName, Float price, String paymentMode, int paymentId) {
	super();
	this.customerName = customerName;
	this.price = price;
	this.paymentMode = paymentMode;
	this.paymentId = paymentId;
	}
	public Payment() {
		super();
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	@Override
    public int hashCode() {
		return Objects.hash(customerName, paymentId, paymentMode, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Objects.equals(customerName, other.customerName) && Objects.equals(paymentId, other.paymentId)
				&& Objects.equals(paymentMode, other.paymentMode) && Objects.equals(price, other.price);
		}
	@Override
	public String toString() {
		return "Payment [customerName=" + customerName + ", price=" + price + ", paymentMode=" + paymentMode
				+ ", paymentId=" + paymentId + "]";
	}
}

















