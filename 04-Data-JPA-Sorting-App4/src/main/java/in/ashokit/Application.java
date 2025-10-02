package in.ashokit;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		
		//List<Student> students = studentRepository.findAll(Sort.by("gender"));
		//students.forEach(System.out::println);
		
		//List<Student> students = studentRepository.findAll(Sort.by("name"));
		//students.forEach(System.out::println);
		
		List<Student> students = studentRepository.findAll(Sort.by("name").descending());
		students.forEach(System.out::println);
		
		
	}

}
