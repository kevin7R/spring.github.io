package com.kevin.profile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chenkevin on 8/1/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = profileConfig.class)
@ActiveProfiles("produce")
public class SayHelloTest {

    @Autowired
    HelloService helloService;

    @Test
    public void testSayHello() {
        helloService.sayHello();
    }

}
