package G43_VHAMAYAC.G43_VHAMAYAC.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Lib implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 250)
    private String name;
    @Column(length = 45)
    private String target;
    private Integer capacity;
    @Column(length = 250)
    private String description;
    @ManyToOne
    @JoinColumn(name="category")
    @JsonIgnoreProperties("libs")
    private Category category;
    @OneToMany(cascade={CascadeType.PERSIST},mappedBy="lib")
    @JsonIgnoreProperties({"category","lib","client"})
    private List<Message> messages;
    @OneToMany(cascade={CascadeType.PERSIST},mappedBy="lib")
    @JsonIgnoreProperties("lib")
    private List<Reservation> reservations;
}
