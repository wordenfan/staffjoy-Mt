package xyz.staffjoy.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//指定Feign应该扫描的包
@EnableFeignClients(basePackages = {"xyz.staffjoy.mail", "xyz.staffjoy.bot", "xyz.staffjoy.company"})
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }
}

