package cloud.orange.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SVRegApplication {

    public static void main(String[] args) {
        SpringApplication.run(SVRegApplication.class, args);
    }

}

