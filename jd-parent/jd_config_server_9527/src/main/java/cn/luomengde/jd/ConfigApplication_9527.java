package cn.luomengde.jd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @User: lm
 * @Desc:
 * @Date: 2019/3/27 19:33
 **/
@SpringBootApplication
@EnableEurekaClient // 配置中心需要注册到注册中心，所以是它的客户端
@EnableConfigServer // 它是一个配置中心，是一个服务端
public class ConfigApplication_9527 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication_9527.class);
    }
}
