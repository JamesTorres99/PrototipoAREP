/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.app.model;


public class Organization {
    private String name;
    private String ipadress;
    private DatesIp ipdates;

    public String getName() {
        return name;
    }

    public String getIpadress() {
        return ipadress;
    }

    public DatesIp getIpdates() {
        return ipdates;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIpadress(String ipadress) {
        this.ipadress = ipadress;
    }

    public void setIpdates(DatesIp ipdates) {
        this.ipdates = ipdates;
    }
    
    
}
