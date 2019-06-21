package cn.itsourec.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 配置类/启动类
 */
@SpringBootApplication
//开启eureka服务端
@EnableEurekaServer
public class EuerkaApplication7001 {
    public static void main(String[] args) {
        SpringApplication.run(EuerkaApplication7001.class);
    }
}
