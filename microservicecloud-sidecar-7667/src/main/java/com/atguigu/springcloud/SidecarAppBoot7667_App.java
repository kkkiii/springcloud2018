package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;


@SpringBootApplication
@EnableSidecar
public class SidecarAppBoot7667_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(SidecarAppBoot7667_App.class, args);
	}
}
