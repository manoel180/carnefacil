package br.com.associados.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="enderecos")
public class Andress{

	@Id	
	private Long id;
	
}