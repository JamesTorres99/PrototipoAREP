/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.app.controllers;

import edu.escuelaing.arep.app.services.IAppServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ipadress")
public class AppAPIController {
    @Autowired
    IAppServices aservices;
    
    @RequestMapping(path ="/{ipadress}",method = RequestMethod.GET)
    public ResponseEntity<?> isLoginUser(@PathVariable ("ipadress") String ipadress){ 
          return new ResponseEntity<>(aservices.getIpdates(ipadress),HttpStatus.ACCEPTED);
       
    } 
    
    @RequestMapping(path ="/orgs/{type}",method = RequestMethod.GET)
    public ResponseEntity<?> getOrgs(@PathVariable ("type") String types){ 
          return new ResponseEntity<>(aservices.getOrganization(types),HttpStatus.ACCEPTED);
       
    } 
    
}
