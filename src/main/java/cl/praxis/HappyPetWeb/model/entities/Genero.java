package cl.praxis.HappyPetWeb.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Genero {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="genero_id")
  private int id;
  @Column(name="genero_descripcion")
  private String descripcion;
}
