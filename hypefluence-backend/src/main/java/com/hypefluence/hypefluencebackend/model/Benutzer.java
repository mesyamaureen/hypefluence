package com.hypefluence.hypefluencebackend.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Inheritance
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor

//@Table -> Beziehung mit der Datenbank über JPA
public class Benutzer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String vorname;
	private String benutzername;
	private String passwort;
	private String email;
	private String profilbeschreibung;
	private String firmenname;
	private String iglink;
	private String fblink;
	private String ytlink;
	private String ttlink;
	private String twlink;
	
	public Benutzer() {
	}
	
	public Benutzer(String name, String vorname, String benutzername, String passwort, String email, String profilbeschreibung, String firmenname) {
		
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

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getBenutzername() {
		return benutzername;
	}

	public void setBenutzername(String benutzername) {
		this.benutzername = benutzername;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfilbeschreibung() {
		return profilbeschreibung;
	}

	public void setProfilbeschreibung(String profilbeschreibung) {
		this.profilbeschreibung = profilbeschreibung;
	}

	public String getFirmenname() {
		return firmenname;
	}

	public void setFirmenname(String firmenname) {
		this.firmenname = firmenname;
	}

	public String getIglink() {
		return iglink;
	}

	public void setIglink(String iglink) {
		this.iglink = iglink;
	}

	public String getFblink() {
		return fblink;
	}

	public void setFblink(String fblink) {
		this.fblink = fblink;
	}

	public String getYtlink() {
		return ytlink;
	}

	public void setYtlink(String ytlink) {
		this.ytlink = ytlink;
	}

	public String getTtlink() {
		return ttlink;
	}

	public void setTtlink(String ttlink) {
		this.ttlink = ttlink;
	}

	public String getTwlink() {
		return twlink;
	}

	public void setTwlink(String twlink) {
		this.twlink = twlink;
	}



}
