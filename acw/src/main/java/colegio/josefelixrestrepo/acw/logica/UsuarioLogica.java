package colegio.josefelixrestrepo.acw.logica;

import colegio.josefelixrestrepo.acw.basededatos.Animal;
import colegio.josefelixrestrepo.acw.basededatos.ConexionDatos;
import colegio.josefelixrestrepo.acw.basededatos.Usuario;
import colegio.josefelixrestrepo.acw.util.ValidacionesUtil;
import org.hibernate.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;

public class UsuarioLogica {

    private ValidacionesUtil validacionesUtil;
    private EntityManager entityManager;

    public UsuarioLogica(){

        validacionesUtil = new ValidacionesUtil();
        entityManager = ConexionDatos.entityManagerFactory.createEntityManager();
    }

    public String registrarUsuario(String cedula, String nombre, String apellido, String edad, String correo, String username, String password, String confirmarPassword, String telefono){

        if(validacionesUtil.esVacio(cedula)){

            return "La cedula no puede ser vacia";
        }

        if(!validacionesUtil.esNumero(cedula) || Long.parseLong(cedula) <= 0 ){

            return "La cedula debe ser un numero mayor que cero";
        }

        if(validacionesUtil.esVacio(nombre)){

            return "El nombre no puede ser vacio";
        }

        if(validacionesUtil.esVacio(apellido)){

            return "El apellido no puede ser vacio";
        }

        if(validacionesUtil.esVacio(edad)){

            return "La edad no puede ser vacia";
        }

        if(!validacionesUtil.esNumero(edad) || Integer.parseInt(edad) < 18){

            return "La edad debe ser un numero mayor o igual a 18 años";
        }

        if(validacionesUtil.esVacio(correo)){

            return "El correo no puede ser vacio";
        }

        if(validacionesUtil.esVacio(username)){

            return "El nombre de usuario no puede ser vacio";
        }

        if(validacionesUtil.esVacio(password)){

            return "El password no puede ser vacio";
        }

        if(validacionesUtil.esVacio(confirmarPassword)){

            return "La confirmacion del password no puede ser vacia";
        }

        if(!password.equals(confirmarPassword)){

            return "El password y la confirmacion del password no son iguales";
        }

        if(validacionesUtil.esVacio(telefono)){

            return "El telefono no puede ser vacio";
        }

        String resultado = "OK";

        try {

            insertarUsuario(Long.parseLong(cedula), nombre, apellido, Integer.parseInt(edad), correo, username, password, telefono);

        } catch (Exception e) {

            resultado = "No se pudo insertar el usuario, error inesperado";
            e.printStackTrace();
        }

        return resultado;

    }

    public List<Animal> obtenerAnimalesDeUsuario(String idUsuario){

        Usuario usuario = entityManager.find(Usuario.class, idUsuario);

        Hibernate.initialize(usuario.getMascotas());

        return usuario.getMascotas();
    }

    public String adoptarMascota(String idUsuario, String idAnimal){

        String resultado = "OK";
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try {

            Usuario usuario = entityManager.find(Usuario.class, idUsuario);
            Animal animal = entityManager.find(Animal.class, idAnimal);
            Hibernate.initialize(usuario.getMascotas());
            if(usuario.getMascotas() == null){

                usuario.setMascotas(new ArrayList<>());
            }
            usuario.getMascotas().add(animal);

            entityManager.merge(usuario);

            transaction.commit();

        } catch (Exception e) {

            resultado = "No se pudo adoptar la mascota, error inesperado";
            e.printStackTrace();
        }

        return resultado;
    }

    private void insertarUsuario(Long cedula, String nombre, String apellido, int edad, String correo, String username, String password, String telefono){

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Usuario usuario = new Usuario();
        usuario.setApellido(apellido);
        usuario.setCedula(cedula);
        usuario.setCorreo(correo);
        usuario.setEdad(edad);
        usuario.setPassword(password);
        usuario.setTelefono(telefono);
        usuario.setNombre(nombre);
        usuario.setUsername(username);

        entityManager.persist(usuario);

        transaction.commit();
    }
}


