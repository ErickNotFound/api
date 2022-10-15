package org.serratec.exercicio.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="Veiculo")
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Preencha a placa")
	@Size(max=7)
	@Column(nullable=false, length=7)
	private String placa;
	
	@NotBlank(message="Preencha a marca")
	@Size(max=30)
	@Column(nullable=false, length= 30)
	private String marca;
	
	
}
