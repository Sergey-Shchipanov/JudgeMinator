package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author anshipanov
 */
@Configuration
@ComponentScan(basePackages = "ru.dczm.judgeminator")
@PropertySource({"resources/application.properties"})
public class ApplicationContext {

	@Bean
	public static PropertySourcesPlaceholderConfigurer appProperty() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}