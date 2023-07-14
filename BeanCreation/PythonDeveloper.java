package BeanCreation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PythonDeveloper implements Developers {

	@Override
	public void developApplications() {
	System.out.println(" i create apps by python");
		
	}

}
