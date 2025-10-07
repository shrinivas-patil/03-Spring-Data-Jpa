package in.ashokit.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passportId;
	
	private String passportNum;
	
	private LocalDate issuedDate;
	
	private LocalDate expiryDatee;
	
	@OneToOne
	@JoinColumn(name = "person_id")
	private Person person;

	public Integer getPassportId() {
		return passportId;
	}

	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}

	public String getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}

	public LocalDate getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}

	public LocalDate getExpiryDatee() {
		return expiryDatee;
	}

	public void setExpiryDatee(LocalDate expiryDatee) {
		this.expiryDatee = expiryDatee;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportNum=" + passportNum + ", issuedDate=" + issuedDate
				+ ", expiryDatee=" + expiryDatee + ", person=" + person + "]";
	}
	
	
}
