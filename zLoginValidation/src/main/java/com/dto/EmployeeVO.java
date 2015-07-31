package com.dto;

import java.io.Serializable;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EmployeeVO implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
     
	    @Size(min = 3, max = 20)
	    private String firstName;
	     
	    @Size(min = 3, max = 20)
	    private String lastName;
	     
	    @Pattern(regexp=".+@.+\\.[a-z]+")
	    private String email;
	 
	 
	    /**
		 * @return the id
		 */
		public Integer getId() {
			return id;
		}


		/**
		 * @param id the id to set
		 */
		public void setId(Integer id) {
			this.id = id;
		}


		/**
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}


		/**
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}


		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}


		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}


		@Override
	    public String toString() {
	        return "EmployeeVO [id=" + id + ", firstName=" + firstName
	                + ", lastName=" + lastName + ", email=" + email + "]";
	    }

}
