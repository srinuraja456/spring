package com.nt.app.entity;

import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@ToString
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Student", uniqueConstraints = { @UniqueConstraint(name = "UniqueEmailAndGurdianMbNum", columnNames = { "email_address", "guardianMobileNum" }) })
public class Student
{
    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private long studentId;
    
    private String firstName;
    private String lastNmae;
    
    @Column(name = "email_address", nullable = false)
    private String emailId;
    private String guardianName;
    
    
	private String guardianEmail;
    @Column(name = "guardianMobileNum", nullable = false)
    private String guardianMobile;
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNmae() {
		return lastNmae;
	}
	public void setLastNmae(String lastNmae) {
		this.lastNmae = lastNmae;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getGuardianEmail() {
		return guardianEmail;
	}
	public void setGuardianEmail(String guardianEmail) {
		this.guardianEmail = guardianEmail;
	}
	public String getGuardianMobile() {
		return guardianMobile;
	}
	public void setGuardianMobile(String guardianMobile) {
		this.guardianMobile = guardianMobile;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastNmae=" + lastNmae + ", emailId="
				+ emailId + ", guardianName=" + guardianName + ", guardianEmail=" + guardianEmail + ", guardianMobile="
				+ guardianMobile + "]";
	}
    
    
    
    
    
    
}