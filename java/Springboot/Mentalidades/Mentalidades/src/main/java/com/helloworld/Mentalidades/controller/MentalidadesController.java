package com.helloworld.Mentalidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Mentalidades")
public class MentalidadesController {

	@GetMapping
	public String Mentalidades()
	{
		return "As mentalidades usadas foram:\nPersistencia\nAtenção aos detalhes";
	}
	


}
