package in.ashokit;

import java.util.Arrays;
import java.util.List;

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
		
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		
//		Student s = new Student();
//		
//		Student s1 = new Student(107,"Shrii",105l,"Male");
//		
//		List<Student> students = Arrays.asList(s1);
//		
//		studentRepository.saveAll(students);
		
//		List<Student> maleStudents = studentRepository.findByGender("Male");
//		
//		maleStudents.forEach(System.out::println);
		
//		List<Student> students = studentRepository.findByRankGreaterThanEqual(100l);
//		
//		students.forEach(System.out::println);
		
//		List<Student> students = studentRepository.findByRankLessThanEqual(100l);
//		
//		students.forEach(System.out::println);
		
//		List<Student> students = studentRepository.findByGenderAndRankGreaterThanEqual("male", 100l);
//		
//		students.forEach(System.out::println);
		
		
		//SQL
//		List<Student> student = studentRepository.getAllStudent();
//		student.forEach(System.out::println);
		
		//HQL
//		List<Student> student = studentRepository.getStudent();
//		student.forEach(System.out::println);
		
		List<Student> stu = studentRepository.getMaleStudent();
		stu.forEach(System.out::println);
		
		List<Student> st = studentRepository.getMaleStudentRankGreaterThanEqualTo();
		st.forEach(System.out::println);
		
		List<Student> s = studentRepository.getMaleStudentRankLessThanEqualTo();
		s.forEach(System.out::println);
		
		List<Student> stude = studentRepository.getStudentGenderAndRankGreaterThanEqualTo();
		stude.forEach(System.out::println);
		
		List<Student> studen = studentRepository.getStudentNameAndRankGreaterThanEqualTo();
		studen.forEach(System.out::println);
		
		List<Object[]> rankGenderList = studentRepository.findRankAndGenderRankLessThanEqual100();
		rankGenderList.forEach(arr -> 
		    System.out.println("Rank: " + arr[0] + ", Gender: " + arr[1])
		);

		
	}

}
