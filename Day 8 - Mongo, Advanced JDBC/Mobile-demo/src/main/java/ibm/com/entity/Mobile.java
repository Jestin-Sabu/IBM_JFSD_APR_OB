package ibm.com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobile")
public class Mobile {

	@Id
	@Column(name="mcode")
	private int mobileCode;
	@Column(name="mBrand")
	private String mobileBrand;
	@Column(name="mModel")
	private String mobileModel;
	@Column(name="price")
	private double price;
	
	public Mobile() {
		
	}
	public Mobile(int mobileCode, String mobileBrand, String mobileModel, double price) {
		this.mobileCode = mobileCode;
		this.mobileBrand = mobileBrand;
		this.mobileModel = mobileModel;
		this.price = price;
	}
	public int getMobileCode() {
		return mobileCode;
	}
	public void setMobileCode(int mobileCode) {
		this.mobileCode = mobileCode;
	}
	public String getMobileBrand() {
		return mobileBrand;
	}
	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}
	public String getMobileModel() {
		return mobileModel;
	}
	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return mobileBrand + " " + mobileModel;
	}
	
	
	
}
