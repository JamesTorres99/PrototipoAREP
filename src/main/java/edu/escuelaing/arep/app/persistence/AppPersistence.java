/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.app.persistence;

import edu.escuelaing.arep.app.model.Organization;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AppPersistence {
    
    
    HashMap<String , List> organizations;
    public AppPersistence(){      
        organizations = new HashMap<>();      
        createMinisterios(); 
        createEmpresas();
        createEducacion();
        createDeportes();
        
    }
    
    private void createMinisterios(){
        Organization m1 = new Organization(); 
        
        m1.setName("Ministerio de Defensa");
        m1.setIpadress("199.83.135.108");
        
        
        Organization m2 = new Organization(); 
        m2.setName("Ministerio de Salud y Proteccion Social");
        m2.setIpadress("186.31.104.171"); 
        
       
        Organization m3 = new Organization(); 
        m3.setName("Ministerio de Educacion Nacional");
        m3.setIpadress("170.254.228.238"); 
        
        
        Organization m4 = new Organization(); 
        m4.setName("Ministerio de Ciencia, Tecnologia e Innovacion");
        m4.setIpadress("54.198.165.25");
     
        ArrayList<Organization> ministerios = new ArrayList<>();
        ministerios.add(m1); 
        ministerios.add(m2); 
        ministerios.add(m3); 
        ministerios.add(m4);
        
        organizations.put("Gobierno", ministerios);
    
    } 
    
    private void createEmpresas(){
       Organization o1 = new Organization(); 
        
        o1.setName("Coltejer");
        o1.setIpadress("155.254.17.72");
        
        
        Organization o2 = new Organization(); 
        o2.setName("ETB");
        o2.setIpadress("201.245.171.129"); 
        
       
        Organization o3 = new Organization(); 
        o3.setName("Nutresa");
        o3.setIpadress("138.197.57.76"); 
        
        
        Organization o4 = new Organization(); 
        o4.setName("Jet");
        o4.setIpadress("138.197.53.117");
     
        Organization o5 = new Organization(); 
        o5.setName("Postobon");
        o5.setIpadress("13.32.86.19"); 
        
        
        Organization o6 = new Organization(); 
        o6.setName("Nequi");
        o6.setIpadress("34.237.186.219");
        
        Organization o7 = new Organization(); 
        o7.setName("Ecopetrol");
        o7.setIpadress("13.107.246.41"); 
        
        Organization o8 = new Organization(); 
        o8.setName("Bancolombia");
        o8.setIpadress("169.62.251.40"); 
        
        
        ArrayList<Organization> industrias = new ArrayList<>();
        industrias.add(o1); 
        industrias.add(o2); 
        industrias.add(o3); 
        industrias.add(o4); 
        industrias.add(o5);
        industrias.add(o6);
        industrias.add(o7);
        industrias.add(o8);
        organizations.put("Industria", industrias);
    
    }
    
    private void createEducacion(){
        Organization o1 = new Organization(); 
        
        o1.setName("ECI");
        o1.setIpadress("3.228.103.136");
        
        
        Organization o2 = new Organization(); 
        o2.setName("Universidad de los Andes");
        o2.setIpadress("34.196.56.131"); 
        
       
        Organization o3 = new Organization(); 
        o3.setName("Universidad del Bosque");
        o3.setIpadress("52.7.68.0"); 
        
        
        Organization o4 = new Organization(); 
        o4.setName("Universidad Militar Nueva Granada");
        o4.setIpadress("45.238.196.146");
     
        ArrayList<Organization> us = new ArrayList<>();
        us.add(o1); 
        us.add(o2); 
        us.add(o3); 
        us.add(o4);
        
        organizations.put("Educacion", us);
    
    
    } 
    
    private void createDeportes(){
        Organization o1 = new Organization(); 
        
        o1.setName("Millonarios");
        o1.setIpadress("45.79.35.201");
        
        
        Organization o2 = new Organization(); 
        o2.setName("Deportivo Independiente Medellin");
        o2.setIpadress("3.16.137.107"); 
        
       
        Organization o3 = new Organization(); 
        o3.setName("Deportivo Cali");
        o3.setIpadress("45.79.29.227"); 
        
        
        Organization o4 = new Organization(); 
        o4.setName("Deportes Tolima");
        o4.setIpadress("144.217.54.18");
     
        ArrayList<Organization> deportes = new ArrayList<>();
        deportes.add(o1); 
        deportes.add(o2); 
        deportes.add(o3); 
        deportes.add(o4);
        
        organizations.put("Equipos",deportes);   
     
    } 
    
    public List<Organization> getOrganizations(String types){     
        return organizations.get(types);
    }
    
}
