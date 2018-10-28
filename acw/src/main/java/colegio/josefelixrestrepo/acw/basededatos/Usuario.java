package colegio.josefelixrestrepo.acw.basededatos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@NamedQueries(
        @NamedQuery(name = "obtenerUsuarioPorUsernameYContrasenia", query = "SELECT u FROM Usuario u WHERE u.username = :username AND u.password = :password"))
@Entity
public class Usuario implements Serializable {

    @Id
    private Long cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    private String username;
    private String password;
    private String telefono;
    @OneToMany(mappedBy = "usuario")
    private List<Animal> mascotas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Animal> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Animal> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(getCedula(), usuario.getCedula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCedula());
    }
}
