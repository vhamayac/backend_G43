package G43_VHAMAYAC.G43_VHAMAYAC.repositorios;

import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Category;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.interfaces.CategoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public class CategoryRepositorio extends RepositorioGenericoAbstracto<Category,Long>{

    @Autowired
    private CategoryInterface anInterface;

    @Override
    public CrudRepository<Category, Long> getDao() {
        return anInterface;
    }
}