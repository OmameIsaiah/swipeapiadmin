package swipe.api.admin.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@EnableAdminServer
@SpringBootApplication
@PropertySource(value = "file:/opt/appdocs/springbootadmin/config/application.properties", ignoreResourceNotFound = true)

//@PropertySource(value = "file:C:\\SwipeTech\\Projects\\APPLICATION_PROPERTIES\\springbootadmin\\application.properties", ignoreResourceNotFound = true)

public class SwipeapiadminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwipeapiadminApplication.class, args);
    }

}
