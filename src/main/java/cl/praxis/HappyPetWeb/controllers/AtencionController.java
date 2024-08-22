package cl.praxis.HappyPetWeb.controllers;

import cl.praxis.HappyPetWeb.model.entities.Atencion;
import cl.praxis.HappyPetWeb.model.services.AtencionService;
import cl.praxis.HappyPetWeb.model.services.SucursalService;
import cl.praxis.HappyPetWeb.model.services.TipoAtencionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/atencion")
public class AtencionController {

  private final AtencionService service;
  private final SucursalService sucursalService;
  private final TipoAtencionService tipoAtencionService;

  public AtencionController(AtencionService service, SucursalService sucursalService, TipoAtencionService tipoAtencionService) {
    this.service = service;
    this.sucursalService = sucursalService;
    this.tipoAtencionService = tipoAtencionService;
  }

/*  @GetMapping
  private String findAll(Model model){
    model.addAttribute("sucursales", sucursalService.findAll());
    model.addAttribute("tiposAtencion", tipoAtencionService.findAll());
    model.addAttribute("atenciones", service.findAll());
    return "atencionList";
  }*/

  @GetMapping()
  private String findFilter(
          @RequestParam(value="sucursalId", defaultValue = "0") String sucursalId,
          @RequestParam(value="tipoAtencionId", defaultValue = "0") String tipoAtencionId,
          Model model){

    int sucursalIdInt = Integer.parseInt(sucursalId);
    int tipoAtencionIdInt = Integer.parseInt(tipoAtencionId);

    model.addAttribute("sucursales", sucursalService.findAll());
    model.addAttribute("tiposAtencion", tipoAtencionService.findAll());

    List<Atencion> listado;

    if (sucursalIdInt != 0 && tipoAtencionIdInt != 0){
      listado = service.findBySucursalIdAndTipoAtencionId(sucursalIdInt, tipoAtencionIdInt);
    } else if (sucursalIdInt != 0 && tipoAtencionIdInt == 0){
      listado = service.findBySucursalId(sucursalIdInt);
    } else if (sucursalIdInt == 0 && tipoAtencionIdInt != 0){
      listado = service.findByTipoAtencionId(tipoAtencionIdInt);
    } else {
      listado = service.findAll();
    }

    model.addAttribute("atenciones", listado);
    return "atencionList";
  }


}
