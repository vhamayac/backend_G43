package G43_VHAMAYAC.G43_VHAMAYAC.controladores;

import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Client;
import G43_VHAMAYAC.G43_VHAMAYAC.servicios.ClientServicio;
import G43_VHAMAYAC.G43_VHAMAYAC.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin("*")
public class ClientApiRest extends ControladorGenericoAbstracto<Client, Long> {

    @Autowired
    private ClientServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Client, Long> getService() {
        return servicio;
    }
}