package G43_VHAMAYAC.G43_VHAMAYAC.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Libs")
public class Lib {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String target;
    private Long capacity;
    private String description;

    @ManyToOne
    @JoinColumn(name = "id", insertable=false, updatable=false)
    @JsonIgnoreProperties({"libs"})
    private Category category;

    @OneToMany(mappedBy = "idMessage", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"client", "lib", "category"})
    List<Message> messages;

    @OneToMany(mappedBy = "idReservation", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"client", "lib", "category"})
    List<Reservation> reservations;




}
