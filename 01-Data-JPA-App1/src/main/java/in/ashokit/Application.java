package in.ashokit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		
		//System.out.println(studentRepository.getClass().getName());
		Student s = new Student();
		
		s.setId(102);
		s.setName("Rani");
		s.setRank(11111);
		s.setGender("Female");
		
		
		studentRepository.save(s);
		
		System.out.println("Record Inserted....");
		
		Student s1 = new Student(103,"Orlen",90l,"Male");
		Student s2 = new Student(104,"Cathy",100l,"Female");
		Student s3 = new Student(105,"Buttler",70l,"Male");
		Student s4 = new Student(106,"Smitha",60l,"Female");
		
		List<Student> students = Arrays.asList(s1,s2,s3,s4);
		
		studentRepository.saveAll(students);
		
		Optional<Student> optional = studentRepository.findById(101);
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		Iterable<Student> findAll = studentRepository.findAll();
		
		//findAll.forEach(System.out::println);
		
		findAll.forEach(st -> System.out.println(st));
		
		if(studentRepository.existsById(503)) {
			studentRepository.deleteById(503);
			System.out.println("Record Deleted");
		} else {
			System.out.println("No Record Found ");
		}
		
		long count = studentRepository.count();
		System.out.println("Records Count "+ count);
		
		System.out.println("Record Delected...");
	}

}
