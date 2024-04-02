package dev.niiad.juha;

import dev.niiad.juha.domain.Planet;
import dev.niiad.juha.domain.Species;
import dev.niiad.juha.repository.PlanetRepository;
import dev.niiad.juha.repository.SpeciesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class JuhaApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(JuhaApplication.class);
	private final SpeciesRepository speciesRepository;
	private final PlanetRepository planetRepository;

	public JuhaApplication(final SpeciesRepository speciesRepository, final PlanetRepository planetRepository) {
		this.speciesRepository = speciesRepository;
		this.planetRepository = planetRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(JuhaApplication.class, args);

		logger.info("Application started");
	}

	@Override
	public void run(String... args) throws Exception {
		Planet planet = new Planet("Earthen", "habitable");

		planetRepository.save(planet);

		speciesRepository.save(new Species(
				"Rola", "similar human form", "omnivores", "klingon", "Jaheed",
				"Rolio", "Clan", 12, 13, 8, 14, planet
		));

		speciesRepository.save(new Species(
				"Marmo", "similar human form", "omnivores", "Dordo", "Goog",
				"Dordolia", "Warlord", 14, 15, 12, 14, planet
		));

		for (Species species : speciesRepository.findAll()) {
			logger.info("Species name: {}, Intelligence: {}", species.getName(), species.getIntelligence());
		}
	}
}
