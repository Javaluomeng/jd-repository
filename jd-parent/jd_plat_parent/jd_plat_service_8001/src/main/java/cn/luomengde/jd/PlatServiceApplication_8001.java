package cn.luomengde.jd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @User: lm
 * @Desc: 直接去配置中心读取配置文件，只需要引入对应的包，修改bootstrap.yml 的配置文件即可
 * @Date: 2019/3/26 17:20
 **/
@SpringBootApplication
@EnableEurekaClient
public class PlatServiceApplication_8001 {
    public static void main(String[] args) {
        SpringApplication.run(PlatServiceApplication_8001.class);
    }
}
