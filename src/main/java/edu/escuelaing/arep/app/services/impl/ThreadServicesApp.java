/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.app.services.impl;

import edu.escuelaing.arep.app.model.Organization;
import edu.escuelaing.arep.app.services.IAppServices;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadServicesApp extends Thread {
    
    List<Organization> orgs; 
    IAppServices app;
    
    public ThreadServicesApp(List<Organization> orgs,IAppServices app){
        this.orgs=orgs;
        this.app=app; 
    } 
    @Override 
    public void run(){
        
        for (Organization org: orgs){
            org.setIpdates(app.getIpdates(org.getIpadress()));        
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadServicesApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        }
        
        
        
    
    }
    
    
}
