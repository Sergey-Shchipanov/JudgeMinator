package main;

import dao.MongoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author anshipanov
 */
@Configuration
@ImportResource({"classpath:app.xml"})
@Import({
        MongoConfiguration.class,
        SwaggerConfiguration.class,
})
public class AppConfiguration {
}
