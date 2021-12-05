package G43_VHAMAYAC.G43_VHAMAYAC.repositorios.interfaces;

import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Reservation;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

public interface ReservationInterface extends CrudRepository<Reservation,Long> {

    //JPQL
    @Query("SELECT c.client, COUNT(c.client) FROM Reservation AS c GROUP BY c.client ORDER BY COUNT(c.client) DESC")
    public List<Object[]> countTotalReservationByClient();

    public List<Reservation> findAllByStartDateAfterAndStartDateBefore(Date startDate1, Date startDate2);

    public List<Reservation> findAllByStatus(String status);


}