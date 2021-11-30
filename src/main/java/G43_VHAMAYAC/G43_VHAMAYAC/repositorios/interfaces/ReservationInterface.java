package G43_VHAMAYAC.G43_VHAMAYAC.repositorios.interfaces;

import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationInterface extends CrudRepository<Reservation,Long> {
}