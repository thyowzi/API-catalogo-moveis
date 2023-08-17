package com.catalogo.moveis.dto;

import com.catalogo.moveis.Moveis;

public record MoveisResponseDTO(
		
		Long id, 
		String title, 
		String image, 
		Integer price) {
	
	public MoveisResponseDTO(Moveis moveis) {
		this(moveis.getId(), moveis.getTitle(), moveis.getImage(), moveis.getPrice());
	}
	
}
