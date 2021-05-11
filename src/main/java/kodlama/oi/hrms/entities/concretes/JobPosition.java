package kodlama.oi.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="positions")
public class JobPosition {
	
	@Id
	@GeneratedValue
	@Column(name="position_id")
	private int id;
	
	@Column(name="position_name")
	private String postionName;
	
	public JobPosition() {}

	public JobPosition(int id, String postionName) {
		super();
		this.id = id;
		this.postionName = postionName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPostionName() {
		return postionName;
	}

	public void setPostionName(String postionName) {
		this.postionName = postionName;
	}
	
	

	
}
