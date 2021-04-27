package com.helloworld.Objetivos.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivos")
public class ObjetivosController {
	@GetMapping
	public String Objetivos()
	{
		return "Os meus objetivos de aprendizagem são:\nAprender mais sobre o Maven\nAprender mais sobre Springboot";
	}
}
