package cl.praxis.HappyPetWeb.model.repositories;

import cl.praxis.HappyPetWeb.model.entities.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Integer> {
}
