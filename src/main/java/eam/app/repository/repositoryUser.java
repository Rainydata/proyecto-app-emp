package eam.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import eam.app.modelo.User;


@Repository
public interface repositoryUser extends JpaRepository<User, Long>{

}
	
