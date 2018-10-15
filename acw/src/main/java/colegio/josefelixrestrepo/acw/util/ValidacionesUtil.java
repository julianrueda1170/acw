package colegio.josefelixrestrepo.acw.util;

public class ValidacionesUtil {

    public boolean esVacio(String valor){

        boolean resultado = valor == null || valor.isEmpty();

        return resultado;
    }

    public boolean esNumero(String valor){

        String regex = "[0-9]+";

        return valor.matches(regex);
    }
}
