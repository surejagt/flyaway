package com.hitechsoft.flyaway.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="admin_login")
@Table(name = "login")
public class admin_login implements Serializable {
    private static final long serialVersionUID = 1 ; 
    
    
    @Id  
    @GeneratedValue(strategy=GenerationType.TABLE)  
      
    private int id;    
    
    
    public admin_login() {
    	
    }
   
	@Column(name = "username")
    private String username;

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

	@Column(name = "password")
    private String password;

}
