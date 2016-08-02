package com.kevin.ambiguity;

import org.springframework.stereotype.Component;

/**
 * Created by chenkevin on 8/1/16.
 */
@Component
public class Cookies implements Dessert {
    public void eatDessert() {
        System.out.println("I want to eat Cookies!");
    }
}
