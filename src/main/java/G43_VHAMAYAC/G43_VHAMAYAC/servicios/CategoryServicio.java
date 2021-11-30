package G43_VHAMAYAC.G43_VHAMAYAC.servicios;


import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Category;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.CategoryRepositorio;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.RepositorioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryServicio extends ServicioGenericoAbstracto<Category, Long> {

    @Autowired
    private CategoryRepositorio repositorio;

    @Override
    public RepositorioGenericoAbstracto<Category, Long> getRepository() {
        return repositorio;
    }

    @Override
    public Category guardar(Category objeto) {
        if (objeto.getId() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Category> c = obtenerXId(objeto.getId());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Category actualizar(Category objeto) {
        if (objeto.getId() != null) {
            Optional<Category> c = obtenerXId(objeto.getId());
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
