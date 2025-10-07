package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Address;
import in.ashokit.entity.Employee;
import in.ashokit.repository.AddressRepository;
import in.ashokit.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

    private final AddressRepository addressRepository;

    private final EmployeeRepository employeeRepository;

    Application(EmployeeRepository employeeRepository, AddressRepository addressRepository) {
        this.employeeRepository = employeeRepository;
        this.addressRepository = addressRepository;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
		
		AddressRepository addressRepository = context.getBean(AddressRepository.class);
		
		
		Employee e = new Employee();
		e.setEmpName("Raju");
		e.setEmpSalary(40000.00);
		
		Address a1 = new Address();
		a1.setCity("Bngl");
		a1.setState("Karnataka");
		a1.setCountry("India");
		a1.setEmp(e);

		Address a2 = new Address();
		a2.setCity("Hyd");
		a2.setState("TG");
		a2.setCountry("India");
		a2.setEmp(e);

		//setting addresses to employee
		List<Address> asList = Arrays.asList(a1,a2);
		e.setAddr(asList);
		

		
		//employeeRepository.save(e);
		
		//System.out.println("Records Inserted...");
		
		//it will retrieve parent only when fetch type is lazy, when fetch is eager it will retrieve parent + child ,its depending on fetch type
		//employeeRepository.findById(2);
		
		// when we call child class it will retrieve parent also blc it having parent reference  
		addressRepository.findById(3);
		
		//Delete a record when delete parent childs will be deleted blc of cascade.All
//		employeeRepository.deleteById(1);
//		
//		System.out.println("Sucessfully Deleted...");
		
	}

}
