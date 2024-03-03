package eam.app.modelo;
import jakarta.persistence.*;


import java.util.Date;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@Entity
@Table(name = "Booking")

public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idBooking;

	@Column(name = "guestBooking")
	private long guestBooking;
	
	@Column(name = "hotelBooking")
	private long hotelBooking;
	
	@Column(name = "entryDate")
	private Date entryDate;
	
	@Column(name = "exitDate")
	private Date  exitDate;
	
	@Column(name = "stateBooking")
	private boolean stateBooking;
	
	@Column(name = "priceBooking")
	private float priceBooking;
	
	public Booking() {
		
	}
	
	public Booking(long guestBooking, long hotelBooking,
			Date entryDate, Date exitDate, boolean stateBooking,
			float priceBooking) {
		this.guestBooking = guestBooking;
		this.hotelBooking = hotelBooking;
		this.entryDate = entryDate;
		this.exitDate = exitDate;
		this.stateBooking = stateBooking;
		this.priceBooking = priceBooking; 
	}

	public long getIdBooking() {
		return idBooking;
	}

	public void setIdBooking(long idBooking) {
		this.idBooking = idBooking;
	}

	public long getGuestBooking() {
		return guestBooking;
	}

	public void setGuestBooking(long guestBooking) {
		this.guestBooking = guestBooking;
	}

	public long getHotelBooking() {
		return hotelBooking;
	}

	public void setHotelBooking(long hotelBooking) {
		this.hotelBooking = hotelBooking;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getExitDate() {
		return exitDate;
	}

	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}

	public boolean isStateBooking() {
		return stateBooking;
	}

	public void setStateBooking(boolean stateBooking) {
		this.stateBooking = stateBooking;
	}

	public float getPriceBooking() {
		return priceBooking;
	}

	public void setPriceBooking(float priceBooking) {
		this.priceBooking = priceBooking;
	}
	}
