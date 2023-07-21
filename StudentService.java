package SpringRest.TransactionalDummy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


//@Transactional 
@Service // business logic
public class StudentService {

	@Autowired
	StudentRepo stdRepo;
	
	
	//@Transactional (noRollbackFor = RuntimeException.class) //transaction begin // defa atttr --> required
	@Transactional (noRollbackFor = Exception.class)
	public void saveStudentInfo() throws Exception {
		//try {
		for(int ctr = 1; ctr <= 10; ctr++) {
			System.out.println(ctr);
			Student student = new Student();
			student.setGrade(9);
			student.setName("student-"+ctr);
			student.setRollNum(ctr);
			stdRepo.saveStudent(student); // i will reuse the existing tran
			
			if(ctr == 5)
		//		throw new RuntimeException("some error occured..");  //auto rollback should happen
				throw new Exception("some error occured..");
		}
		//}
		/*catch (Exception e) { //auto rollback will disable
			// TODO: handle exception
			e.printStackTrace();
		}*/
	} //commit
}
