package security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.Benutzer;
import repository.BenutzerRepository;

@Service
public class BenutzerDetailsServiceImpl implements UserDetailsService {
	@Autowired
	BenutzerRepository benutzerRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String benutzername) throws UsernameNotFoundException {
		Benutzer benutzer = benutzerRepository.istBenutzername(benutzername)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + benutzername));
		return BenutzerDetailsImpl.build(benutzer);
	}
}

