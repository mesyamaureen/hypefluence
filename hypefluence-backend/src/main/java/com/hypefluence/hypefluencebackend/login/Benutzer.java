package com.hypefluence.hypefluencebackend.login;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Inheritance
public class Benutzer implements UserDetails {
	
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
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return passwort;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return benutzername;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
