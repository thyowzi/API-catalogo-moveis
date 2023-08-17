package com.catalogo.moveis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalogo.moveis.Moveis;
import com.catalogo.moveis.MoveisRepository;


@RestController
@RequestMapping("moveis")
public class MoveisController {
	
	@Autowired
	private MoveisRepository repository;
  
	@GetMapping
	public List<Moveis> getAll() {
		List<Moveis> moveisList = repository.findAll();
		
		return moveisList;
	}
	
}
