package cl.praxis.HappyPetWeb.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TipoAtencion {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="tipo_atencion_id")
  private int id;

  @Column(name="tipo_atencion_descripcion")
  private String descripcion;
}
