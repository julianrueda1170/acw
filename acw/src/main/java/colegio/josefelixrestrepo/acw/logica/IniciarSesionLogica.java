package colegio.josefelixrestrepo.acw.logica;

import colegio.josefelixrestrepo.acw.basededatos.Administrador;
import colegio.josefelixrestrepo.acw.basededatos.ConexionDatos;
import colegio.josefelixrestrepo.acw.basededatos.Usuario;
import colegio.josefelixrestrepo.acw.util.ValidacionesUtil;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

public class IniciarSesionLogica {

    private ValidacionesUtil validacionesUtil;
    private EntityManager entityManager;

    public IniciarSesionLogica(){

        validacionesUtil = new ValidacionesUtil();
        entityManager = ConexionDatos.entityManagerFactory.createEntityManager();
    }

    public Administrador iniciarSesionConAdministrador(String usuario, String password) throws Exception {

        String validar = validarDatos(usuario, password);

        Administrador administrador = null;

        if(validar.equals("OK")){

            try {

                administrador = entityManager.createNamedQuery("obtenerAdministradorPorUsuarioYContrasenia", Administrador.class)
                        .setParameter("username", usuario)
                        .setParameter("password", password)
                        .getSingleResult();

            } catch (NoResultException e) {

                administrador = null;
            }
        }
        else
        {
            throw new Exception(validar);
        }

        return administrador;

    }

    public Usuario iniciarSesionConUsuario(String username, String password) throws Exception{

        String validar = validarDatos(username, password);

        Usuario usuario = null;

        if(validar.equals("OK")){

            try {

                usuario = entityManager.createNamedQuery("obtenerUsuarioPorUsernameYContrasenia", Usuario.class)
                        .setParameter("username", username)
                        .setParameter("password", password)
                        .getSingleResult();

            } catch (NoResultException e) {

                usuario = null;
            }
        }
        else
        {
            throw new Exception(validar);
        }

        return usuario;
    }

    private String validarDatos(String usuario, String password){

        String resultado = "OK";

        if(validacionesUtil.esVacio(usuario)){

            return "El nombre de usuario no puede ser vacio";
        }

        if(validacionesUtil.esVacio(password)){

            return "El password no puede ser vacio";
        }

        return resultado;
    }

}
