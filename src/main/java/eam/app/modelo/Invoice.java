package eam.app.modelo;
import jakarta.persistence.*;

import java.util.Date;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@Entity
@Table(name = "Invoice")
public class Invoice {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idInvoice;
	
	@Column(name = "bookingInvoice")
	private long bookingInvoice;
	
	@Column(name = "dateInvoice")
	private Date dateInvoice;
	
	public Invoice() {
		
	}
	
	public Invoice(long bookingInvoice, Date dateInvoice) {
		this.bookingInvoice = bookingInvoice;
		this.dateInvoice = dateInvoice;
	}
	public long getIdInvoice() {
		return idInvoice;
	}

	public void setIdInvoice(long idInvoice) {
		this.idInvoice = idInvoice;
	}

	public long getBookingInvoice() {
		return bookingInvoice;
	}

	public void setBookingInvoice(long bookingInvoice) {
		this.bookingInvoice = bookingInvoice;
	}

	public Date getDateInvoice() {
		return dateInvoice;
	}

	public void setDateInvoice(Date dateInvoice) {
		this.dateInvoice = dateInvoice;
	}

	
}
