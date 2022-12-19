package com.b2list.b2list_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;

import jakarta.servlet.Filter;

import com.b2list.b2list_app.models.User;
import com.b2list.b2list_app.repositories.UserRespository;



@RestController
@SpringBootApplication
@CrossOrigin(origins = CorsConfiguration.ALL)
public class B2listAppApplication {
	@Autowired
	private UserRespository userepo;

	public static void main(String[] args) {

		SpringApplication.run(B2listAppApplication.class, args);
	}

	@PostMapping("/SignUp-User")
	public User SignUpUser(@RequestBody User user) {
		User usuario = new User();
		usuario.Name = user.Name;
		usuario.Email = user.Email;
		usuario.CPF = user.CPF;
		usuario.Username = user.Username;
		try {
			userepo.save(usuario);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		return usuario;
	}
}
