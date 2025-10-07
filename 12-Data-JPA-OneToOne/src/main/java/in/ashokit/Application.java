package in.ashokit;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Passport;
import in.ashokit.entity.Person;
import in.ashokit.repository.PassportRepository;
import in.ashokit.repository.PersonRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
		PersonRepository personRepository = context.getBean(PersonRepository.class);
		
		PassportRepository passportRepository = context.getBean(PassportRepository.class);
		
		//insert data
		Person p = new Person();
		p.setPersonName("Shrii");
		p.setPersonGener("Male");
		
		Passport pp = new Passport();
		pp.setPassportNum("FIYPP0075B");
		pp.setIssuedDate(LocalDate.now());
		pp.setExpiryDatee(LocalDate.now().plusYears(10));
		
		p.setPassport(pp);
		pp.setPerson(p);
		
		personRepository.save(p);
		
		//Retrieve Person with passport blc of onetoone fetch is Eager
		//personRepository.findById(1);
		
		//it will delete person with passport cascade.all
		//personRepository.deleteById(1);
	}

}
