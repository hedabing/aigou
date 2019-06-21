package cn.itsource.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//开启euerka的客户端
@EnableEurekaClient
//开启网关
@EnableZuulProxy
public class ZuulApplication1996 {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication1996.class);
    }
}
