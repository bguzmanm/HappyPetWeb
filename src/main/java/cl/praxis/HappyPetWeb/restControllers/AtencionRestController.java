package cl.praxis.HappyPetWeb.restControllers;

import cl.praxis.HappyPetWeb.model.entities.Atencion;
import cl.praxis.HappyPetWeb.model.services.AtencionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/atencion")
public class AtencionRestController {

  private final AtencionService service;

  public AtencionRestController(AtencionService service) {
    this.service = service;
  }

  private HttpStatus status = HttpStatus.OK;

  @GetMapping
  private ResponseEntity<List<Atencion>> filter(
          @RequestParam(value="sucursalId", defaultValue = "0") String sucursalId,
          @RequestParam(value="tipoAtencionId", defaultValue = "0") String tipoAtencionId
  ){
    int sucursalIdInt = Integer.parseInt(sucursalId);
    int tipoAtencionIdInt = Integer.parseInt(tipoAtencionId);

    List<Atencion> listado;

    if (sucursalIdInt != 0 && tipoAtencionIdInt != 0){
      listado = service.findBySucursalIdAndTipoAtencionId(sucursalIdInt, tipoAtencionIdInt);
    } else if (sucursalIdInt != 0){
      listado = service.findBySucursalId(sucursalIdInt);
    } else if (tipoAtencionIdInt != 0){
      listado = service.findByTipoAtencionId(tipoAtencionIdInt);
    } else {
      listado = service.findAll();
    }

    if (listado.isEmpty()){
      status = HttpStatus.NOT_FOUND;
    }

    return new ResponseEntity<List<Atencion>>(listado, status);

  }

}
