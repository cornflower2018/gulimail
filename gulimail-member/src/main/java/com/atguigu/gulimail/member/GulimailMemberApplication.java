package com.atguigu.gulimail.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**想要远程调用别的服务
 * 1、引入open-feign
 * 2、编写一个接口，告诉spingcloud这个接口需要调用远程服务
 *    声明接口的每一个方法都是调用远程服务的哪个请求
 * 3、开启远程调用功能
 *
 */
@EnableFeignClients(basePackages = "com.atguigu.gulimail.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimailMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailMemberApplication.class, args);
    }

}
