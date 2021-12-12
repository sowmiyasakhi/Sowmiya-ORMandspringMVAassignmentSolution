Skip to content
Search or jump to…
Pull requests
Issues
Marketplace
Explore
 
@sowmiyasakhi 
JatinKukade
/
JatinKukade_ORMandSpringMVCAssignmentSolution
Public
Code
Issues
Pull requests
Actions
Projects
Wiki
Security
Insights
JatinKukade_ORMandSpringMVCAssignmentSolution/CustomerRelationshipManagementApplication/src/main/java/com/greatlearning/Customer.java /
@JatinKukade
JatinKukade Add files via upload
Latest commit 5b5a980 7 days ago
 History
 1 contributor
56 lines (49 sloc)  1.2 KB
   
package com.greatlearning;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}
	
	

	
}
© 2021 GitHub, Inc.
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
Loading complete