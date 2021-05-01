/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.app.services.impl;

import edu.escuelaing.arep.app.connection.HttpConnection;
import edu.escuelaing.arep.app.model.DatesIp;
import edu.escuelaing.arep.app.services.IAppServices;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.json.JSONObject;

@Service
public class ImplAppServices implements IAppServices{

    @Autowired
    HttpConnection con;
    
    @Override
    public DatesIp getIpdates(String ipadress){
        
        try {
             
            String infoIp = con.getIpdates(ipadress);
            
            infoIp = infoIp.replace("null", "\"not found\"");
            
            JSONObject jsonIp = new JSONObject(infoIp);
            
            String city = jsonIp.getString("city");
            
            String country = jsonIp.getString("country");
            
            String region = jsonIp.getString("region"); 
            
            float lon = Float.parseFloat(jsonIp.get("longitude").toString()); 
            
            float lat = Float.parseFloat(jsonIp.get("latitude").toString());
            
            JSONObject jsIpconnection = jsonIp.getJSONObject("connection"); 
            
            String organization = jsIpconnection.getString("organization_name"); 
            
            String isp = jsIpconnection.getString("isp_name"); 
            
            
            DatesIp ip = new DatesIp(lon,lat,city,country,region,organization,isp);
            
            return ip;
            
            
        } catch (IOException ex) { 

            Logger.getLogger(ImplAppServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    
    
}
