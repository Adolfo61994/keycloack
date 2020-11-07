package com.tutorial.keycloakbackend.service;

import com.tutorial.keycloakbackend.Repositorio.PersonaRepo;
import com.tutorial.keycloakbackend.model.Persona;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    PersonaRepo personaRepo;
    public PersonaService(PersonaRepo personaRepo){
        this.personaRepo =personaRepo;
    }

    public Iterable<Persona> getAll(){
        return this.personaRepo.findAll();
    }

    public Persona save(Persona p) {
        return this.personaRepo.save(p);
    }


}
