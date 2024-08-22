package cl.praxis.HappyPetWeb.model.repositories;

import cl.praxis.HappyPetWeb.model.entities.Atencion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AtencionRepository extends JpaRepository<Atencion, Integer> {
  List<Atencion> findByTipoAtencionId(int tipoAtencionId);
  List<Atencion> findBySucursalId(int sucursalId);
  List<Atencion> findBySucursalIdAndTipoAtencionId(int sucursalId, int tipoAtencionId);
}
