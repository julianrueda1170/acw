package colegio.josefelixrestrepo.acw.basededatos;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name = "obtenerAnimales", query = "SELECT a FROM Animal a"),
        @NamedQuery(name = "obtenerAnimalesSinUsuario", query = "SELECT a FROM Animal a WHERE a.usuario = null")
})
@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int codigoAnimal;
    private String tipoAnimal;
    private String raza;
    private int edad;
    private int peso;
    private String color;
    private int altura;
    @ManyToOne
    private Usuario usuario;

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getCodigoAnimal() {
        return codigoAnimal;
    }

    public void setCodigoAnimal(int codigoAnimal) {
        this.codigoAnimal = codigoAnimal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
