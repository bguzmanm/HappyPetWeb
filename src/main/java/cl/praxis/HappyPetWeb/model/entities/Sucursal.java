package cl.praxis.HappyPetWeb.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sucursal {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "sucursal_id")
  private int id;
  @Column(name = "sucursal_nombre")
  private String nombre;
  @Column(name = "sucursal_direccion")
  private String direccion;
  @Column(name = "sucursal_telefono")
  private String telefono;

  @ManyToMany(mappedBy = "sucursales")
  private List<Medico> medicos;
}
