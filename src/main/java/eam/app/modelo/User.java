package eam.app.modelo;

import jakarta.persistence.*;

import java.util.List;

import org.aspectj.lang.annotation.control.CodeGenerationHint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

	@SpringBootApplication
	@Entity
	@Table(name = "User")
	public class User {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long idUser;
		
	
		@Column(name = "userName")
		private String userName;
		
		@Column (name = "UserPassword")
		private String UserPassword;
		
		@Column (name = "userEmail")
		private String userEmail;
		
		// relaciones entre clases
		
		@OneToMany(mappedBy = "user")
		private List<Booking> bookings;
		
		@OneToMany(mappedBy = "user")
		private List<Invoice> invoices;
		
		//constructores
		public User() {
		}
		
		public User(String userName, String userPassword, String userEmail) {
			this.userName = userName;
			this.UserPassword = userPassword;
			this.userEmail = userEmail;
			
		
		}

		public long getIdUser() {
			return idUser;
		}

		public void setIdUser(long idUser) {
			this.idUser = idUser;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserPassword() {
			return UserPassword;
		}

		public void setUserPassword(String userPassword) {
			UserPassword = userPassword;
		}

		public String getUserEmail() {
			return userEmail;
		}

		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		public List<Booking> getBookings() {
			return bookings;
		}

		public void setBookings(List<Booking> bookings) {
			this.bookings = bookings;
		}

		public List<Invoice> getInvoices() {
			return invoices;
		}

		public void setInvoices(List<Invoice> invoices) {
			this.invoices = invoices;
		}
	
	}
	
		