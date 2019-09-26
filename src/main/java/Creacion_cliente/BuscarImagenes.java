package Creacion_cliente;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class BuscarImagenes {
    private int cuenta =0;
    public BuscarImagenes(Document doc) throws IOException {

        Elements ele= doc.select("p img");
        int i=0;
        for(;i<=ele.size(); i++){
            cuenta= i;
        }

        System.out.println("Numeros de imagenes: "+ cuenta);



    }



}
