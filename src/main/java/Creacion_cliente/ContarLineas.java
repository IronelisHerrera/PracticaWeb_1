package Creacion_cliente;
import java.io.IOException;

public class ContarLineas {
    private String doc;
    public ContarLineas(String url2) throws IOException {
        // Imprimir valor

        System.out.println("Numero de lineas: "+RecorrerHtmlp(url2));
    }


    //Funcion Contar lineas:
    public static int RecorrerHtmlp(String url2) {
        int i=0;
        int contar=0;
        String[] array;
        array = url2.split("\n");
        contar = array.length;

        return contar;
    }

}