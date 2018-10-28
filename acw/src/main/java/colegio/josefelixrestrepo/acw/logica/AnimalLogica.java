package colegio.josefelixrestrepo.acw.logica;

import colegio.josefelixrestrepo.acw.basededatos.Animal;
import colegio.josefelixrestrepo.acw.basededatos.ConexionDatos;
import colegio.josefelixrestrepo.acw.util.ValidacionesUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class AnimalLogica {

    private ValidacionesUtil validacionesUtil;
    private EntityManager entityManager;

    public AnimalLogica(){

        validacionesUtil = new ValidacionesUtil();
        entityManager = ConexionDatos.entityManagerFactory.createEntityManager();
    }

    public String registrarAnimal(String tipoAnimal, String raza, String edad, String peso, String color, String altura){

        if(validacionesUtil.esVacio(tipoAnimal)){

            return "El tipo de animal no puede ser vacio";
        }

        if(validacionesUtil.esVacio(raza)){

            return "La raza no puede ser vacia";
        }

        if(validacionesUtil.esVacio(edad) || !validacionesUtil.esNumero(edad) || Integer.parseInt(edad) < 0){

            return "La edad del animal debe ser un numero mayor que cero";
        }

        if(validacionesUtil.esVacio(peso) || !validacionesUtil.esNumero(peso) || Integer.parseInt(peso) < 0){

            return "El peso del animal debe ser un numero mayor que cero";
        }

        if(validacionesUtil.esVacio(color)){

            return "El color no puede ser vacio";
        }

        if(validacionesUtil.esVacio(altura) || !validacionesUtil.esNumero(altura) || Integer.parseInt(altura) < 0){

            return "La altura del animal debe ser un numero mayor que cero";
        }

        String resultado = "OK";

        try {

            insertarAnimal(tipoAnimal, raza, edad, peso, color, altura);

        } catch (Exception e) {

            resultado = "No se pudo insertar el animal, error inesperado";
            e.printStackTrace();
        }

        return resultado;

    }

    public List<Animal> obtenerTodosLosAnimales(){

        List<Animal> animales = entityManager.createNamedQuery("obtenerAnimales", Animal.class).getResultList();

        return animales;
    }

    public List<Animal> obtenerTodosLosAnimalesSinAdoptar(){

        List<Animal> animales = entityManager.createNamedQuery("obtenerAnimalesSinUsuario", Animal.class).getResultList();

        return animales;
    }

    public String eliminarAnimal(int codigoAnimal){

        String resultado = "OK";

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try {

            Animal animal = entityManager.find(Animal.class, codigoAnimal);

            entityManager.remove(animal);

            transaction.commit();

        } catch (Exception e) {

            resultado = "No se pudo eliminar la mascota, error inesperado";
            e.printStackTrace();
            transaction.rollback();
        }

        return resultado;
    }

    private void insertarAnimal(String tipoAnimal, String raza, String edad, String peso, String color, String altura){

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Animal animal = new Animal();
        animal.setTipoAnimal(tipoAnimal);
        animal.setRaza(raza);
        animal.setEdad(Integer.parseInt(edad));
        animal.setPeso(Integer.parseInt(peso));
        animal.setColor(color);
        animal.setAltura(Integer.parseInt(altura));

        entityManager.persist(animal);

        transaction.commit();
    }


}
