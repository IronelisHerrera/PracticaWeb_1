package Creacion_cliente;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
public class Input {

    public Input(Document doc) throws IOException {
        //campos del input y su tipo
        int i=1;

        System.out.println("\n TIPOS DE INPUTS  ");
        for (Element FormBuscar: doc.getElementsByTag("form")
             ) {
            for (Element inputsBuscar : FormBuscar.getElementsByTag("input")
                 ) {
                System.out.println("Formulario #: "+ i + " Tipo: "+inputsBuscar.attr("type").toLowerCase());

            }
            i++;
        }



    }



}
