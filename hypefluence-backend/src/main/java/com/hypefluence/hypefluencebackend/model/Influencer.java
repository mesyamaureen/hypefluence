package com.hypefluence.hypefluencebackend.model;

import javax.persistence.Entity;

@Entity
public class Influencer extends Benutzer {
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
