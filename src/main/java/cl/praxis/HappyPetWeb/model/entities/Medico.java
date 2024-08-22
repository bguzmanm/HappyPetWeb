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
public class Medico {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="medico_id")
  private int id;
  @Column(name="medico_rut")
  private String rut;
  @Column(name="medico_nombre")
  private String nombre;
  @Column(name="medico_apellidos")
  private String apellidos;
  @Column(name="medico_email")
  private String email;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name="medico_sucursal",
    joinColumns = @JoinColumn(name="medico_id", referencedColumnName = "medico_id"),
  inverseJoinColumns = @JoinColumn(name="sucursal_id", referencedColumnName = "sucursal_id"))
  List<Sucursal> sucursales;

}
