package com.example.zuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@EnableZuulProxy
@RefreshScope
@EnableDiscoveryClient
public class ZuulserverApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZuulserverApplication.class, args);
    }


}
