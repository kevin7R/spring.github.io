package com.kevin.condition;

import com.kevin.conditon.MagicBean;
import com.kevin.conditon.MagicConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chenkevin on 8/1/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagicConfig.class)
public class MagicTest {

    @Autowired
    private MagicBean magicBean;

    @Test
    public void testMagic() {
        magicBean.doMagic();
    }
}
