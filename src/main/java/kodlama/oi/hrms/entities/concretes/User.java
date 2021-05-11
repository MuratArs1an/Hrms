package kodlama.oi.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	int id;
	
	@Column(name="email")
	String email;
	
	@Column(name="password")
	String password;
	

}
