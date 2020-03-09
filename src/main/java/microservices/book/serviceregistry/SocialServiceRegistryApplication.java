package microservices.book.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SocialServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialServiceRegistryApplication.class, args);
	}

}
