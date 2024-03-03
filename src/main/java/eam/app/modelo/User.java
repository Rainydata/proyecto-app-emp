package eam.app.modelo;

import jakarta.persistence.*;

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
		
		
		@ManyToOne
		@JoinColumn(name = "idRol", referencedColumnName = "idRol")
		private User user;
		
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

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
		
		
		
	}
	
		