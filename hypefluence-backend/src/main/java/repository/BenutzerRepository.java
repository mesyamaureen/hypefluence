package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import login.Benutzer;

public interface BenutzerRepository extends JpaRepository<Benutzer, Long> {
	Optional<Benutzer> findeMitBenutzername(String benutzername); 
	Boolean istBenutzername(String benutzername);
	Boolean istEmail(String email);
}
