package org.generation.controller;

import java.util.List;

import org.generation.model.Postagem;
import org.generation.service.PostagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/postagem")
public class PostagemController {
	
	private final PostagemService service;
	
	@Autowired
	public PostagemController(PostagemService service) {
		this.service = service;
	} 
	
	@GetMapping
	public ResponseEntity<List<Postagem>> findall(){
		return ResponseEntity.ok(service.findall());
	}
	
	@PostMapping
	public ResponseEntity<Void> save(@RequestBody Postagem postagem){
		service.save(postagem);
		return ResponseEntity.ok().build();
	}
	@GetMapping("/{titulo}")
	public ResponseEntity<Postagem> findByTitulo(@PathVariable("titulo") String titulo){
		return ResponseEntity.ok(service.findByTitulo(titulo));
	}

	
	
}
