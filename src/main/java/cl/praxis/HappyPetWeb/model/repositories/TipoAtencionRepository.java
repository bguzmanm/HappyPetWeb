package cl.praxis.HappyPetWeb.model.repositories;

import cl.praxis.HappyPetWeb.model.entities.TipoAtencion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoAtencionRepository extends JpaRepository<TipoAtencion, Integer> {
}
