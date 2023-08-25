package com.example.day7.Model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Drinks")
public class JPQLModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shopId;
	@Column(name="shopName")
	private String shopName;
	private String city;
	private String drinks;
	private String country;
	public int getHotelId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDrinks() {
		return drinks;
	}
	public void setDrinks(String drinks) {
		this.drinks = drinks;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}