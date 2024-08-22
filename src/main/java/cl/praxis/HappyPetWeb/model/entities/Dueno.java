package cl.praxis.HappyPetWeb.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dueno {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="dueno_id")
  private int id;
  @Column(name="dueno_rut")
  private String rut;
  @Column(name="dueno_nombre")
  private String nombre;
  @Column(name="dueno_apellidos")
  private String apellidos;
  @Column(name="dueno_email")
  private String email;
}
