package eam.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import eam.app.modelo.Department;


@Repository
public interface repositoryDepartment extends JpaRepository<Department, Long>{

}
