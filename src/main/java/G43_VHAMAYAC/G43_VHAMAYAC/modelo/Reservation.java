package G43_VHAMAYAC.G43_VHAMAYAC.modelo;

import java.io.Serializable;
import java.sql.ClientInfoStatus;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.*;

@Entity
@Data
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private Date startDate;
    private Date devolutionDate;
    @Column(length = 10)
    private String status;
    @ManyToOne
    @JoinColumn(name="lib")
    @JsonIgnoreProperties("reservations")
    private Lib lib;
    @ManyToOne
    @JoinColumn(name="client")
    @JsonIgnoreProperties({"messages","reservations"})
    private Client client;
    @ManyToOne
    private Score score;

}
