package G43_VHAMAYAC.G43_VHAMAYAC.repositorios;

import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Admin;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.interfaces.AdminInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AdminRepositorio extends RepositorioGenericoAbstracto<Admin,Long>{

    @Autowired
    private AdminInterface anInterface;

    @Override
    public CrudRepository<Admin, Long> getDao() {
        return anInterface;
    }

}
