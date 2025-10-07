package in.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Student;

//@Repository //Repository  is also optional when you are extending properties from crudRepository
public interface StudentRepository extends CrudRepository<Student, Integer>{
	
//	//select * from student_dtls where student_gender =:gender
//	public List<Student> findByGender(String gender);
//	
//	
//	//select * from student_dtls where student_rank >= : rank
//	public List<Student> findByRankGreaterThanEqual(Long rank);
//	
//	//select * from student_dtls where student_rank <= : rank
//	public List<Student> findByRankLessThanEqual(Long rank);
//	
//	//male student who are having rank >= 100
//	//select * from student_dtls where student_gender=? and stuent_rank >=100
//	public List<Student> findByGenderAndRankGreaterThanEqual(String gender, Long rank);
	
	@Query(value="select * from student_dtls", nativeQuery=true)
	public List<Student> getAllStudent();
	
	@Query("from Student")
	public List<Student> getStudent();
	
	@Query("from Student where gender = 'Male'")
	List<Student> getMaleStudent();
	
	@Query("from Student where rank >= 100")
	List<Student> getMaleStudentRankGreaterThanEqualTo();
	
	@Query("from Student where rank <= 100")
	List<Student> getMaleStudentRankLessThanEqualTo();
	
	@Query("from Student where gender = 'Male' and rank >= 100")
	List<Student> getStudentGenderAndRankGreaterThanEqualTo();
	
	@Query("from Student where name = 'Shrii' and rank >= 100")
	List<Student> getStudentNameAndRankGreaterThanEqualTo();
	
	
	@Query("select rank, gender from Student where rank <= 100")
	List<Object[]> findRankAndGenderRankLessThanEqual100();
	
}
