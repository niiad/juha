package dev.niiad.juha.repository;

import dev.niiad.juha.domain.Species;
import org.springframework.data.repository.CrudRepository;

public interface SpeciesRepository extends CrudRepository<Species, Long> {}
