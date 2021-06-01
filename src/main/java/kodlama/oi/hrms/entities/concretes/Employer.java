package kodlama.oi.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@EqualsAndHashCode(callSuper=true)
@Table(name="employers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name="user_id")



public class Employer extends User {
	
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="web")
	private String web;
	
	@Column(name="password_again")
	private String passwordAgain;

}	
