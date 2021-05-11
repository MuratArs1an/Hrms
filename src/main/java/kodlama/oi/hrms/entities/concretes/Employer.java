package kodlama.oi.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employers")
public class Employer extends User {
	
	@Id
	@GeneratedValue
	@Column(name="employers_id")
	private int id;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="phone_number")
	private String phoneNumber;

	@Column(name="company_verify")
	private Boolean companyVerify;
	
	public Employer() {}

	public Employer(int id, String companyName, String phoneNumber, Boolean companyVerify, String email, String password) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.phoneNumber = phoneNumber;
		this.companyVerify = companyVerify;
		this.email=email;
		this.password=password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Boolean getCompanyVerify() {
		return companyVerify;
	}

	public void setCompanyVerify(Boolean companyVerify) {
		this.companyVerify = companyVerify;
	}
	
	
	
	

}
