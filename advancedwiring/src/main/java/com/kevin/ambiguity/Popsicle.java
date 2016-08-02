package com.kevin.ambiguity;

import com.kevin.ambiguity.annotation.Cold;
import com.kevin.ambiguity.annotation.Pop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by chenkevin on 8/1/16.
 */
@Component
//@Qualifier("cold")
@Cold
@Pop
public class Popsicle implements Dessert {
    public void eatDessert() {
        System.out.println("I want to eat popsicle!");
    }
}
