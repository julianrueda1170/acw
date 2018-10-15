package colegio.josefelixrestrepo.acw.logica;

import colegio.josefelixrestrepo.acw.basededatos.Administrador;
import colegio.josefelixrestrepo.acw.basededatos.ConexionDatos;
import colegio.josefelixrestrepo.acw.util.ValidacionesUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class AdministradorLogica {

    private ValidacionesUtil validacionesUtil;
    private EntityManager entityManager;

    public AdministradorLogica(){

        validacionesUtil = new ValidacionesUtil();
        entityManager = ConexionDatos.entityManagerFactory.createEntityManager();
    }

    public String registrarAdministrador(String username, String password, String confirmarPassword, String correo){

        if(validacionesUtil.esVacio(username)){

            return "El nombre de usuario no puede ser vacio";
        }

        if(validacionesUtil.esVacio(password)){

            return "El password no puede ser vacio";
        }

        if(validacionesUtil.esVacio(confirmarPassword)){

            return "Confirmar el password no puede ser vacio";
        }

        if(!password.equals(confirmarPassword)){

            return "El password y la confirmacion del password no son iguales";
        }

        if(validacionesUtil.esVacio(correo)){

            return "El correo no puede ser vacio";
        }

        String resultado = "OK";

        try {

            insertarAdministrador(username, password, correo);

        } catch (Exception e) {

            resultado = "No se pudo insertar el administrador, error inesperado";
            e.printStackTrace();
        }

        return resultado;
    }

    private void insertarAdministrador(String username, String password, String correo){

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Administrador administrador = new Administrador();

        administrador.setUsername(username);
        administrador.setPassword(password);
        administrador.setCorreo(correo);

        entityManager.persist(administrador);
        transaction.commit();
    }
}

