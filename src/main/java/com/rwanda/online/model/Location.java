package com.rwanda.online.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "location")
public class Location extends AuditModel {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="location_id")
	private Long id;
	
	@Column(name = "district", nullable = false, unique = true, length = 64)
	private String district;
	
	@OneToMany(mappedBy = "location", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List < Accomodation > accomodations;

	public Location() {
		super();
	}
	
	public Location(String district, List<Accomodation> accomodations) {
		super();
		this.district = district;
		this.accomodations = accomodations;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@OneToMany(mappedBy = "locations", cascade = {
	        CascadeType.ALL
	    })
	public List<Accomodation> getAccomodations() {
		return accomodations;
	}

	public void setAccomodations(List<Accomodation> accomodations) {
		this.accomodations = accomodations;
	}
	

}