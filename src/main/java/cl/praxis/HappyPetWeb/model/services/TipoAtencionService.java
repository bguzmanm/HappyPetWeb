package cl.praxis.HappyPetWeb.model.services;

import cl.praxis.HappyPetWeb.model.entities.TipoAtencion;

import java.util.List;

public interface TipoAtencionService {
  List<TipoAtencion> findAll();
}
