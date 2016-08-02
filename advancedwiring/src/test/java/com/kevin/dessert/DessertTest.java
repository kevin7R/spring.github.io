package com.kevin.dessert;

import com.kevin.ambiguity.Dessert;
import com.kevin.ambiguity.DessertConfig;
import com.kevin.ambiguity.annotation.Cold;
import com.kevin.ambiguity.annotation.IC;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chenkevin on 8/1/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class DessertTest {
    @Autowired
    //@Qualifier("iceCream")
    @Cold
    @IC
    private Dessert dessert;

    @Test
    public void testEatDessert() {
        dessert.eatDessert();
    }
}
