package Creacion_cliente;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese Url:");
        Scanner url = new Scanner(System.in);
        String cadena = url.nextLine();
        //Conectar URL

        Document doc = Jsoup.connect(cadena).get();
        String url2= Jsoup.connect(cadena).execute().body();

        ContarLineas reco= new ContarLineas(url2);
        CantidadParrafos cant = new CantidadParrafos(doc);
        BuscarImagenes img = new BuscarImagenes(doc);
    }

}

//Funcion que cuente las lineas de una pagina
