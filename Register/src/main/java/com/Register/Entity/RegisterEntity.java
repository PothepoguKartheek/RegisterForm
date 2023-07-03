package com.Register.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;


@Entity
public class RegisterEntity implements Serializable{
	
	
	
        @Id
        @GenericGenerator(name = "auto",strategy = "increment")
        @GeneratedValue(generator = "auto")
	    private long id;
	
        
        @Column(name = "first_name")
	    private String firstName;
		
        
        @Column(name="contact_number")
		private String contactNumber;
		
        
        @Column(name = "email")
		private String email;
		
        
        @Column(name="password")
		private String password;
		
        
        @Column(name = "country")
		private String country;

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public void setContactName(String contactNumber) {
			this.contactNumber = contactNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}
	

}
