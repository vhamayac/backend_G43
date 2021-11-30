package G43_VHAMAYAC.G43_VHAMAYAC.controladores;

import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Reservation;
import G43_VHAMAYAC.G43_VHAMAYAC.servicios.ReservationServicio;
import G43_VHAMAYAC.G43_VHAMAYAC.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin("*")
public class ReservationApiRest extends ControladorGenericoAbstracto<Reservation, Long> {

    @Autowired
    private ReservationServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Reservation, Long> getService() {
        return servicio;
    }
}

