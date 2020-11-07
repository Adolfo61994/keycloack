package com.tutorial.keycloakbackend.Repositorio;

import com.tutorial.keycloakbackend.model.Persona;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonaRepo extends PagingAndSortingRepository<Persona, Integer> {
}
