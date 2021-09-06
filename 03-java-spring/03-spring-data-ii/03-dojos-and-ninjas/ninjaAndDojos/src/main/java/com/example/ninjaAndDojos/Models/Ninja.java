package com.example.ninjaAndDojos.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ninjas")
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @Size(min = 2, max = 20)
    private String firstName;
//    @Size(min = 2, max = 20)
    private String lastName;
    @Min(value=1, message="required a number")
//    @NotEmpty
    private Integer age;
    @Column(updatable=false)
    @DateTimeFormat(pattern="MM/dd/yyyy HH:mm:ss")
    private Date createdAt;
    @DateTimeFormat(pattern="MM/dd/yyyy HH:mm:ss")
    private Date updatedAt;
    
    
    @PrePersist
    protected void onCreate() {
    	this.createdAt=new Date();
    }
    
    @PreUpdate
    protected void onUpdate() {
    	this.updatedAt=new Date();
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="dojo_id")
    private Dojo dojo;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Dojo getDojo() {
		return dojo;
	}
	public void setDojo(Dojo dojo) {
		this.dojo = dojo;
	}
    
}
