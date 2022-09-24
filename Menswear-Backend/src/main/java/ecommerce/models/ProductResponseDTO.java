package ecommerce.models;

import org.springframework.beans.BeanUtils;

import ecommerce.entities.Product;

public class ProductResponseDTO {
	

	private String brand;
	private int prodid;
	private String pname;
	private String pcat;
	private String subcat;
	private int price;
	private String photo;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcat() {
		return pcat;
	}
	public void setPcat(String pcat) {
		this.pcat = pcat;
	}
	public String getSubcat() {
		return subcat;
	}
	public void setSubcat(String subcat) {
		this.subcat = subcat;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public static ProductResponseDTO fromEntity(Product entity) {
		ProductResponseDTO dto = new ProductResponseDTO();
		BeanUtils.copyProperties(entity, dto);
		
		return dto;
	}
}
