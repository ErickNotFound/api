package br.org.serratec.livaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "associado")
public class Associado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_associado")
	private Long id;

	@NotBlank(message = "Nome do associado em branco")
	@Column(name = "nome", length = 50, nullable = false)
	private String nome;

	@NotBlank(message = "Telefone em branco")
	@Column(name = "telefone", length = 15, nullable = false)
	private String telefone;

	@CPF(message = "CPF inválido")
	@NotBlank(message = "CPF em branco")
	@Column(name = "cpf")
	private String cpf;

	@NotBlank(message = "Logradouro em branco")
	@Column(name = "logradouro", length = 80, nullable = false)
	private String logradouro;

	@NotBlank(message = "Número em branco")
	@Column(name = "numero", length = 10, nullable = false)
	private String numero;

	@NotBlank(message = "Complemento em branco")
	@Column(name = "complemento", length = 30, nullable = false)
	private String complemento;

	@NotBlank(message = "Bairro em branco")
	@Column(name = "bairro", length = 50, nullable = false)
	private String bairro;

	@NotBlank(message = "Cidadee em branco")
	@Column(name = "cidade", length = 50, nullable = false)
	private String cidade;

	@NotBlank(message = "Estado em branco")
	@Column(name = "estado", length = 2, nullable = false)
	private String estado;

	public Associado(Long id, @NotBlank(message = "Nome em branco") String nome,
			@NotBlank(message = "Telefone em branco") String telefone,
			@CPF(message = "CPF inválido") @NotBlank(message = "CPF em branco") String cpf,
			@NotBlank(message = "Logradouro em branco") String logradouro,
			@NotBlank(message = "Número em branco") String numero,
			@NotBlank(message = "Complemento em branco") String complemento,
			@NotBlank(message = "Bairro em branco") String bairro,
			@NotBlank(message = "Cidadee em branco") String cidade,
			@NotBlank(message = "Estado em branco") String estado) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public Associado() {
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
