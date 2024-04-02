package dev.niiad.juha.repository;

import dev.niiad.juha.domain.Planet;
import org.springframework.data.repository.CrudRepository;

public interface PlanetRepository extends CrudRepository<Planet, Integer> {}
