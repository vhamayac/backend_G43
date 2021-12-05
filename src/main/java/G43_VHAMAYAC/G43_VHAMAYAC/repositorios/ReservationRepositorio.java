package G43_VHAMAYAC.G43_VHAMAYAC.repositorios;

import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Client;
import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Reservation;
import G43_VHAMAYAC.G43_VHAMAYAC.modelo.custom.CountClient;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.interfaces.ReservationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class ReservationRepositorio<res> extends RepositorioGenericoAbstracto<Reservation,Long> {

    @Autowired
    private ReservationInterface anInterface;

    @Override
    public CrudRepository<Reservation, Long> getDao() {
        return anInterface;
    }

    public List<Reservation> getReservationByStatus(String status) {
        return anInterface.findAllByStatus(status);
    }

    public List<Reservation> getReservationPeriod(Date dateOne, Date dateTwo) {
        return anInterface.findAllByStartDateAfterAndStartDateBefore(dateOne, dateTwo);
    }

    public List<CountClient> getTopClient() {
        List<CountClient> res = new ArrayList<>();

        List<Object[]> report = anInterface.countTotalReservationByClient();

        for(int i=0;i<report.size();i++){
            Client cli = (Client) report.get(i)[0];
            Long cantidad=(Long) report.get(i)[1];
            CountClient cc = new CountClient(cantidad, cli);
            res.add(cc);
        }
        
            return res;
    }
}
