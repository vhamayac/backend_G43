package G43_VHAMAYAC.G43_VHAMAYAC.controladores;

import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Admin;
import G43_VHAMAYAC.G43_VHAMAYAC.servicios.AdminServicio;
import G43_VHAMAYAC.G43_VHAMAYAC.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Admin")
@CrossOrigin("*")
public class AdminApiRest extends ControladorGenericoAbstracto<Admin, Long> {

    @Autowired
    private AdminServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Admin, Long> getService() {
        return servicio;
    }
}
