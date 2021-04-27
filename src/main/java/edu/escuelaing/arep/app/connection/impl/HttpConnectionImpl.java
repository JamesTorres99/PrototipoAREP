package edu.escuelaing.arep.app.connection.impl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Service;

import edu.escuelaing.arep.app.connection.HttpConnection;
/**
 * Interfaz encargada de realizar la conexion directamente con la API.
 */
@Service
public class HttpConnectionImpl implements HttpConnection {

    @Override 
    public String getIpdates(String ip) throws IOException{
        String USER_AGENT = "Mozilla/5.0";
        String GET_URL= "https://ipgeolocation.abstractapi.com/v1/?api_key=a1f6f7e5312b4ad4b202d8b0ce5bbaf7&ip_address="+ip;
        URL obj = new URL(GET_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            System.out.println(response.toString());
            return response.toString();
        } else {
        	return null;
        }		
    }
}