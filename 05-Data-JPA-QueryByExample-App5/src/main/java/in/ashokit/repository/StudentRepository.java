package in.ashokit.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Student;
import jakarta.transaction.Transactional;

//@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	//non select custom query
	@Query("delete from Student where id = :sid")
	@Modifying
	@Transactional
	public void deleteStudent(Integer sid);
	
	//non select Custom Query
	@Query("update Student set id=:sid where name=:sname")
	@Modifying
	@Transactional
	public void updateStudent(String sname, Integer sid);
	
	//Native SQL Query
	@Query(value = "insert into student_dtls(student_id,student_name,student_gender,student_rank) "
			+ "values(:id, :name, :gender, :rank)", nativeQuery = true)
	@Modifying
	@Transactional
	public void insertStudent(Integer id, String name, String gender, Integer rank);
	
	@Query("from Student")
	public void selectStudent();
}
