package eam.app.modelo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.persistence.*;
@SpringBootApplication

@Entity
@Table(name = "Guest")

public class Guest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idGuest;
	
	@Column(name = "nameGuest")
	private String nameGuest;
	
	@Column(name = "lastnameGuest")
	private String lastnameGuest;
	
	@Column(name = "numGuest")
	private int numGuest;
	
	@ManyToOne
	@JoinColumn(name = "")
	
	
	public Guest() {
		
	}
	
	public Guest(String nameGuest, String lastnameGuest, int numGuest) {
		this.nameGuest = nameGuest;
		this.lastnameGuest = lastnameGuest;
		this.numGuest = numGuest;
	}

	public long getIdGuest() {
		return idGuest;
	}

	public void setIdGuest(long idGuest) {
		this.idGuest = idGuest;
	}

	public String getNameGuest() {
		return nameGuest;
	}

	public void setNameGuest(String nameGuest) {
		this.nameGuest = nameGuest;
	}

	public String getLastnameGuest() {
		return lastnameGuest;
	}

	public void setLastnameGuest(String lastnameGuest) {
		this.lastnameGuest = lastnameGuest;
	}

	public int getNumGuest() {
		return numGuest;
	}

	public void setNumGuest(int numGuest) {
		this.numGuest = numGuest;
	}
	
	
	
}
