package vti.com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import vti.com.enumerate.UserRole;
import vti.com.enumerate.UserRoleConvert;
@Entity
@Table(name = "User", catalog = "TestingSystem") 
public class User implements Serializable {
	@Column(name = "id")
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
 private short id;
 
	@Column(name = "username" , length = 50 ,nullable = false , unique = true)
 private String username;
 
@Column(name = "password" , length = 800, nullable = false)
private String password;

@Column(name = "firstName" , length = 50, nullable = false)
private String firstName;

@Column(name = "lastName" , length = 50, nullable = false)
private String lastName;
 
 
 @Temporal(TemporalType.DATE)
 @Column(name = "date_Of_Birth")
 private Date dateOfBirth;


@Column(name = "address" , length = 50, nullable = false)
private String address;

@Column(name = "phone" , length = 15 ,nullable = false , unique = true)
private String phone ;

@Convert(converter = UserRoleConvert.class)
@Column(name = "role",nullable = false)
private UserRole role;

@Column(name ="status" )
private byte status;


public User() {
	
}


public short getId() {
	return id;
}


public void setId(short id) {
	this.id = id;
}


public String getUsername() {
	return username;
}


public void setUsername(String username) {
	this.username = username;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public Date getDateOfBirth() {
	return dateOfBirth;
}


public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String getPhone() {
	return phone;
}


public void setPhone(String phone) {
	this.phone = phone;
}


public byte getStatus() {
	return status;
}


public void setStatus(byte status) {
	this.status = status;
}


public UserRole getRole() {
	return role;
}


public void setRole(UserRole role) {
	this.role = role;
}


@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
			+ ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", phone=" + phone
			+ ", role=" + role + ", status=" + status + "]";
}





}
