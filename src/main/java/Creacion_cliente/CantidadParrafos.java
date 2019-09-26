package Creacion_cliente;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class CantidadParrafos {
    private int cuenta =0;
    public CantidadParrafos(Document doc) throws IOException {
        // Imprimir valor
        Elements ele= doc.select("p");
        int i=0;
        for(;i<=ele.size(); i++){
            cuenta= i;
        }

        System.out.println("Numeros de parrafos: "+ cuenta);


    }



}
