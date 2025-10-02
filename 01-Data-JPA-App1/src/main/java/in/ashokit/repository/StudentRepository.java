package in.ashokit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Student;

//@Repository //Repository  is also optional when you are extending properties from crudRepository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
