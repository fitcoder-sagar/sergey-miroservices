package com.learning.spring.account_mgmt_ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountMgmtWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMgmtWsApplication.class, args);
		System.out.println("*************------ User-Ws AccountMgmt Application  ------**********************");

	}

}
