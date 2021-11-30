package G43_VHAMAYAC.G43_VHAMAYAC.controladores;

import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Score;
import G43_VHAMAYAC.G43_VHAMAYAC.servicios.ScoreServicio;
import G43_VHAMAYAC.G43_VHAMAYAC.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Score")
@CrossOrigin("*")
public class ScoreApiRest extends ControladorGenericoAbstracto<Score, Long> {

    @Autowired
    private ScoreServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Score, Long> getService() {
        return servicio;
    }
}
