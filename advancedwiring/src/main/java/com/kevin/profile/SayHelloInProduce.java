package com.kevin.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by chenkevin on 8/1/16.
 */
@Component
@Profile("produce")
public class SayHelloInProduce implements HelloService {
    public void sayHello() {
        System.out.println("Hello! Produce");
    }
}
