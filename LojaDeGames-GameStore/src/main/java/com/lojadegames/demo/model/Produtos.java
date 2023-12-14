package com.lojadegames.demo.model;

import java.time.*;

import org.hibernate.*;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name="tb_games")
public class Produtos{
	
	 @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private Long id;
		
		@NotBlank(message = "O atributo título é Obrigatório!") 
		@Size(min = 5, max = 100, message = "O atributo título deve conter no mínimo 05 e no máximo 100 caracteres")
		private String titulo;
		
		@NotBlank(message = "O atributo descrição é Obrigatório!")
		@Size(min = 10, max = 1000, message = "O atributo texto deve conter no mínimo 10 e no máximo 1000 caracteres")
		private String descricao;
		
		@UpdateTimestamp
		private LocalDateTime data;

	    public Long getId() {
	        return this.id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getTitulo() {
	        return this.titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public String getTexto() {
	        return this.descricao;
	    }

	    public void setTexto(String descricao) {
	        this.descricao = descricao;
	    }

	    public LocalDateTime getData() {
	        return this.data;
	    }

	    public void setData(LocalDateTime data) {
	        this.data = data;
	    }
	  
	}