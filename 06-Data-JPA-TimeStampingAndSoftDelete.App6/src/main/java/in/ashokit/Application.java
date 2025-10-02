package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

    private final StudentRepository studentRepository;

    Application(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		
		//SoftDelete
		Student student = studentRepository.findById(101).get();
		student.setActiveSW("N");
		
		studentRepository.save(student);
		
		
		//Insert a Record
//		Student s = new Student(101, "Rani", 100L, "Female", "Y");
//		studentRepository.save(s);
//		
//		System.out.println("Record Saved....");
		
		
	}

}
