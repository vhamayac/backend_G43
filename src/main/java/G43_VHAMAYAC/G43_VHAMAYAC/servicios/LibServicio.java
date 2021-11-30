package G43_VHAMAYAC.G43_VHAMAYAC.servicios;


import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Lib;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.LibRepositorio;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.RepositorioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibServicio extends ServicioGenericoAbstracto<Lib, Long> {

    @Autowired
    private LibRepositorio repositorio;

    @Override
    public RepositorioGenericoAbstracto<Lib, Long> getRepository() {
        return repositorio;
    }

    @Override
    public Lib guardar(Lib objeto) {
        if (objeto.getId() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Lib> c = obtenerXId(objeto.getId());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Lib actualizar(Lib objeto) {
        if (objeto.getId() != null) {
            Optional<Lib> c = obtenerXId(objeto.getId());
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

