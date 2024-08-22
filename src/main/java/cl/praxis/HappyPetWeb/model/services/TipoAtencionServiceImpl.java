package cl.praxis.HappyPetWeb.model.services;

import cl.praxis.HappyPetWeb.model.entities.TipoAtencion;
import cl.praxis.HappyPetWeb.model.repositories.TipoAtencionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TipoAtencionServiceImpl implements TipoAtencionService {

  private final TipoAtencionRepository repository;

  public TipoAtencionServiceImpl(TipoAtencionRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<TipoAtencion> findAll() {
    return repository.findAll();
  }
}
