package com.example.zuulserver;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppUtils implements ApplicationListener<ApplicationReadyEvent> {


    @Override
    public void onApplicationEvent(final ApplicationReadyEvent applicationReadyEvent) {
        System.out.println("my zuul is ready");
    }
}
