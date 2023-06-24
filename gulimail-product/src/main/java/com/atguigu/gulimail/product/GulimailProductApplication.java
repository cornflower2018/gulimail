package com.atguigu.gulimail.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 整合Mybatis-Plus
 * 1、导入依赖
 * 2、配置
 *    1、配置数据源
 *       1、导入数据库驱动
 *       2、在application.yml配置数据源相关信息
 *    2、配置Mybatis-Plus
 *       1、使用MapperScan
 *       2、告诉Mybatis-Plus,sql映射文件位置
 */

@MapperScan("com.atguigu.gulimail.product.dao")
@SpringBootApplication
public class GulimailProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimailProductApplication.class, args);
    }

}
