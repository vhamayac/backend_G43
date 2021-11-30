package G43_VHAMAYAC.G43_VHAMAYAC.controladores;

import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Message;
import G43_VHAMAYAC.G43_VHAMAYAC.servicios.MessageServicio;
import G43_VHAMAYAC.G43_VHAMAYAC.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin("*")
public class MessageApiRest extends ControladorGenericoAbstracto<Message, Long> {

    @Autowired
    private MessageServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Message, Long> getService() {
        return servicio;
    }
}

