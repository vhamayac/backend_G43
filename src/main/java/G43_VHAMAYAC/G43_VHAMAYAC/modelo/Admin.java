package G43_VHAMAYAC.G43_VHAMAYAC.modelo;

import lombok.Data;
import org.hibernate.service.spi.InjectService;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 250)
    private String nombre;
    @Column(length = 45)
    private String correo;
    @Column(length = 45)
    private String password;

}
