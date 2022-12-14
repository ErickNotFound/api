package org.serratec.olamundo.domain;

public class Veiculo {
	private Integer id;
	private String marca;
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
