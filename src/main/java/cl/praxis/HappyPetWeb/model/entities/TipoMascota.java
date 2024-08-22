package cl.praxis.HappyPetWeb.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TipoMascota {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="tipo_mascota_id")
  private int id;
  @Column(name="tipo_mascota_descripcion")
  private String descripcion;
}
