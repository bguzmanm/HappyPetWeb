package cl.praxis.HappyPetWeb.model.services;

import cl.praxis.HappyPetWeb.model.entities.Sucursal;

import java.util.List;

public interface SucursalService {
  List<Sucursal> findAll();
}
