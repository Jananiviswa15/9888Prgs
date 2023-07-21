package SpringRest.TransactionalDummy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main(String[] args) throws Exception
    {
       ApplicationContext appContext = new AnnotationConfigApplicationContext(StudentConfig.class);
       //go to config, read all control, compo, repo , and inject di
       StudentService stdServ = appContext.getBean("studentService", StudentService.class);
       stdServ.saveStudentInfo();
    }
}
