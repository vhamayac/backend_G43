package G43_VHAMAYAC.G43_VHAMAYAC.controladores;

import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Reservation;
import G43_VHAMAYAC.G43_VHAMAYAC.modelo.custom.CountClient;
import G43_VHAMAYAC.G43_VHAMAYAC.modelo.custom.StatusRes;
import G43_VHAMAYAC.G43_VHAMAYAC.servicios.ReservationServicio;
import G43_VHAMAYAC.G43_VHAMAYAC.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/report-status")
    public StatusRes reporStatus() {
        return servicio.getStatusReport();
    }

    @GetMapping("/report-clients")
    public List<CountClient> reporClient() {
        return servicio.getTopClientesReport();
    }

    @GetMapping("/report-dates/{dateOne}/{dateTwo}")
    public List<Reservation> reporDate(@PathVariable("dateOne") String d1, @PathVariable("dateTwo") String d2) {
        return servicio.getReservationPeriodReport(d1, d2);

    }

}