package in.ashokit.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer personId;
	
	private String personName;
	
	private String personGener;
	
	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private Passport passport;

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonGener() {
		return personGener;
	}

	public void setPersonGener(String personGener) {
		this.personGener = personGener;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personGener=" + personGener
				+ ", passport=" + passport + "]";
	}

	
}
