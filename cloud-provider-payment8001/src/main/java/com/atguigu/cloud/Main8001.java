package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author Zhanye
 * @since ${YEAR}/${MONTH}/${DAY} ${TIME}
 */
@SpringBootApplication
@MapperScan("com.atguigu.cloud.mapper")
@EnableDiscoveryClient
public class Main8001 {
    public static void main(String[] args){
        SpringApplication.run(Main8001.class,args);
    }
}