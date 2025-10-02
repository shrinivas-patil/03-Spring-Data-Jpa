package in.ashokit;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

    private final StudentRepository studentRepository;

    Application(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		
		StudentRepository studentRepository = context.getBean(StudentRepository.class);

//		List<Student> students = studentRepository.findAll();
//		students.forEach(System.out::println);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Page Number");
		
		int pageNo = s.nextInt();
		
		int pageSize = 3;
		
		PageRequest page = PageRequest.of(pageNo-1, pageSize);
		Page<Student> findAll = studentRepository.findAll(page);
		List<Student> students1 = findAll.getContent();
		students1.forEach(System.out::println);
	}

}
