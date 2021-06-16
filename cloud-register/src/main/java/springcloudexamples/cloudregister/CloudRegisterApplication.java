package springcloudexamples.cloudregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //表示该项目作为 服务注册中心
public class CloudRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudRegisterApplication.class, args);
    }

}
