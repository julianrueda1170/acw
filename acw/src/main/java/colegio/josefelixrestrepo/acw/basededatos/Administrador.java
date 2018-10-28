package colegio.josefelixrestrepo.acw.basededatos;

import javax.persistence.*;
import java.io.Serializable;

@NamedQueries(
        @NamedQuery(name = "obtenerAdministradorPorUsuarioYContrasenia", query = "SELECT a FROM Administrador a WHERE a.username = :username AND a.password = :password")
)
@Entity
public class Administrador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idAdministrador;
    private String username;
    private String password;
    private String correo;

    public Long getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Long idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
