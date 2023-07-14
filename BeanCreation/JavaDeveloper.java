package BeanCreation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class JavaDeveloper implements Developers{

	@Override
	public void developApplications() {
		System.out.println(" i am java developer");
		
	}
	
	

}
