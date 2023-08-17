package com.catalogo.moveis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalogo.moveis.MoveisRepository;
import com.catalogo.moveis.dto.MoveisResponseDTO;


@RestController
@RequestMapping("movel")
public class MoveisController {
	
	@Autowired
	private MoveisRepository repository;
  
	@GetMapping
	public List<MoveisResponseDTO> getAll() {
		
		List<MoveisResponseDTO> moveisList = repository.findAll().stream().map(MoveisResponseDTO::new).toList();
		return moveisList;
	}
	
}
