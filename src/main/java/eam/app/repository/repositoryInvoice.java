package eam.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import eam.app.modelo.Invoice;


@Repository
public interface repositoryInvoice extends JpaRepository<Invoice, Long>{

}
