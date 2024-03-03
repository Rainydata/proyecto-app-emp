package eam.app.modelo;
import org.hibernate.annotations.GeneratorType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.persistence.*;

@SpringBootApplication

@Entity
@Table(name = "Room")

public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idRoom;
	
	@Column(name = "numRoom")
	private int numRoom;
	
	@Column(name = "typeRoom")
	private String typeroom;
	
	@Column(name = "priceNight")
	private float priceNight;
	
	@Column(name = "availability")
	private boolean availability;
	
	@Column (name = "modsconsdetails")
	private String modsconsdetails;
	
	public Room() {
		
	}
	
	public Room(int numRoom, String typeRoom, float priceNight,
			boolean availability, String modsconsdetails){
		
		this.numRoom = numRoom;
		this.typeroom = typeRoom;
		this.priceNight = priceNight;
		this.availability = availability;
		this.modsconsdetails = modsconsdetails;
	}

	public long getIdRoom() {
		return idRoom;
	}

	public void setIdRoom(long idRoom) {
		this.idRoom = idRoom;
	}

	public int getNumRoom() {
		return numRoom;
	}

	public void setNumRoom(int numRoom) {
		this.numRoom = numRoom;
	}

	public String getTyperoom() {
		return typeroom;
	}

	public void setTyperoom(String typeroom) {
		this.typeroom = typeroom;
	}

	public float getPriceNight() {
		return priceNight;
	}

	public void setPriceNight(float priceNight) {
		this.priceNight = priceNight;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public String getModsconsdetails() {
		return modsconsdetails;
	}

	public void setModsconsdetails(String modsconsdetails) {
		this.modsconsdetails = modsconsdetails;
	}
	
	


}
