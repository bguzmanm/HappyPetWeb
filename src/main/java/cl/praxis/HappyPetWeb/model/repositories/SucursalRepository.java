package cl.praxis.HappyPetWeb.model.repositories;

import cl.praxis.HappyPetWeb.model.entities.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {
}
