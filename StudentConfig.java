package SpringRest.TransactionalDummy;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration  //act as  conf file , replacemnet of xml
@ComponentScan(basePackages = "SpringRest.TransactionalDummy")
@EnableTransactionManagement
public class StudentConfig {
	
	@Bean
	public DataSource  datasource() {
		return new DriverManagerDataSource("jdbc:mysql://127.0.0.1:3306/transactiondb",
				"root", "Ragul@123" );
	}

	@Bean
	public JdbcTemplate createJdbcTemplate() {		
		return new JdbcTemplate(datasource());
	}
	
	@Bean
	public TransactionManager createTransactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(datasource()); 
	}
}
