package G43_VHAMAYAC.G43_VHAMAYAC.servicios;


import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Score;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.ScoreRepositorio;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.RepositorioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ScoreServicio extends ServicioGenericoAbstracto<Score, Long> {

    @Autowired
    private ScoreRepositorio repositorio;

    @Override
    public RepositorioGenericoAbstracto<Score, Long> getRepository() {
        return repositorio;
    }

    @Override
    public Score guardar(Score objeto) {
        if (objeto.getId() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Score> c = obtenerXId(objeto.getId());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Score actualizar(Score objeto) {
        if (objeto.getId() != null) {
            Optional<Score> c = obtenerXId(objeto.getId());
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

