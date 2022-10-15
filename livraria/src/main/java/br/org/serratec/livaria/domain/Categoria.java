package br.org.serratec.livaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria")
	private Long id;

	@NotBlank(message = "Nome da categoria em branco")
	@Column(name = "nome_categoria", length = 30, nullable = false)
	private String nome;

	@NotBlank(message = "Descricao em branco")
	@Column(name = "descricao", length = 200)
	private String descricao;

	public Categoria(Long id, @NotBlank(message = "Nome da categoria em branco") String nome,
			@NotBlank(message = "Descricao em branco") String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Categoria() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
