package vti.com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Testing_Category", catalog = "TestingSystem")
public class Testingcategory implements Serializable {

	@Column(name = "id")
	@Id // primary
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	private short id;

	@Column(name = "name", length = 50, nullable = false, unique = true) // xét các thuộc tính trong database//
	private String name;

	public Testingcategory() {
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

	@Override
	public String toString() {
		String result = "";
		result +=  "id:"  +  id + "";
		result +=  "name" + name ;
		return result;

	}
}
