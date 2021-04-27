package edu.escuelaing.arep.app.connection;
import java.io.IOException;
/**
 * Interfaz encargada de realizar la conexion directamente con la API.
 */
 public interface HttpConnection {     
    /**
      * Metodo encargado de obtener los datos  de la ip usando el protocolo HTTP.
    */
    String getIpdates(String ip)  throws IOException ;
}
 