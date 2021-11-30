package G43_VHAMAYAC.G43_VHAMAYAC.repositorios;

import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Score;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.interfaces.ScoreInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public class ScoreRepositorio extends RepositorioGenericoAbstracto<Score,Long>{

    @Autowired
    private ScoreInterface anInterface;

    @Override
    public CrudRepository<Score, Long> getDao() {
        return anInterface;
    }
}
