package Creacion_cliente;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Formulario {
    private int cuenta=0;
    public Formulario(Document doc) throws IOException {

        System.out.println("Numero metodos get: "+MetodoGet(doc)+ "\nNumero metodos Post: "+MetodoPOST(doc));
    }

    public static int MetodoGet(Document doc){
        int gettag=0;
        int valorGet=0;
        for (Element get: doc.getElementsByTag("form")
        ) {
            if(get.attr("method").equalsIgnoreCase("get"))

                gettag++;
                valorGet=gettag;
        }
        return gettag;
    }
    public static int MetodoPOST(Document doc){
        int getpost=0;
        int valorPost=0;
        for (Element get: doc.getElementsByTag("form")
        ) {
            if(get.attr("method").equalsIgnoreCase("POST"))

                getpost++;
                valorPost=getpost;
        }
        return valorPost;
    }
}

