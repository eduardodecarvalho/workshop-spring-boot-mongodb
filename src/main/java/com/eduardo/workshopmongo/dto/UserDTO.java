package com.eduardo.workshopmongo.dto;

import java.io.Serializable;

import com.eduardo.workshopmongo.domain.User;

public class UserDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String email;
	
	public UserDTO() {
		//construtor vazio.
	}
	public UserDTO(User Obj) {
		id = Obj.getId();
		name = Obj.getName();
		email = Obj.getEmail();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
}
