package SpringRest.TransactionalDummy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository  //gng to interact with db
//studentRepo
public class StudentRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void saveStudent(Student std) {
		System.out.println(std);
		String insertSQL = "INSERT INTO STUDENT VALUES(?,?,?)";
		Object stdVal[] = {std.getRollNum(), std.getName(), std.getGrade()};
		
		jdbcTemplate.update(insertSQL, stdVal);
	}
	
}
