package com.catalogo.moveis;

import com.catalogo.moveis.dto.MoveisRequestDTO;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "moveis")
@Entity(name = "moveis")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Moveis {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
	private String image;
	
	private Integer price;
	
	public Moveis(MoveisRequestDTO data) {
		this.title = data.title();
		this.image = data.image();
		this.price = data.price();
	}
}
