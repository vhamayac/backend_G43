package G43_VHAMAYAC.G43_VHAMAYAC.servicios;


import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Client;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.ClientRepositorio;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.RepositorioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientServicio extends ServicioGenericoAbstracto<Client, Long> {

    @Autowired
    private ClientRepositorio repositorio;

    @Override
    public RepositorioGenericoAbstracto<Client, Long> getRepository() {
        return repositorio;
    }

    @Override
    public Client guardar(Client objeto) {
        if (objeto.getIdClient() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Client> c = obtenerXId(objeto.getIdClient());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Client actualizar(Client objeto) {
        if (objeto.getIdClient() != null) {
            Optional<Client> c = obtenerXId(objeto.getIdClient());
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