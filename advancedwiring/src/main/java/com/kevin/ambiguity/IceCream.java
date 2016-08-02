package com.kevin.ambiguity;

import com.kevin.ambiguity.annotation.Cold;
import com.kevin.ambiguity.annotation.IC;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by chenkevin on 8/1/16.
 */
@Component
//@Qualifier("cold")
@Cold
@IC
public class IceCream implements Dessert {
    public void eatDessert() {
        System.out.println("I want to eat IceCream!");
    }
}
