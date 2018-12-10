
package net.javatutorial.tutorials.gfauthexample.managedbeans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.persistence.Column;
import net.javatutorial.tutorials.gfauthexample.ejb.UserEJB;
import net.javatutorial.tutorials.gfauthexample.entity.Musicas;
import net.javatutorial.tutorials.gfauthexample.entity.User;

@ManagedBean
@SessionScoped
public class dbView implements Serializable {

	private static final long serialVersionUID = 6081417964063918994L;
        
        
        private String Nome;
	private String Artista;

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
	private String Gravadora;
        
	@Inject
	private UserEJB userEJB;

	public List<Musicas> getMusicas() {
		List<Musicas> musicas = userEJB.list();		
		return musicas;

	}
        
        public void register() {
		Musicas mus = new Musicas(Nome, Artista, Gravadora);
		userEJB.createMusica(mus);       
		
	}
        
        public void removerMusica(Musicas mus) {
		userEJB.delete(mus);       
		
	}

}