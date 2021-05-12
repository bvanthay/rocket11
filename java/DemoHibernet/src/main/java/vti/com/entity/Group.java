package vti.com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Group", catalog = "TestingSystem") 
public class Group  implements Serializable{
	@Column(name = "id")
	@Id // primary
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	private short id;

	@Column(name = "name", length = 50, nullable = false, unique = true) 
	private String name;
	@Temporal(TemporalType.TIME)
	@Column(name ="create_time")
	private Date createtime;
	public Group() {
	}
	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", createtime=" + createtime + "]";
	}
	
	
}
