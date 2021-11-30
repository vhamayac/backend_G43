package G43_VHAMAYAC.G43_VHAMAYAC.repositorios;

import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Message;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.interfaces.MessageInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public class MessageRepositorio extends RepositorioGenericoAbstracto<Message,Long>{

    @Autowired
    private MessageInterface anInterface;

    @Override
    public CrudRepository<Message, Long> getDao() {
        return anInterface;
    }
}
