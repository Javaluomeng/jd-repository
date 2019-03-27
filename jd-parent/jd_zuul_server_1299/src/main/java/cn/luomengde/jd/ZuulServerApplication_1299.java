package cn.luomengde.jd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @User: lm
 * @Desc:
 * @Date: 2019/3/26 17:26
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulServerApplication_1299 {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication_1299.class);
    }
}
