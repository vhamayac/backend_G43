package G43_VHAMAYAC.G43_VHAMAYAC.servicios;


import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Message;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.MessageRepositorio;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.RepositorioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MessageServicio extends ServicioGenericoAbstracto<Message, Long> {

    @Autowired
    private MessageRepositorio repositorio;

    @Override
    public RepositorioGenericoAbstracto<Message, Long> getRepository() {
        return repositorio;
    }

    @Override
    public Message guardar(Message objeto) {
        if (objeto.getIdMessage() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Message> c = obtenerXId(objeto.getIdMessage());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Message actualizar(Message objeto) {
        if (objeto.getIdMessage() != null) {
            Optional<Message> c = obtenerXId(objeto.getIdMessage());
            if (!c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        } else {
            return objeto;
        }
    }
}