package com.catalogo.moveis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("moveis")
public class MoveisController {
  
	@GetMapping()
	public void getAll() {
		
	}
	
}
