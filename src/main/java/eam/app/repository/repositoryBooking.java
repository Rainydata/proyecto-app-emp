package eam.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import eam.app.modelo.Booking;


@Repository
public interface repositoryBooking extends JpaRepository<Booking, Long>{

}
