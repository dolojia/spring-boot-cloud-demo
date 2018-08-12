package com.dolo.monitorserver;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * 监控中心
 */
@SpringBootApplication
//注册到eureka
@EnableEurekaClient
//开启AdminServer
@EnableAdminServer
//开启turbineå
@EnableTurbineStream
public class MonitorServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitorServerApplication.class, args);
	}
}
