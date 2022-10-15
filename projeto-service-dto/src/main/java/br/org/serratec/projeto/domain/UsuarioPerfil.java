package br.org.serratec.projeto.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "usuario_perfil")
public class UsuarioPerfil {
	
	@EmbeddedId
	private UsuarioPerfilPK usuarioPerfilPK = new UsuarioPerfilPK();
	
	@Column(name = "data_criacao")
	private LocalDate dataCriacao;

	public UsuarioPerfil() {
	}

	public UsuarioPerfil(Usuario usuario, Perfil perfil, LocalDate dataCriacao) {
		this.usuarioPerfilPK.setUsuario(usuario);
		this.usuarioPerfilPK.setPerfil(perfil);
		this.dataCriacao = dataCriacao;
	}

	public UsuarioPerfilPK getId() {
		return usuarioPerfilPK;
	}

	public void setId(UsuarioPerfilPK id) {
		this.usuarioPerfilPK = id;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public void setUsuario(Usuario usuario) {
		this.usuarioPerfilPK.setUsuario(usuario);
	}

	public void setPerfil(Perfil perfil) {
		this.usuarioPerfilPK.setPerfil(perfil);
	}
}