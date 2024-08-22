package cl.praxis.HappyPetWeb.model.repositories;

import cl.praxis.HappyPetWeb.model.entities.Dueno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DuenoRepository extends JpaRepository<Dueno, Integer> {
}
