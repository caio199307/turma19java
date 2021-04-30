package org.generation.service;

import java.util.List;

import org.generation.model.Postagem;
import org.generation.model.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostagemService {
	private final PostagemRepository repository;
	
	@Autowired
	public PostagemService(PostagemRepository repository) {
		this.repository = repository;
	}
	public List<Postagem> findall(){
		return repository.findAll();
	}
	public void save(Postagem postagem) {
		repository.save(postagem);
	}
	public Postagem findByTitulo(String titulo) {
		return repository.findByTitulo(titulo);
	}	
}