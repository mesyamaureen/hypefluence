package com.hypefluence.hypefluencebackend.security;

import java.util.Collection;
import java.util.Objects;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import com.hypefluence.hypefluencebackend.model.Benutzer;

public class BenutzerDetailsImpl implements UserDetails {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String vorname;
	private String benutzername;
	private String email;
	private String profilbeschreibung;
	private String firmenname;
	private String istInfluencer;
	private String istUnternehmen;
	@JsonIgnore
	private String passwort;
	private Collection<? extends GrantedAuthority> authorities;
	public BenutzerDetailsImpl(Long id, String benutzername, String email, String passwort,
			Collection<? extends GrantedAuthority> authorities) {
		this.id = id;
		this.benutzername = benutzername;
		this.email = email;
		this.passwort = passwort;
		this.authorities = authorities;
	}
	public static BenutzerDetailsImpl build (Benutzer Benutzer) {
		return new BenutzerDetailsImpl(
				Benutzer.getId(),
				Benutzer.getBenutzername(),
				Benutzer.getEmail(),
				Benutzer.getPasswort(),
				authorities);
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}
	public Long getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String getPassword() {
		return passwort;
	}
	@Override
	public String getUsername() {
		return benutzername;
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;
		BenutzerDetailsImpl benutzer = (BenutzerDetailsImpl) o;
		return Objects.equals(id, benutzer.id);
	}
	
}
