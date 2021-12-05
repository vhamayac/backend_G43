package G43_VHAMAYAC.G43_VHAMAYAC.modelo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Score implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer calificacion;
    @Column(length = 250)
    private String mensaje;
    @ManyToOne
    private Reservation reservations;

}
