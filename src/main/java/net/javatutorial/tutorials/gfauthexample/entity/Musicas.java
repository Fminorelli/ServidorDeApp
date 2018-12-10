package net.javatutorial.tutorials.gfauthexample.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
	@NamedQuery(name = "list", query = "SELECT m.nome, m.artista, m.gravadora FROM Musicas m")
})
@Table(name="musicas")
public class Musicas implements Serializable {

	private static final long serialVersionUID = -5892169641074303723L;
	
	@Id
	@Column(name="Nome", nullable=false, length=255)
	private String Nome;
	
	@Column(name="Artista", nullable=false, length=64)
	private String Artista;
	
	@Column(name="Gravadora", nullable=false, length=30)
	private String Gravadora;
	
	public Musicas(){}

	public Musicas(String Nome, String Artista, String Gravadora) {
		this.Nome = Nome;
		this.Artista = Artista;
		this.Gravadora = Gravadora;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public String getArtista() {
		return Artista;
	}

	public void setArtista(String Artista) {
		this.Artista = Artista;
	}

	public String getGravadora() {
		return Gravadora;
	}

	public void setGravadora(String Gravadora) {
		this.Gravadora = Gravadora;
	}
}
