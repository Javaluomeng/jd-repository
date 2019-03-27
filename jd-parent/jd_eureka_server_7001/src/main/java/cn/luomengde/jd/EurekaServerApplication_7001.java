package cn.luomengde.jd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @User: lm
 * @Desc:
 * @Date: 2019/3/26 17:01
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication_7001.class);
    }
}
