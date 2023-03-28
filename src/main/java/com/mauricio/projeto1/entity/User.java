package com.mauricio.projeto1.entity;

import java.util.Set;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Table(name="TB_USER")
@Entity
public class User {

	public User() {}
	public User(Long id, String name, String email) {
		this.setId(id);
		this.setName(name);
		this.setEmail(email);
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String name;
	private String email;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@ManyToMany
	private Set<Role> roles;
	
}
