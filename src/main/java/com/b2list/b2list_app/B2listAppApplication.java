package com.b2list.b2list_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.b2list.b2list_app.models.User;
import com.b2list.b2list_app.repositories.UserRespository;

@RestController
@SpringBootApplication
public class B2listAppApplication {
	@Autowired
	private UserRespository userepo;
	public static void main(String[] args) {

		SpringApplication.run(B2listAppApplication.class, args);
	}

	@PostMapping("/SignUp-User")
	public User greeting(@RequestParam(value = "name", defaultValue = "") String name,
			@RequestParam(value = "email", defaultValue = "") String email,
			@RequestParam(value = "CPF", defaultValue = "") String CPF,
			@RequestParam(value = "UserName", defaultValue = "") String UserName) {
		User usuario = new User();
		usuario.Nome = name;
		usuario.Email = email;
		usuario.CPF = CPF;
		usuario.UserName = UserName;
		userepo.save(usuario);
		return usuario;
	}
}
