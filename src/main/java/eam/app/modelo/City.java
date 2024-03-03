package eam.app.modelo;
import org.hibernate.annotations.GeneratorType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.persistence.*;

@SpringBootApplication

@Entity
@Table(name = "City")

public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCity;
	
	@Column(name = "nameCity")
	private String nameCity;
	
	@ManyToOne
	@JoinColumn(name = "idDepartmen",referencedColumnName = "idDepartment")
	private Department department;
	
	
	public City() {
		
	}
	
	public City(String nameCity) {
		this.nameCity = nameCity;
	}

	public long getIdCity() {
		return idCity;
	}

	public void setIdCity(long idCity) {
		this.idCity = idCity;
	}

	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}
	
	
	
}