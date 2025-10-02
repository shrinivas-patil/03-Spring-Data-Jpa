package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Student;

//@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	

}
