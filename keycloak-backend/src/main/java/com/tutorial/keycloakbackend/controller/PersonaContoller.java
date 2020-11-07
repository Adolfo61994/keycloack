package com.tutorial.keycloakbackend.controller;


import com.tutorial.keycloakbackend.model.Persona;
import com.tutorial.keycloakbackend.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping( value = "/foo", produces = MediaType.APPLICATION_JSON_VALUE)

public class PersonaContoller {
    @Autowired
    PersonaService personaService;

    @GetMapping("/list")
    @RolesAllowed("backend-user")
    public ResponseEntity getAll() {
        return new ResponseEntity( personaService.getAll(), HttpStatus.OK);
    }

    @RolesAllowed("backend-admin")
    @PostMapping("/create")
    public ResponseEntity save(
            @RequestBody Persona persona
    )
    {
        return new ResponseEntity<>( personaService.save(persona), HttpStatus.OK);
    }


}
