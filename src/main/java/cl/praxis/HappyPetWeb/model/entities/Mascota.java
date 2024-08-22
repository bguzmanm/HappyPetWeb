package cl.praxis.HappyPetWeb.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mascota {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="mascota_id")
  private int id;
  @Column(name="mascota_nombre")
  private String nombre;
  @Column(name="mascota_raza")
  private String raza;

  @ManyToOne
  @JoinColumn(name = "dueno_id")
  private Dueno dueno;

  @ManyToOne
  @JoinColumn(name = "genero_id")
  private Genero genero;

  @ManyToOne
  @JoinColumn(name = "tipo_mascota_id")
  private TipoMascota tipoMascota;
}
