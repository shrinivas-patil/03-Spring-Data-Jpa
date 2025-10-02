package in.ashokit;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		
		//Insert Student
		studentRepository.insertStudent(108, "Nitin", "Male",115);
		
		System.out.println("Inserted....");
		
		//update Query id updating
		/*studentRepository.updateStudent("Shrii", 106);
		System.out.println("Updated....");*/
		
		//Delete Query
		/*studentRepository.deleteStudent(106);
		
		System.out.println("Deleted.....");*/
		
		//QueryByExample
		/*Student s = new Student();
		s.setGender("Male");
		//s.setRank(90L);
		
		Example<Student> example = Example.of(s);
		List<Student> students = studentRepository.findAll(example);
		students.forEach(System.out::println);*/
		
		
	}

}
