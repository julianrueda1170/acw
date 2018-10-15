package colegio.josefelixrestrepo.acw.main;


import colegio.josefelixrestrepo.acw.basededatos.ConexionDatos;
import colegio.josefelixrestrepo.acw.interfaz.VentanaInicialFrame;


import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;


public class Main {

    public static void main(String args[]) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("acw_datasource");
        ConexionDatos.entityManagerFactory = factory;
        VentanaInicialFrame ventanaInicialFrame = new VentanaInicialFrame();
        ventanaInicialFrame.setVisible(true);
    }
}
