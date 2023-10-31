
package Utilit;

public class Util {
    public static String removeMascara(String campo) {
        String campoAux = campo.replace(".", "");
        campoAux = campoAux.replace("-", "");
        campoAux = campoAux.replace("/", "");
        campoAux = campoAux.replace("(", "");
        campoAux = campoAux.replace(")", "");
        campoAux = campoAux.replace(",", "");
        campoAux = campoAux.replace("_", "");
        campoAux = campoAux.replace(":", "");
        campoAux = campoAux.replace(" ", "");
        return campoAux;
    }

    public static String removeMascaraNumerica(String campo) {
        String campoAux = campo.replace(".", "");
        campoAux = campoAux.replace(",", ".");
        campoAux = campoAux.replace("R$", "");
        campoAux = campoAux.replace(" ", "");

        return campoAux;
    }
}
