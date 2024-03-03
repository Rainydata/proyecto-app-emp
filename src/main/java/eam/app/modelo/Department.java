package eam.app.modelo;
import java.util.List;

import org.hibernate.annotations.GeneratorType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.persistence.*;

@SpringBootApplication

@Entity
@Table(name = "Department")

public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDepartment;
	
	@Column(name = "nameDepartment")
	private String nameDepartment;
	
	@OneToMany(mappedBy = "City")
	private List<City> cities;
	
	
	public Department() {
		
	}
	
	public Department(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	public long getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(long idDepartment) {
		this.idDepartment = idDepartment;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
	
}
