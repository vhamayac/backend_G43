package G43_VHAMAYAC.G43_VHAMAYAC.modelo;

import java.util.Date;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Score")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private String stars;
    private Date date;

}
