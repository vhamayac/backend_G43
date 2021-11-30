package G43_VHAMAYAC.G43_VHAMAYAC.repositorios;

import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Client;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.interfaces.ClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public class ClientRepositorio extends RepositorioGenericoAbstracto<Client,Long>{

    @Autowired
    private ClientInterface anInterface;

    @Override
    public CrudRepository<Client, Long> getDao() {
        return anInterface;
    }
}