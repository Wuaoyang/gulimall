package com.atguigu.gulimall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * # 想要远程调用别的服务
 * 	1 引入open-feign
 * 	2 编写一个接口，告诉SpringCloud这个接口需要调用远程服务
 * 	3 声明接口中每个方法都是调用哪个远程服务的哪个请求
 * 	4 开启远程调用功能 @EnableFeignClients(basePackages = "xxx")
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.atguigu.gulimall.menber.feign")
public class GulimallMenberApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallMenberApplication.class, args);
	}

}
