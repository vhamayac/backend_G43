package G43_VHAMAYAC.G43_VHAMAYAC.modelo;

import lombok.Data;
import org.hibernate.service.spi.InjectService;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Admin")
public class Admin {

    @Id
    private Long id;
    private String name;
    private String password;
    private String email;

}
