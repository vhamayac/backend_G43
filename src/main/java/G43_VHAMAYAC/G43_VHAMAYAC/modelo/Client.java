package G43_VHAMAYAC.G43_VHAMAYAC.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String email;
    private String password;
    private String name;
    private Long age;

    @OneToMany(mappedBy = "idMessage", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"client", "lib", "category"})
    List<Message> messages;


    @OneToMany(mappedBy = "idReservation", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"client", "lib"})
    List<Reservation> reservations;

}
