package com.catalogo.moveis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalogo.moveis.Moveis;
import com.catalogo.moveis.MoveisRepository;
import com.catalogo.moveis.dto.MoveisRequestDTO;
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
	
	@PostMapping
	public void saveMoveis(@RequestBody MoveisRequestDTO data) {
		Moveis moveisData = new Moveis(data);
			
		repository.save(moveisData);
		return;
	}
	
}
