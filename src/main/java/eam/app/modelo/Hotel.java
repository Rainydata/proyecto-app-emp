package eam.app.modelo;

import java.util.List;

import org.hibernate.annotations.GeneratorType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.persistence.*;

@SpringBootApplication

@Entity
@Table(name = "Hotel")

public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idHotel;

	@Column(name = "nameHotel")
	private String nameHotel;
	
	@Column(name = "addressHotel")
	private String addresHotel;
	
	@Column(name = "classifyHotel")
	private int classifyHotel;
	
	@Column(name = "modscons")
	private String modscons;
	
	@Column(name = "totalRoom")
	private int totalRoom;
	
	@Column(name = "image")
	private byte[] image;
	
	
	@OneToMany(mappedBy = "Guest")
	private List <Guest> Guests;
	
	public Hotel() {
		
	}
	
	public Hotel(String nameHotel, String addressHotel, int classifyHotel, String modscons, int totalRoom
			,byte[] image) {
		this.nameHotel = nameHotel;
		this.addresHotel = addressHotel;
		this.classifyHotel = classifyHotel;
		this.modscons = modscons;
		this.totalRoom = totalRoom;
		this.image = image;
	}

	public long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(long idHotel) {
		this.idHotel = idHotel;
	}

	public String getNameHotel() {
		return nameHotel;
	}

	public void setNameHotel(String nameHotel) {
		this.nameHotel = nameHotel;
	}

	public String getAddresHotel() {
		return addresHotel;
	}

	public void setAddresHotel(String addresHotel) {
		this.addresHotel = addresHotel;
	}

	public int getClassifyHotel() {
		return classifyHotel;
	}

	public void setClassifyHotel(int classifyHotel) {
		this.classifyHotel = classifyHotel;
	}

	public String getModscons() {
		return modscons;
	}

	public void setModscons(String modscons) {
		this.modscons = modscons;
	}

	public int getTotalRoom() {
		return totalRoom;
	}

	public void setTotalRoom(int totalRoom) {
		this.totalRoom = totalRoom;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public List<Guest> getGuests() {
		return Guests;
	}

	public void setGuests(List<Guest> guests) {
		Guests = guests;
	}
	
	
}