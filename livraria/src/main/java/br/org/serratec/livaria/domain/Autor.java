package br.org.serratec.livaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "autor")
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_autor")
	private Long id;

	@NotBlank(message = "Nome do Autor em branco")
	@Column(name = "nome_autor", length = 50, nullable = false)
	private String nomeAutor;

	public Autor(Long id, @NotBlank(message = "Nome do Autor em branco") String nomeAutor) {
		super();
		this.id = id;
		this.nomeAutor = nomeAutor;
	}

	public Autor() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

}
