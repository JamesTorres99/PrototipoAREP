/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.app.model;


public class DatesIp {
    private float lon;
    private float lat;
    private String city; 
    private String country;
    private String region;
    private String organitation_name;
    private String isp_name;

    public DatesIp(float lon, float lat, String city, String country, String region, String organitation_name, String isp_name) {
        this.lon = lon;
        this.lat = lat;
        this.city = city;
        this.country = country;
        this.region = region;
        this.organitation_name = organitation_name;
        this.isp_name = isp_name;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRegion(String region) {
        this.region = region;
    }


    
    
    public float getLon() {
        return lon;
    }

    public float getLat() {
        return lat;
    }

    public String getCity() {
        return city;
    }

    public String getOrganitation_name() {
        return organitation_name;
    }

    public String getIsp_name() {
        return isp_name;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setOrganitation_name(String organitation_name) {
        this.organitation_name = organitation_name;
    }

    public void setIsp_name(String isp_name) {
        this.isp_name = isp_name;
    }
      
    
    
    
}
