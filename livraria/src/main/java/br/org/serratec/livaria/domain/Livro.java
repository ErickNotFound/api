package br.org.serratec.livaria.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_livro")
	private Long id;

	@NotBlank(message = "Titulo do livro em branco")
	@Column(name = "titulo", length = 40, nullable = false)
	private String titulo;

	@NotBlank(message = "Categoria em branco")
	@Column(name = "id_categoria")
	private Categoria categoria;

	@NotBlank(message = "Isbn em branco")
	@Column(name = "isbn", length = 20, nullable = false, unique = true)
	private String isbn;

	@NotBlank(message = "Data de Publicação em branco")
	@Column(name = "dataPublicao")
	private LocalDate dataPublicacao;

	public Livro(Long id, @NotBlank(message = "Titulo do livro em branco") String titulo,
			@NotBlank(message = "Categoria em branco") Categoria categoria,
			@NotBlank(message = "Isbn em branco") String isbn,
			@NotBlank(message = "Data de Publicação em branco") LocalDate dataPublicacao) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.categoria = categoria;
		this.isbn = isbn;
		this.dataPublicacao = dataPublicacao;
	}

	public Livro() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

}
