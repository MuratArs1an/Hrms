package kodlama.oi.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidates")
public class Candidates extends User{

	public Candidates() {
		
	}
	
	@Id
	@GeneratedValue
	@Column(name="candidates_id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="national_id")
	private long nationalId;
	
	@Column(name="birth_date")
	private String birthYear;
	
	@Column(name="mernis_verify")
	private Boolean mernisVerify;

	public Candidates(int id, String email,String password, String name, String surname, long nationalId, String birthYear, Boolean mernisVerify) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.nationalId = nationalId;
		this.birthYear = birthYear;
		this.email=email;
		this.password=password;
		this.mernisVerify=mernisVerify;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public long getNationalId() {
		return nationalId;
	}

	public void setNationalId(long nationalId) {
		this.nationalId = nationalId;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public Boolean getMernisVerify() {
		return mernisVerify;
	}

	public void setMernisVerify(Boolean mernisVerify) {
		this.mernisVerify = mernisVerify;
	}
	
	
	
	
	
}
