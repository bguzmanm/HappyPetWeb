package cl.praxis.HappyPetWeb.model.services;

import cl.praxis.HappyPetWeb.model.entities.Atencion;

import java.util.List;

public interface AtencionService {
  List<Atencion> findAll();
  List<Atencion> findBySucursalId(int sucursalId);
  List<Atencion> findByTipoAtencionId(int tipoAtencionId);
  List<Atencion> findBySucursalIdAndTipoAtencionId(int sucursalId, int tipoAtencionId);

}
