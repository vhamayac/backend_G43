package G43_VHAMAYAC.G43_VHAMAYAC.controladores;

import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Lib;
import G43_VHAMAYAC.G43_VHAMAYAC.servicios.LibServicio;
import G43_VHAMAYAC.G43_VHAMAYAC.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Lib")
@CrossOrigin("*")
public class LibApiRest extends ControladorGenericoAbstracto<Lib, Long> {

    @Autowired
    private LibServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Lib, Long> getService() {
        return servicio;
    }
}
