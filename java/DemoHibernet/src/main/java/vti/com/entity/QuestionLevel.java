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
@Table(name = "Question_Level", catalog = "TestingSystem")
public class QuestionLevel implements Serializable {

	@Column(name = "id")
	@Id // primary
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	private short id;

	@Column(name = "level", length = 20, nullable = false)
	private String level;

	public QuestionLevel() {
		
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "QuestionLevel [id=" + id + ", level=" + level + "]";
	}
	
}
