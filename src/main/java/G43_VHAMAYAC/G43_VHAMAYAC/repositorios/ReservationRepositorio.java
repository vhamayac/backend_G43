package G43_VHAMAYAC.G43_VHAMAYAC.repositorios;

import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Reservation;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.interfaces.ReservationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationRepositorio extends RepositorioGenericoAbstracto<Reservation,Long>{

    @Autowired
    private ReservationInterface anInterface;

    @Override
    public CrudRepository<Reservation, Long> getDao() {
        return anInterface;
    }
}
