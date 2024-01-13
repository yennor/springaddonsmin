package li.rmm.hebammenthurgauhotline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@ConfigurationPropertiesScan
public class HebammenThurgauHotlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(HebammenThurgauHotlineApplication.class, args);
	}

}
