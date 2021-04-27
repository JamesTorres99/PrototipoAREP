/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.app.services;

import edu.escuelaing.arep.app.model.DatesIp;


public interface IAppServices { 
    
    public DatesIp getIpdates(String ipadress);
}
