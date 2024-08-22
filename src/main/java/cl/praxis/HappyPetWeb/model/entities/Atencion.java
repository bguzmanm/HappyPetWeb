package cl.praxis.HappyPetWeb.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="atencion")
public class Atencion {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="atencion_id")
  private int id;
  @Column(name="fecha_realizacion")
  private Date fechaRealizacion;
  @Column(name="fecha_proxima_revision")
  private Date fechaProximaRevision;
  @Column(name="box_atencion")
  private String box;

  @ManyToOne
  @JoinColumn(name = "medico_id")
  private Medico medico;

  @ManyToOne
  @JoinColumn(name = "tipo_atencion_id")
  private TipoAtencion tipoAtencion;

  @ManyToOne
  @JoinColumn(name="sucursal_id")
  private Sucursal sucursal;

  @ManyToOne
  @JoinColumn(name="mascota_id")
  private Mascota mascota;
}
