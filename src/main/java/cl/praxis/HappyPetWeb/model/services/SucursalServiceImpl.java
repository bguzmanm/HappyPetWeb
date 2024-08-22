package cl.praxis.HappyPetWeb.model.services;

import cl.praxis.HappyPetWeb.model.entities.Sucursal;
import cl.praxis.HappyPetWeb.model.repositories.SucursalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalServiceImpl implements SucursalService {

  private final SucursalRepository repository;

  public SucursalServiceImpl(SucursalRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Sucursal> findAll() {
    return repository.findAll();
  }
}
