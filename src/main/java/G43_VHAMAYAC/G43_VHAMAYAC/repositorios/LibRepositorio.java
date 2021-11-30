package G43_VHAMAYAC.G43_VHAMAYAC.repositorios;

import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Lib;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.interfaces.LibInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public class LibRepositorio extends RepositorioGenericoAbstracto<Lib,Long>{

    @Autowired
    private LibInterface anInterface;

    @Override
    public CrudRepository<Lib, Long> getDao() {
        return anInterface;
    }
}
