package controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/auth")
public class AuthController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@PostMapping("/anmelden")
	public xyc xyc(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new xyc(counter.incrementAndGet(), String.format(template, name));
	}
	
	@PostMapping("/registrieren")
	public abc abc(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new abc(counter.incrementAndGet(), String.format(template, name));
	}
}


