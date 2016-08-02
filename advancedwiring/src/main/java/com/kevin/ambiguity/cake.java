package com.kevin.ambiguity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by chenkevin on 8/1/16.
 */
@Component
//@Primary
@Qualifier
public class cake implements Dessert {
    public void eatDessert() {
        System.out.println("I want to eat cake!");
    }
}
