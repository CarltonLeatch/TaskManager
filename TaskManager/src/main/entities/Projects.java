package entities;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "projects", catalog = "TaskManager")
public class Projects {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int project_id;
	private String name;
	private String description;
//	private Task task;
	

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")//,referencedColumnName="user_id")
	private Users user;
	

	

	

	@Column(name = "project_id", unique = true, nullable = false)
	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
}
