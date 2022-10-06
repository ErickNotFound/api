package org.serratec.veiculos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "veiculos")
public class Veiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_carro")
	private Integer id;
	
	@Column(name="marca", nullable = false, length = 30)
	private String marca;
	
	@Column(name="modelo", nullable = false, length = 20)
	private String modelo;

	public Veiculo(Integer id, String marca, String modelo) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
	}

	public Veiculo() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

}