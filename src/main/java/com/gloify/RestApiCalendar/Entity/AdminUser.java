package com.gloify.RestApiCalendar.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class AdminUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String UsernameOrEmail;
	public String getUsernameOrEmail() {
		return UsernameOrEmail;
	}
	public void setUsernameOrEmail(String usernameOrEmail) {
		UsernameOrEmail = usernameOrEmail;
	}
	private String password;
     
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
