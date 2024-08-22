package cl.praxis.HappyPetWeb.model.repositories;

import cl.praxis.HappyPetWeb.model.entities.TipoMascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoMascotaRepository extends JpaRepository<TipoMascota, Integer> {
}
