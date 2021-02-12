package com.rwanda.online.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "destinations")
public class Destination {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="destiantion_id")
	private Long id;
	
	private Long to;
	
	@Column(name = "name", nullable = false, length = 20)
	private String name;

	public Destination() {
		super();
	}

	public Destination(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}