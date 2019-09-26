package Creacion_cliente;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class FormularioParseado {

    public FormularioParseado(Document doc) throws IOException {

        Document Peticion;
        for (Element htmlparseado: doc.getElementsByTag("form")) {
           if ( htmlparseado.attr("method").equalsIgnoreCase("post"))
           {
               String Url = htmlparseado.absUrl("action");
               Peticion= Jsoup.connect(Url).data("Asignatura: ", "Practica1").header("Matricula", "20161615").post();
               System.out.println("\n Resp. (F): "+Peticion.body().toString());
           }

        }
    }
}
