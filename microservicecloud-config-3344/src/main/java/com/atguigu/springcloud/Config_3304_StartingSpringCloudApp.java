package com.atguigu.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@SpringBootApplication
@EnableConfigServer
public class Config_3304_StartingSpringCloudApp {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Config_3304_StartingSpringCloudApp.class, args);
	}
}
