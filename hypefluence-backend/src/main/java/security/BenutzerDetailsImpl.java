package security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import com.fasterxml.jackson.annotation.JsonIgnore;

import model.Benutzer;

public class BenutzerDetailsImpl implements BenutzerDetails {
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
				
				Benutzer.getName(),
				Benutzer.getEmail(),
				Benutzer.getPassword(),
				Benutzer.getAuthorities()
				);
	}
	
}
