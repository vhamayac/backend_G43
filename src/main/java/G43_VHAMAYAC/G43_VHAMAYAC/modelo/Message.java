package G43_VHAMAYAC.G43_VHAMAYAC.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMessage;
    private String messageText;
    //@OneToMany(cascade={CascadeType.PERSIST},mappedBy="messages")
    @ManyToOne
    @JoinColumn(name="lib")
    @JsonIgnoreProperties({"client","messages","reservations"})
    private Lib lib;
    @ManyToOne
    @JoinColumn(name="client")
    @JsonIgnoreProperties({"messages","reservations"})
    private Client client;



}
