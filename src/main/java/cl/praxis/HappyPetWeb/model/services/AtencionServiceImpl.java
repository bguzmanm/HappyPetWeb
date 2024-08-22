package cl.praxis.HappyPetWeb.model.services;

import cl.praxis.HappyPetWeb.model.entities.Atencion;
import cl.praxis.HappyPetWeb.model.repositories.AtencionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtencionServiceImpl implements AtencionService {

  private final AtencionRepository repository;

  public AtencionServiceImpl(AtencionRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Atencion> findAll() {
    return repository.findAll();
  }

  @Override
  public List<Atencion> findBySucursalId(int sucursalId) {
    return repository.findBySucursalId(sucursalId);
  }

  @Override
  public List<Atencion> findByTipoAtencionId(int tipoAtencionId) {
    return repository.findByTipoAtencionId(tipoAtencionId);
  }

  @Override
  public List<Atencion> findBySucursalIdAndTipoAtencionId(int sucursalId, int tipoAtencionId) {
    return repository.findBySucursalIdAndTipoAtencionId(sucursalId, tipoAtencionId);
  }
}
