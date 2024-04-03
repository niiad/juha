package dev.niiad.juha.controller;

import dev.niiad.juha.domain.Species;
import dev.niiad.juha.repository.SpeciesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeciesController {
    private final SpeciesRepository speciesRepository;

    public SpeciesController(final SpeciesRepository speciesRepository) {
        this.speciesRepository = speciesRepository;
    }

    @GetMapping("/species")
    public Iterable<Species> getSpecies() {
        return speciesRepository.findAll();
    }
}
