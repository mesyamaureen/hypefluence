package com.hypefluence.hypefluencebackend.login;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "BEWERBUNG")
public class Bewerbung {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="EMP_ID")
	private int bewerbung_id;
    
	private String bewerbung_subjekt;
	private String bewerbung_bewerbungsnachricht;
	private Date bewerbung_erstelldatum;
	
	public Bewerbung() {
		
	}
	
	public Bewerbung(int bewerbung_id, String bewerbung_subjekt, String bewerbung_bewerbungsnachricht,
			Date bewerbung_erstelldatum) {
		super();
		this.bewerbung_id = bewerbung_id;
		this.bewerbung_subjekt = bewerbung_subjekt;
		this.bewerbung_bewerbungsnachricht = bewerbung_bewerbungsnachricht;
		this.bewerbung_erstelldatum = bewerbung_erstelldatum;
	}


	public int getBewerbung_id() {
		return bewerbung_id;
	}


	public void setBewerbung_id(int bewerbung_id) {
		this.bewerbung_id = bewerbung_id;
	}


	public String getBewerbung_subjekt() {
		return bewerbung_subjekt;
	}


	public void setBewerbung_subjekt(String bewerbung_subjekt) {
		this.bewerbung_subjekt = bewerbung_subjekt;
	}


	public String getBewerbung_bewerbungsnachricht() {
		return bewerbung_bewerbungsnachricht;
	}


	public void setBewerbung_bewerbungsnachricht(String bewerbung_bewerbungsnachricht) {
		this.bewerbung_bewerbungsnachricht = bewerbung_bewerbungsnachricht;
	}


	public Date getBewerbung_erstelldatum() {
		return bewerbung_erstelldatum;
	}


	public void setBewerbung_erstelldatum(Date bewerbung_erstelldatum) {
		this.bewerbung_erstelldatum = bewerbung_erstelldatum;
	}
	
	
	
	
}
